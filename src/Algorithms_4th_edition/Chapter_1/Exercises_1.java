package Algorithms_4th_edition.Chapter_1;

import java.util.Scanner;

public class Exercises_1 {
	
	public Exercises_1() {
		
	}
	
	public static void main(String args[]) {
		Exercises_1 exercise = new Exercises_1();
		exercise.printAnswer111();
		exercise.printAnswer112();
		exercise.printAnswer113();
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
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first integer value: ");
		int num1 = in.nextInt();
		System.out.print("Enter second integer value: ");
		int num2 = in.nextInt();
		System.out.print("Enter third integer value: ");
		int num3 = in.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		System.out.println();
	}
	

}
