package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		String serverName = args[0];
		int portNo = Integer.parseInt(args[1]);
		
		try {
			Socket client = new Socket(serverName,portNo);
			System.out.println("Connection established with server: "+client.getRemoteSocketAddress());
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String str = null;
			
			while(true){
				
				Scanner sc = new Scanner(System.in);
				str = sc.nextLine();
				sc.nextLine();
				out.writeUTF(str);
				if(str.equals("quit"))
					break;
				
				System.out.println("Server says: "+in.readUTF());
			}
			System.out.println("You have quit");
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
