package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection implements Properties{
	
	
	public void startServer(){
		ServerSocket srvSocket = null;
		Socket fromSocket = null;
		
		try {
			srvSocket = new ServerSocket(Properties.port);
			
		} catch (IOException e) {
			System.out.println("Не удалось открыть порт : " + Properties.port);
			e.printStackTrace();
		} 
		
		try {
			fromSocket = srvSocket.accept();
			System.out.println("Client connected");
			Request c = new Request(fromSocket);	
			
			} catch (IOException e) {
				try {
					System.out.println("1122");
					fromSocket.close();
				} catch (IOException e1) {
					System.out.println("неудалось закрыть сокет");
					e1.printStackTrace();
				}
			
			}
			
		
	}

	
	
}
