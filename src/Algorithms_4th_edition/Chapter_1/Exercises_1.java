package Algorithms_4th_edition.Chapter_1;

import java.util.Scanner;

public class Exercises_1 {
	
	private int n;

	public Exercises_1() {
		
	}
	
	public static void main(String args[]) {
		Exercises_1 exercise = new Exercises_1();
		exercise.printAnswer111();
		exercise.printAnswer112();
		exercise.printAnswer113();
		exercise.printAnswer114();
		exercise.printAnswer115();
		exercise.printAnswer116();
		exercise.printAnswer117();
		exercise.printAnswer118();
		exercise.printAnswer119();
		exercise.printAnswer1110();
		exercise.printAnswer1111();
		exercise.printAnswer1112();
//		exercise.printAnswer1113();
//		exercise.printAnswer1114();
		exercise.printAnswer1115();
		exercise.printAnswer1116();
	}
	
	public void printAnswer111() {
		System.out.println("Answers to question 1.1.1");
		System.out.println((0 + 15) / 2);
		System.out.println(2.0e-6 * 100000000.1);
		System.out.println(true && false || true && true);
		System.out.println();
	}
	
	public void printAnswer112() {
		System.out.println("Answers to question 1.1.2");
		
		Double answer1 = (1 + 2.236) / 2;
		System.out.println(answer1.getClass() + " " + answer1);

		Double answer2 = 1 + 2 + 3 + 4.0;
		System.out.println(answer2.getClass() + " " + answer2);
		
		Boolean answer3 = 4.1 >= 4;
		System.out.println(answer3.getClass() + " " + answer3);
		
		String answer4 = 1 + 2 + "3";
		System.out.println(answer4.getClass() + " " + answer4);
		
		System.out.println();
	}
	
	public void printAnswer113() {
		System.out.println("Answers to question 1.1.3");
		
//		Scanner in = new Scanner(System.in);
		System.out.println("Enter first integer value: ");
//		int num1 = in.nextInt();
		int num1 = 1;
		System.out.println("Enter second integer value: ");
//		int num2 = in.nextInt();
		int num2 = 1;
		System.out.println("Enter third integer value: ");
//		int num3 = in.nextInt();
		int num3 = 1;
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		System.out.println();
	}
	
	public void printAnswer114() {
		System.out.println("Answers to question 1.1.4");
		
		System.out.println("Then is not a Java keyword");
		System.out.println("If statement contains no round brackets");
		System.out.println("Is correct");
		System.out.println("No end of statement mark after c = 0");
		
		System.out.println();
	}
	
	public void printAnswer115() {
		System.out.println("Answers to question 1.1.5");
		
		double x = 0.1;
		double y = 0.9;
		if ((x > 0 && x < 1.0) && (y > 0 && y < 1.0)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println();
	}
	
	public void printAnswer116() {
		System.out.println("Answers to question 1.1.6");
		
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
		
		System.out.println();
	}
	
	public void printAnswer117() {
		System.out.println("Answers to question 1.1.7");
		
		// a
		double t = 9.0;
		while(Math.abs(t - 9.0/t) > .001) {
			t = (9.0/t + t) / 2.0;
		}
		System.out.printf("%.5f\n", t);
		
		// b
		int sum = 0;
		for(int i = 1; i < 1000; i++) 
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);

		// c
		sum = 0;
		for(int i = 1; i < 1000; i *= 2) 
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);
		
		System.out.println();
	}
	
	public void printAnswer118() {
		System.out.println("Answers to question 1.1.8");
		
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));

		
		System.out.println();
	}
	
	public void printAnswer119() {
		System.out.println("Answers to question 1.1.9");
		
		int rem = 0;
		int N = 20;
		String s = "";

		for (int n = N; n > 0; n /= 2)
			rem = n % 2;
			if (rem == 1) {
				s = "0" + s;
			} else {
				s = "1" + s;
			}

		System.out.println(s);
		
		System.out.println();
	}
	
	public void printAnswer1110() {
		System.out.println("Answers to question 1.1.10");
		
//		int[] a;
//		for(int i = 0; i < 10; i++) {
//			a[i] = i * i;
//		}
		System.out.println("The local variable a may not have been initialized");

		
		System.out.println();
	}

	public void printAnswer1111() {
		System.out.println("Answers to question 1.1.11");
		
		char[][] array = new char[2][2];
		array[0][0] = '*';
		array[1][1] = '*';
		array[0][1] = ' ';
		array[1][0] = ' ';
		
		for(int i = 0 ; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				if(array[i][j] == '*') {
					System.out.println(true);
				} else if(array[i][j] == ' ') {
					System.out.println(false);
				}
			}
		}

		System.out.println();
	}
	
	public void printAnswer1112() {
		System.out.println("Answers to question 1.1.12");
		
		int[] a = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = 9 - i;
		}
		for(int i = 0; i < 10; i++) {
			a[i] = a[a[i]];
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}

		System.out.println();
	}
	
	public void printAnswer1113() {
		System.out.println("Answers to question 1.1.13");
		
		int[][] array = {{1,2,3},{4,5,6}};
		int[][] trans = new int[array[0].length][array.length];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				trans[j][i] = array[i][j];
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.println(trans[i][j]);
			}
		}

		System.out.println();
	}
	
	public void printAnswer1114() {
		System.out.println("Answers to question 1.1.14");
		
		System.out.println(lg(1));
		System.out.println(lg(2));
		System.out.println(lg(4));

		System.out.println();
	}
	
	public static int lg(int value) {
		
		int count = 0;
		while(true) {
			int result = 0;
			for(int i = 1; i <= count; i++) {
				result = 2 * result;
			}
			if (result > value) {
				break;
			} else {
				count++;
			}
		}
		
		System.out.println("Test :" + (count - 1));
		
		return 0;
	}
	
	public void printAnswer1115() {
		System.out.println("Answers to question 1.1.15");
		
		int[] array = {2,2,3,3,5,6};
			
		int[] result = histogram(array, 5);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println();
	}
	
	public static int[] histogram(int[] a, int m) {
		int[] histogram = new int[m];
				
		for (int i = 0; i < a.length; i++) {
			int entry = a[i];			
			if (entry < histogram.length) {
				int value = histogram[entry];
				value = value + 1;
				histogram[entry] = value;	
			}
		}
		return histogram;	
	}
	
	public void printAnswer1116() {
		System.out.println("Answers to question 1.1.16");
		
		System.out.println(exR1(6));
		
		System.out.println();
	}
	
	public static String exR1(int n) {
		if (n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
}
