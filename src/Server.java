import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
	
	
    public static void main(String[] args) throws IOException {
    
    	
    	int port = 5000;
        	
    	ServerSocket serverSocket = new ServerSocket(port);
    	
    	Socket clientSocket = serverSocket.accept();
    	
    	System.out.println("Start chatting now");
    	
    	ReceiverThread rt = new ReceiverThread(clientSocket);
    	SenderThread st = new SenderThread(clientSocket);
    	
    	rt.start();
    	st.start();
    	
    	serverSocket.close();
    	
    }//main
    
    
    
}//className