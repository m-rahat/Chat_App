import java.util.*;
import java.net.*;
import java.io.*;

public class SenderThread extends Thread{

	Socket socket;
	
	public SenderThread(Socket s) {
		socket = s;
	}//ReceiverThread
	
	public void run(){
		
		try {
		
    	InputStream input = socket.getInputStream();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    	
    	OutputStream output = socket.getOutputStream();
    	PrintWriter writer = new PrintWriter(output, true);
		
    	Scanner in = new Scanner(System.in);
    	
		while(true) {
			String msg = in.nextLine();
			if (msg.equals("bye")) break;
			writer.println(msg);
		}//while
		
		System.out.println("Receiver Thread for Server closing...");
		socket.close();
		
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		
	}//run
	
}//SenderThread
