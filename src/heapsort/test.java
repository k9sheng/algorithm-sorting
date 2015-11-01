package heapsort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class test {

	@Test
	public void test_basic() {
		
		int[] nums1 = new int[]{1,2,3,4,5,7,8,9};
		int[] nums2 = new int[]{9,8,7,6,5,4,3,2,1};
		int[] nums3 = new int[]{25,1,45,18,66,72,1,55,99,53,23};
		
		int[] copy1 = nums1.clone();
		int[] nums1_copy = nums1.clone();
		Arrays.sort(copy1);
		heapsort.sort_asc(nums1);
		assertTrue(Arrays.equals(nums1,copy1));
		reverseArray(copy1);
		heapsort.sort_desc(nums1_copy);
		assertTrue(Arrays.equals(nums1_copy,copy1));
		
		int[] copy2 = nums2.clone();
		int[] nums2_copy = nums2.clone();
		Arrays.sort(copy2);
		heapsort.sort_asc(nums2);
		assertTrue(Arrays.equals(nums2,copy2));
		reverseArray(copy2);
		heapsort.sort_desc(nums2_copy);
		assertTrue(Arrays.equals(nums2_copy,copy2));
		
		int[] copy3 = nums3.clone();
		int[] nums3_copy = nums3.clone();
		Arrays.sort(copy3);
		heapsort.sort_asc(nums3);
		assertTrue(Arrays.equals(nums3,copy3));
		reverseArray(copy3);
		heapsort.sort_desc(nums3_copy);
		assertTrue(Arrays.equals(nums3_copy,copy3));
		
	}
	
	private void reverseArray(int[] nums){
		for(int i=0; i<nums.length/2; i++){
			int tmp = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = tmp;
		}
	}

}
