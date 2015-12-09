package radixsort;

import java.util.Arrays;

public class radixsort {
	
	private static final int base = 10;
	
	public static void sort(int[] nums){
		if(nums==null || nums.length==1) return;
		
		int max = getMax(nums);
		
		for(int tens=1; max/tens>0; tens*=10){
			countSort(nums,tens);
		}
	}
	
	private static int getMax(int[] nums){
		if(nums.length==1) return nums[0];
		
		int res = nums[0];
		
		for(int n:nums){
			res = n>res? n:res;
		}
		
		return res;
	}
	
	private static void countSort(int[] nums, int tens){
		int len = nums.length;
		int[] res = new int[len];
		int[] count = new int[base];
		Arrays.fill(count, 0);
		
		for(int i=0; i<len; i++){
			//tens used to get to current digit, then get exact value with %
			count[(nums[i]/tens)%10]++;
		}
		
		for(int i=1; i<base; i++){
			//accumulate count to use later deciding new order
			count[i]+=count[i-1];
		}
		
		for(int i=len-1; i>=0; i--){
			res[ count[(nums[i]/tens)%10] - 1 ] = nums[i];
			count[(nums[i]/tens)%10]--;
		}
		
		for(int i=0; i<len; i++){
			nums[i] = res[i];
		}
	}
}
