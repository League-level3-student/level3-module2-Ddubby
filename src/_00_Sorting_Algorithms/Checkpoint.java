package _00_Sorting_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

public class Checkpoint {
	public static void main(String[] args) {
		double[] doubles = new double[5];
		doubles[0] = 0.0;
		doubles[1] = 5.5;
		doubles[2] = 3.3;
		doubles[3] = 4.4;
		doubles[4] = 2.2;
		sort(doubles);
		assertEquals(4.4, doubles[3], 0);
		assertEquals(2.2, doubles[1], 0);
		int[] ints = new int[5];
		ints[0] = 0;
		ints[1] = 2;
		ints[2] = 5;
		ints[3] = 4;
		ints[4] = 3;
		assertTrue(search(ints, 5));
		assertFalse(search(ints, 10));
	}

	static void sort(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				double temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				if (i == 0) {
					i -= 1;
				} else {
					i -= 2;
				}
			}
		}
	}

	static boolean search(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return true;
			}
		}
		return false;
	}
}
