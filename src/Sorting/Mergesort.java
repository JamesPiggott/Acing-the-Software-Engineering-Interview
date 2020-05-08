package Sorting;


/**
 * A basic implementation of merge sort as applied to an array of Integers.
 * Note that compared to Quicksort this sorting algorithm requires copies of the original array.
 * 
 * How does it Merger sort work?
 * 
 * 
 * Running time: ?
 * Data movement: ?
 * 
 * @author James Piggott
 *
 */
public class Mergesort {
	
	private int[] arrayInts;
	private int[] helperArray;	
	private int length;

	public int[] sort(int[] arrayInts) {
		this.arrayInts = arrayInts;
		this.length = arrayInts.length;
		this.helperArray = new int[this.length];
		this.mergesort(0, this.length-1);
		return arrayInts;
	}
	
	public void mergesort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			
			// sort left of middle
			mergesort(low, middle);
			
			// sort right of middle
			mergesort(middle+1, high);
			
			// merge lists
			merge(low, middle, high);
		}	
	}
	
	public void merge(int low, int middle, int high){
		
		// copy array into helper array
		for (int i = low; i <= high; i++) {
			helperArray[i]= arrayInts[i];
		}
		
		int x = low;
		int y = middle+1;
		int z = low;
		
		while(x <= middle && y <= high) {
			if (helperArray[x] <= helperArray[y]) {
				arrayInts[z] = helperArray[x];
				x++;
			} else {
				arrayInts[z] = helperArray[y];
				y++;
			}
			z++;
		}
		
		while(x <= middle) {
			arrayInts[z] = helperArray[x];
			x++;
			z++;
		}
	}
}
