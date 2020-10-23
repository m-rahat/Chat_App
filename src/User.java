import java.util.*;
import java.io.*;
import java.net.*;

public class User implements Runnable{

	Socket socket;
	String name = "";
	
	User(String n, Socket s){
		name = n;
		socket = s;
	}//User
	
	@Override
	public void run() {
		
		while(true) {
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			try {
				OutputStream os = socket.getOutputStream();
				os.write(s.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
		
	}//run
	
	public static void main(String [] args) {
		
	}//main

}//user
