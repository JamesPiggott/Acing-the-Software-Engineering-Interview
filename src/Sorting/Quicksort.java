package Sorting;

/**
 * Quicksort.
 * 
 * This is implementation of the Quicksort sorting algorithm as it applies to an array of Integer values.
 * 
 * Running time: ?
 * Data movement: ?
 * 
 * @author James Piggott.
 *
 */

public class Quicksort {
	
	public static void quicksort(int[] unsorted, int low, int high){
		if (low < high) {
			int p = partition(unsorted, low, high);
			quicksort(unsorted, low, p - 1);
			quicksort(unsorted, p + 1, high);
		}
	}
	
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		
		for (int j = low; j <= high; j++) {
			if (array[j] <= pivot) {
				i++;
				if (i != j) {
					int swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
		return i;
	}
}
