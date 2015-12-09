package radixsort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class test {
	@Test
	public void test_basic() {
		int[] nums1 = new int[]{1,2,3,4,5,7,8,9};
		int[] nums2 = new int[]{9,8,7,6,5,4,3,2,1};
		int[] nums3 = new int[]{251,1,425,198,666,772,10,555,9999,503,231};
		
		int[] copy1 = nums1.clone();
		Arrays.sort(copy1);
		radixsort.sort(nums1);
		assertTrue(Arrays.equals(nums1,copy1));
		
		int[] copy2 = nums2.clone();
		Arrays.sort(copy2);
		radixsort.sort(nums2);
		assertTrue(Arrays.equals(nums2,copy2));
		
		int[] copy3 = nums3.clone();
		Arrays.sort(copy3);
		radixsort.sort(nums3);
		assertTrue(Arrays.equals(nums3,copy3));

	}
}
