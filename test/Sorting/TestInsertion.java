package Sorting;

import org.junit.Test;

public class TestInsertion {
	
	@Test
	public void test() {
		String[] letterarray = "testingselectionsort".split("");
		Insertion.sort(letterarray);
		assert Insertion.isSorted(letterarray);
		Insertion.show(letterarray);
	}

}
