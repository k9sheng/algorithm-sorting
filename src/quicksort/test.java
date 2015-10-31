package quicksort;

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
		Arrays.sort(copy1);
		quicksort.sort(nums1);
		assertTrue(Arrays.equals(nums1,copy1));
		
		int[] copy2 = nums2.clone();
		Arrays.sort(copy2);
		quicksort.sort(nums2);
		assertTrue(Arrays.equals(nums2,copy2));
		
		int[] copy3 = nums3.clone();
		Arrays.sort(copy3);
		quicksort.sort(nums3);
		assertTrue(Arrays.equals(nums3,copy3));

	}

}
