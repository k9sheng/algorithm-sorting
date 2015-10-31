package quicksort;

public class quicksort {
	
	public static void sort(int[] nums){
		if(nums==null || nums.length<2) return;
		sort(nums, 0, nums.length-1);
	}
	
	public static void sort(int[] nums, int start, int end){
		int i = start;
		int j = end;
		int pivot = nums[(i+j)/2];
		
		while(i<=j){
			while(nums[i]<pivot) i++;
			
			while(nums[j]>pivot) j--;
			
			if(i<=j){
				swap(nums, i, j);
				i++;
				j--;
			}
		}
		
		if(i<end) sort(nums, i, end);
		
		if(start<j) sort(nums, start, j);
	}
	
	private static void swap(int[] nums, int index1, int index2){
		int tmp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = tmp;
	}
}
