package Advanced;

import java.util.ArrayList;
import java.util.Random;

public class BitwiseOperations {
	
	public static void main(String[] args) {
//		int x = 100;
//		System.out.println(Integer.toBinaryString(x));
//		BitwiseOperations.binaryAddition(1, 3);
		
		//
//		andOperator();
		
		Random rand = new Random();
		
		long normalSwapDuration = 0;
		long bitwiseSwapDuration = 0;
		int count = 0;
		
		for(int i = 0; i < 100000000; i++) {
			
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			
			long startNormal = System.currentTimeMillis();
					
			int c_normal = normalSwap(a, b);
			
			long endNormal = System.currentTimeMillis();
			
			
			long startBitwise = System.currentTimeMillis();
			
			ArrayList<Integer> c_list = bitwiseSwap(a, b);		
			
			long endBitwise = System.currentTimeMillis();
			
			if (c_normal == c_list.get(0)) {
				count++;
				normalSwapDuration = normalSwapDuration + (endNormal - startNormal);
				bitwiseSwapDuration = bitwiseSwapDuration + (endBitwise - startBitwise);
			}
		}
		System.out.println("Count is: " + count);
		System.out.println("Normal swap took: " + normalSwapDuration + " milliseconds");
		System.out.println("Bitwise swap took: " + bitwiseSwapDuration + " milliseconds");
		
	}
	
	public static int binaryAddition(int first, int second) {
		first = first ^ second;
		second = first ^ second;
		first = first ^ second;
		return first;
	}
	
	
	public static void andOperator() {
		int a = 60;
		int b = 13;
		int c = a & b;
		
		System.out.println("Variables a and b have bit values of : " + Integer.toBinaryString(a) + " " + Integer.toBinaryString(b));
		
		System.out.println("AND operator produces value: " + c + " with bit value of: " + Integer.toBinaryString(c));
	}
	
		
	/*
	 * Comparison test of swapping values in variables
	 */
	public static int normalSwap(int first, int second) {
		int swap = first;
		first = second;
		second = swap;
		return first;
	}
	
	public static ArrayList<Integer> bitwiseSwap(int first, int second) {
		first = first ^ second;
		second = first ^ second;
		first = first ^ second;
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(first);
		answer.add(second);
		return answer;
	}
}


