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
		
		System.out.println("Welcome to the world of instant chatting");
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String msg = in.nextLine();
			if (msg.equals("bye")) break;
			System.out.println("User: " + msg);
		}
		
		System.out.println("Program terminated");
		
	}//main

}//user
