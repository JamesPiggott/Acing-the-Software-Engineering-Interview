package Sorting;

import org.junit.Test;

public class TestSelection {

	@Test
	public void test() {
		String[] letterarray = "testingselectionsort".split("");
		Selection.sort(letterarray);
		assert Selection.isSorted(letterarray);
		Selection.show(letterarray);
	}
}
