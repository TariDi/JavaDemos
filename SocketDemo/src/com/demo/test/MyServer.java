package com.demo.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class MyServer {

	public static void main(String[] args) {
		ServerSocket servSock = null;
		Socket server = null;
		
		try {
			servSock = new ServerSocket(6068);
			System.out.println("Waiting for client on port "+servSock.getLocalPort());
			server = servSock.accept();
			System.out.println("Connection established with client: "+server.getRemoteSocketAddress());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			in = new DataInputStream(server.getInputStream());
			out = new DataOutputStream(server.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = "temp";
		try {
			while(true){
				str = in.readUTF();
				System.out.println("Client says: "+str);
				if(str.equals("quit"))
					break;
				System.out.println("Enter String:");
				Scanner sc = new Scanner(System.in);
				String str1 = sc.nextLine();
				//sc.nextLine();
				out.writeUTF(str1);
			}
			System.out.println("Client has quit");
			//str = in.readUTF();
			//System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
