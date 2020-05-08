package Advanced;

import java.util.Random;

import org.junit.Test;

public class TestBitwiseOperations {
	
	@Test
	public void test() {
				
		long beginFirstTest = System.currentTimeMillis();
		
		for (int i = 0; i < 100000000; i++) {
			Random r = new Random();
			
			int randomfirst = r.nextInt(1000);
			int randomsecond = r.nextInt(1000);
					
			BitwiseOperations.binaryAddition(randomfirst, randomsecond);
		}
		
		long endFirstTest = System.currentTimeMillis();
		
		System.out.println("First test took: " + (endFirstTest - beginFirstTest) + " miliseconds");
		
		long beginSecondTest = System.currentTimeMillis();

		for (int i = 0; i < 100000000; i++) {	
			Random r2 = new Random();
			
			int randomthird = r2.nextInt(1000);
			int randomfourth = r2.nextInt(1000);
			
			BitwiseOperations.normalSwap(randomthird, randomfourth);
		}
		
		long endSecondTest = System.currentTimeMillis();
		
		System.out.println("Second test took: " + (endSecondTest - beginSecondTest) + " miliseconds");
	}
}
