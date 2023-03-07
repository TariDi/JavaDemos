package com.demo.assgn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer extends Thread{
	private int number;
	
	public static int factorialOfN(int n) {
		int factorial = 1;
		for(int i=n;i>0;i--) {
			factorial*=i;
		}
		return factorial;
	}
	
	public void run() {
		factorialOfN(number);
	}
	
	public static void main(String args[]) {
		ServerSocket sockServ = null;
		Socket server = null;
		
		try {
			sockServ = new ServerSocket(6068);
			System.out.println("Listening for client on port "+sockServ.getLocalPort());
			server = sockServ.accept();
			System.out.println("Connection established with client "+server.getRemoteSocketAddress());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			in = new DataInputStream(server.getInputStream());
			out = new DataOutputStream(server.getOutputStream());
			while(true) {
				out.writeUTF("Server says: Enter a number");
				int number = in.readInt();
				out.writeUTF("Server says: "+number+"! = "+factorialOfN(number));
				out.writeUTF("Server says: quit?(y/n)");
				if(in.readUTF().equals("y"))
					break;
			}
			System.out.println("Client has quit");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
