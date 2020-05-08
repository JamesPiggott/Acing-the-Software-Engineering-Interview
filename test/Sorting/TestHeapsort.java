package Sorting;

import java.util.Random;

import org.junit.Test;

public class TestHeapsort {
	
	@Test
	public void simpleTest() {
		Integer[] unsorted = new Integer[]{7, 3, 8, 2, 1, 9, 4, 6, 5, 0};
		
		Heapsort.sort(unsorted);
	
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}
		
	}
	
	@Test
	public void largeTest() {
		
		Integer[] unsorted = new Integer[1000];		
		
		boolean alreadyContains = false;
		for (int i = 0; i < unsorted.length; i++) {
			
			while (true) {
				Random r = new Random();
				
				int randomInt = r.nextInt(2000);
				
				for (int j = 0; j <= i; j++) {
					if (unsorted[j] != null) {
						if (unsorted[j] == randomInt) {
							alreadyContains = true;
						}
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
		
		Heapsort.sort(unsorted);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(unsorted[i] + " ");
		}
		
	}

}
