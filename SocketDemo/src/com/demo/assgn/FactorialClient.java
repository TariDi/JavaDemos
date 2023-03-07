package com.demo.assgn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FactorialClient{
	
	public static void main(String args[]) {
		String serverName = args[0];
		int portNo = Integer.parseInt(args[1]);
		try {
			Socket client = new Socket(serverName,portNo);
			System.out.println("Connection established with server "+client.getRemoteSocketAddress());
			
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			
			while(true) {
				System.out.println(in.readUTF());
				Scanner sc = new Scanner(System.in);
				int number = sc.nextInt();
				out.writeInt(number);
				System.out.println(in.readUTF());
				System.out.println(in.readUTF());
				String ans = sc.next();
				out.writeUTF(ans);
				if(ans.equals("y"))
					break;
			}
			client.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You have quit the session");
		
	}

}
