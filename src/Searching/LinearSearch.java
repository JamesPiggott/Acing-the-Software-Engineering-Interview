package Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {
		Random r = new Random();
		int arraySize = 100000;
		int[] array = new int[arraySize];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		while (count < arraySize) {
			int randomInt = r.nextInt(2 * arraySize);
			boolean notInclude = false;
			for (int i = 0; i < arraySize; i++) {
				if (array[i] == randomInt) {
					notInclude = true;
				}
			}
			if (notInclude == false) {
				array[count] = randomInt;
				list.add(randomInt);
				count++;
			}

		}
		
		int intNotUsed = 0;
		boolean notPresent = true;
		while (notPresent) {
			int random = r.nextInt(2 * arraySize);
			for (int i = 0; i < arraySize; i++) {
				if (array[i] == random) {
					notPresent = false;
					intNotUsed = random;
				}
			}
		}
		
		long timestampBegin = System.currentTimeMillis();
		
		for (int i = 0; i < arraySize; i++) {
			if (array[i] == intNotUsed) {
				System.out.println("I have found: " + intNotUsed + " after " + i + " searches");
				break;
			}
		}
		
		long timestampEnd = System.currentTimeMillis();
		
		System.out.println("Time to search array[] is: " + (timestampEnd - timestampBegin));
		
		long timestamp2Begin = System.currentTimeMillis();

		for(int j = 0; j < list.size(); j++) {
			if (list.get(j) == intNotUsed) {
				System.out.println("I have found: " + intNotUsed + " after " + j + " searches");
				break;
			}
		}
		
		long timestamp2End = System.currentTimeMillis();
		
		System.out.println("Time to search ArrayList is: " + (timestamp2End - timestamp2Begin));
		
		
		Collections.sort(list);
		
		
		long timestamp3Begin = System.currentTimeMillis();

		for(int j = 0; j < list.size(); j++) {
			if (list.get(j) == intNotUsed) {
				System.out.println("I have found: " + intNotUsed + " after " + j + " searches");
				break;
			}
		}
		
		long timestamp3End = System.currentTimeMillis();
		
		System.out.println("Time to search sorted ArrayList is: " + (timestamp3End - timestamp3Begin));
		
		
	}
}
