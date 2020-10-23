import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class Client {
	
	/*
	 * writer.println sends msg from client to server
	 * output.write sends msg from server to client
	 * 
	 * readerlreadline reads msg from client to server
	 * reader.readline reads msg from server to client
	 */
	
    public static void main(String[] args) throws IOException {

    	String hostName = "207.237.10.159";
//    	String hostName = "localhost";
    	int port = 5000;
    	
    	Socket socket = new Socket(hostName, port);
    	
    	if (socket.isConnected()) System.out.println("connection successful");
    	else System.out.println("unsuccessful");
    	
    	System.out.println("You can type in your chat messages now");
    	
    	InputStream input = socket.getInputStream();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    	
    	OutputStream output = socket.getOutputStream();
    	PrintWriter writer = new PrintWriter(output, true);
    	
    	ReceiverThread rt = new ReceiverThread(socket);
    	SenderThread st = new SenderThread(socket);
    	
    	rt.start();
    	st.start();
    	
    	
    }//main
    
}//Client