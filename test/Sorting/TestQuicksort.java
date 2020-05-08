package Sorting;

import java.util.Random;

import org.junit.Test;

public class TestQuicksort {
	
	@Test
	public void simpleTest() {
		int[] unsorted = new int[]{7, 3, 8, 2, 1, 9, 4, 6, 5, 0};
		
		Quicksort.quicksort(unsorted, 0, 9);
	
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}
		
	}
	
	@Test
	public void largeTest() {
		
		int[] unsorted = new int[1000];		
		
		boolean alreadyContains = false;
		for (int i = 0; i < unsorted.length; i++) {
			
			while (true) {
				Random r = new Random();
				
				int randomInt = r.nextInt(2000);
				
				for (int j = 0; j <= i; j++) {
					
					if (unsorted[j] == randomInt) {
						alreadyContains = true;
					}
					
				}
				
				if (alreadyContains == false) {
					unsorted[i] = randomInt;
					break;
				} else {
					alreadyContains = false;
				}
			}

		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(unsorted[i] + " ");
		}
		System.out.println();
		
		Quicksort.quicksort(unsorted, 0, 999);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(unsorted[i] + " ");
		}
		
	}

}
