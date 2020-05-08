package Network.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	
    public static void main(String argv[]) throws Exception {
    	String clientMessage;
          
        @SuppressWarnings("resource")
        ServerSocket Socket = new ServerSocket(1337);
        Socket connectionSocket = Socket.accept();
        System.out.println("Client connected");
          
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
          
        while(true) {
        	clientMessage = inFromClient.readLine();
        	System.out.println("Received message: " + clientMessage);

        	outToClient.writeChars(clientMessage);
             
        	System.out.println("Message sent back to client");
        }
    }

}
