package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Request {
	
	public Request(Socket s) throws IOException {
		Socket socket = s;
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		if (in.ready()){
			System.out.println("есть");
		}else{
			System.out.println("нету");
		}
		
		System.out.println("2");
		System.out.println(in.readLine());
		
	
	}
}
