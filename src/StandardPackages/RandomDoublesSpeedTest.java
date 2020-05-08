package StandardPackages;

import java.util.Random;

/**
 * A simple speed test to see how long it will take to multiply Random Double's
 * 
 * @author James
 *
 */

public class RandomDoublesSpeedTest {
	
	
	public static void main(String[] args) {

		long timestampBegin = System.currentTimeMillis();
		
		Random r = new Random();
		for (int i = 0; i < 100000000; i++) {
			Double total = r.nextDouble() + r.nextDouble();
		}
		
		long timestampEnd = System.currentTimeMillis();
		
		System.out.println("Time taken is: " + (timestampEnd - timestampBegin));
		
		
		// Another test with no Random Double's
		
		long timestamp2Begin = System.currentTimeMillis();

		for (int i = 0; i < 100000000; i++) {
			Double total = 2.0 + 4.0;
		}
		
		long timestamp2End = System.currentTimeMillis();
		
		System.out.println("Time taken is: " + (timestamp2End - timestamp2Begin));
		
		
	}

}
