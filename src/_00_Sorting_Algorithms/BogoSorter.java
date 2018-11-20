package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while(!isSorted(array)) {
			shuffle(array);
			display.updateDisplay();
	}
	}
	void shuffle(int[] n) {
		Random random = new Random();
		int num = random.nextInt(n.length);
		Random random2 = new Random();
		int num2 = random2.nextInt(n.length);
		int temp = n[num];
		n[num] = n[num2];
		n[num2] = temp;
	}
	boolean isSorted(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			if(n[i] > n[i + 1]){
				return false;
			}
	}
		return true;
}
}
