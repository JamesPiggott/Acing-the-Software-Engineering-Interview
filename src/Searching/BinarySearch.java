package Searching;

/**
 * Implementation of the Binary Search algorithm
 * The algorithm searches for Integers in an Integer array
 * The array searched must already be sorted!
 * 
 * @author James Piggott
 *
 */

public class BinarySearch {
	
	int[] arrayOfInts;
	
	public BinarySearch(int[] arrayOfInts) {
		this.arrayOfInts = arrayOfInts;
	}
	
	public boolean searchForInt(Integer number) {
		
		// an empty array cannot be searched
		if (arrayOfInts.length == 0) {
			return false;
		}
 
		// set the boundaries of the array to be searched
		int low = 0;
		int high = arrayOfInts.length - 1;
		
		// when number is not in array
		while (low <= high) {
			int middle = (low + high) / 2;
			
			// check if value has been found, or else change the boundaries of the array			
			if (number > arrayOfInts[middle]) {
				low = middle + 1;
			} else if (number < arrayOfInts[middle]) {
				high = middle - 1;
			} else {
				return true;
			}	
		}
		// if the number is not part of the array
		return false;
	}
}
