package Sorting;

import StandardPackages.StdIn;
import StandardPackages.StdOut;

/**
 * Insertion sort.
 * 
 * Iterate through each item in the array and swap it in the left side of the 'ordered' array,
 * as long as the value is less than the value it is compared with.
 * 
 * Running time: (N * N) / 2 compares
 * Data movement: N exchanges
 * 
 * @author James Piggott.
 *
 */

public class Insertion {
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
			}
		}
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i-1])){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		StdOut.println("Starting selection sort");
		String[] a = StdIn.readAllStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
