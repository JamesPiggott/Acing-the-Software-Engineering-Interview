package Sorting;

/**
 * Heapsort.
 * 
 * This is implementation of the Heapsort sorting algorithm as it applies to an array of Integer values.
 * 
 * Running time: O(N log(N))
 * 
 * @author James Piggott.
 *
 */

public class Heapsort {
	
	public static void sort(Comparable[] unsorted) {
		int n = unsorted.length;
		
		// First place every element into a binary heap
		for (int k = n /2; k >= 1; k--) {
			sink(unsorted, k, n);
		}
		
		// Next, exchange every root element with the last and correct the binary heap
		while (n > 1) {
			exch(unsorted, 1, n--);
			sink(unsorted, 1, n);
		}	
	}
	
	/* Ensures that the root element will be put in its proper place in the tree */
	public static void sink(Comparable[] unsorted, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(unsorted, j, j+1)) j++;
            if (!less(unsorted, k, j)) break;
            exch(unsorted, k, j);
            k = j;
        }
	}
	
	/* Checks if value k is less than j */
	public static boolean less(Comparable[] unsorted, int k, int j) {
		return unsorted[k-1].compareTo(unsorted[j-1]) < 0;
	}
	
	/* Exchange the root element (largest) with the last element */
	public static void exch(Comparable[] unsorted, int i, int j) {
		Comparable swap = unsorted[i-1];
        unsorted[i-1] = unsorted[j-1];
        unsorted[j-1] = swap;
	}
	
	public static void main(String[] args) {
		Integer[] unsorted = new Integer[]{7, 3, 8, 2, 1, 9, 4, 6, 5, 0};
		Heapsort.sort(unsorted);
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}	
	}
}
