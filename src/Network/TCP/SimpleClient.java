package Network.TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
	
	public static void main(String argv[]) throws InterruptedException {
		
		try {
			Socket socket = new Socket("localhost", 1337);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			boolean sending = true;
			int count = 0;
			while (sending) {
				
				out.println("Greetings Server!");
				if (count >= 4) {
					sending = false;
				} else {
					count++;
				}
				Thread.sleep(5000);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Socket connection could not be established");
		}
	}
}
