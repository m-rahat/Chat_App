import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
	
	
    public static void main(String[] args) throws IOException {
    
    	
    	int port = 5000;
        	
    	ServerSocket serverSocket = new ServerSocket(port);
    	
    	System.out.println("Server Started...");
 
    	Socket clientSocket = serverSocket.accept();
    	
    	System.out.println("The client IP is: " + clientSocket.getInetAddress());
    	
    	String msg = "Hamid bhai jindabaad";
    	
    	InputStream input = clientSocket.getInputStream();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    	
    	OutputStream output = clientSocket.getOutputStream();
    	PrintWriter writer = new PrintWriter(output, true);
    	output.write(msg.getBytes());
    	
    	
    	serverSocket.close();
    	
    	System.out.println("done server");
    	
    }//main
    
    
    
}//className