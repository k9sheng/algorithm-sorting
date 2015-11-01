package heapsort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class heapsort {
	
	public static void sort_asc(int[] nums){
		
		if(nums==null || nums.length<2) return;
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		for(int i=0; i<nums.length; i++){
			minHeap.add(nums[i]);
		}
		
		for(int i=0; i<nums.length; i++){
			int curMin = minHeap.remove();
			nums[i] = curMin;
		}
	}
	
	public static void sort_desc(int[] nums){
		
		if(nums==null || nums.length<2) return;
		
		int defaultSize = 5;
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(defaultSize, new Comparator<Integer>(){
			public int compare(Integer l, Integer r){
				if(l < r) return 1;
				else if(l == r) return 0;
				else return -1;
			}
		});
		
		for(int i=0; i<nums.length; i++){
			maxHeap.add(nums[i]);
		}
		
		for(int i=0; i<nums.length; i++){
			int curMax = maxHeap.remove();
			nums[i] = curMax;
		}
	}

}
