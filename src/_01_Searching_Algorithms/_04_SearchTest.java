package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {
	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] words = new String[3];
		words[0] = "a";
		words[1] = "b";
		words[2] = "c";
		assertEquals(_00_LinearSearch.linearSearch(words, "c"), 2);
		assertEquals(_00_LinearSearch.linearSearch(words, "a"), 0);
		assertEquals(_00_LinearSearch.linearSearch(words, "d"), -1);
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] ints = new int[3];
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		assertEquals(_01_BinarySearch.binarySearch(ints, 0, 2, 2), 2);
		assertEquals(_01_BinarySearch.binarySearch(ints, 0, 2, 3), -1);
		assertEquals(_01_BinarySearch.binarySearch(ints, 0, 2, 0), 0);
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] ints = new int[3];
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		int[] ints2 = new int[4];
		ints2[0] = 2;
		ints2[1] = 4;
		ints2[2] = 6;
		ints2[3] = 8;
		assertEquals(_02_InterpolationSearch.interpolationSearch(ints, 2), 2);
		assertEquals(_02_InterpolationSearch.interpolationSearch(ints2, 6), 2);
		assertEquals(_02_InterpolationSearch.interpolationSearch(ints2, 3), -1);
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] ints = new int[5];
		ints[0] = 0;
		ints[1] = 3;
		ints[2] = 5;
		ints[3] = 6;
		ints[4] = 9;
		assertEquals(_03_ExponentialSearch.exponentialSearch(ints, 5), 2);
		assertEquals(_03_ExponentialSearch.exponentialSearch(ints, 2), -1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(ints, 9), 4);
	}
}
