package Searching;

import org.junit.Test;

public class TestBinarySearch {
	
	@Test
	public void testArrayLength0() {
		int[] empty = new int[0];
		BinarySearch zero = new BinarySearch(empty);
		assert(zero.searchForInt(5) == false);
	}
	
	@Test
	public void testArrayWithNoValues() {
		int[] empty = new int[5];
		BinarySearch zero = new BinarySearch(empty);
		assert(zero.searchForInt(10) == false);
	}
	
	@Test
	public void testNormalRun() {
		int[] normalArray = new int[] {1,2,4,5,6,7,8};
		BinarySearch normalRun = new BinarySearch(normalArray);
		assert(normalRun.searchForInt(5) == true);
	}
	
	@Test
	public void testEntryNotInArray() {
		int[] normalArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		BinarySearch normalRun = new BinarySearch(normalArray);
		assert(normalRun.searchForInt(14) == false);
	}

}
