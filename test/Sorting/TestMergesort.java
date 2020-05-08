package Sorting;

import org.junit.Test;

public class TestMergesort {
	
	@Test
	public void simpleTest() {
		int[] unsorted = new int[]{7, 3, 8, 2, 1, 9, 4, 6, 5, 0};
		
		Mergesort merge = new Mergesort();
		int[] sorted = merge.sort(unsorted);
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}	
	}
}
