import java.util.*;
import java.net.*;
import java.io.*;

public class ReceiverThread extends Thread{
	
	Socket socket;
	
	public ReceiverThread(Socket s) {
		socket = s;
	}//ReceiverThread

	public void run(){
		
		try {
		
    	InputStream input = socket.getInputStream();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    	
    	OutputStream output = socket.getOutputStream();
    	PrintWriter writer = new PrintWriter(output, true);
    	

		
		while(true) {
			String msg = reader.readLine();
			if (msg.equals("bye")) break;
			System.out.println(msg);
		}//while
		
		System.out.println("Receiver Thread for Server closing...");
		socket.close();
		
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		
	}//run
	
}//ReceiverThread
