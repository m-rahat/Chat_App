import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class Client {
	
	
    public static void main(String[] args) throws IOException {

    	String hostName = "207.237.10.159";
    	int port = 5000;
    	
    	Socket socket = new Socket(hostName, port);
    	
    	if (socket.isConnected()) System.out.println("connection successful");
    	else System.out.println("unsuccessful");
    	
    	InputStream input = socket.getInputStream();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    	
    	OutputStream output = socket.getOutputStream();
    	PrintWriter writer = new PrintWriter(output, true);
    	
    	System.out.println(reader.readLine());
    	
    	System.out.println("done client");
    	
    }//main
    
}//Client