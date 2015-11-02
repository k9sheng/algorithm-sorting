package mergesort;

public class mergesort {
	
	public static void sort(int[] nums){
		if(nums.length == 1) return;
		
		int[] tmp = new int[nums.length];
		
		sort(nums,tmp,0,nums.length-1);
	}
	
	private static void sort(int[] nums, int[] tmp, int left, int right){
		if(left<right){
			int mid = (left+right)/2;
			sort(nums,tmp,left,mid);
			sort(nums,tmp,mid+1,right);
			merge(nums,tmp,left,mid+1,right);
		}
	}
	
	private static void merge(int[] nums, int[] tmp, int leftStart, int rightStart, int rightEnd){
		int leftEnd = rightStart - 1;
		int tmpIndex = leftStart;
		int size = rightEnd - leftStart + 1;
		int l = leftStart;
		int r = rightStart;
		
		while(l<=leftEnd && r<=rightEnd){
			if(nums[l]<=nums[r]){
				tmp[tmpIndex++] = nums[l++];
			}
			else{
				tmp[tmpIndex++] = nums[r++];
			}
		}
		
		while(l<=leftEnd){
			tmp[tmpIndex++] = nums[l++];
		}
		
		while(r<=rightEnd){
			tmp[tmpIndex++] = nums[r++];
		}
		
		for(int i=leftStart; i<leftStart+size; i++){
			nums[i] = tmp[i];
		}

	}

}
