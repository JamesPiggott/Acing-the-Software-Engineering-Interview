package Recursion;

public class TriangularNumbers {
	
	public TriangularNumbers(int number) {
		System.out.println(calculateTriangularNumber(number));
	}
	
	
	public static int calculateTriangularNumber(int number) {
		if (number == 1) {
			return number;
		} else {
			return number + calculateTriangularNumber(number-1);
		}
	}
	
	public static void main(String[] args) {
		TriangularNumbers triangle = new TriangularNumbers(6);
		TriangularNumbers triangle2 = new TriangularNumbers(5);
		TriangularNumbers triangle3 = new TriangularNumbers(7);
	}
}



