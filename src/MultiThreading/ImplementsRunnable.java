package MultiThreading;

import java.util.ArrayList;

public class ImplementsRunnable implements Runnable {
	
	public String instanceName;
	
	public ImplementsRunnable(String name) {
		this.instanceName = name;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<ImplementsRunnable> list = new ArrayList<ImplementsRunnable>();
		
		for (int i = 0; i < 1000; i++) {
			ImplementsRunnable test = new ImplementsRunnable("test" + i);
			test.run();
			list.add(test);
		}
		
		while (true) {
			
		}
	}

	@Override
	public void run() {
		while (true) {
			
		}
	}
}
