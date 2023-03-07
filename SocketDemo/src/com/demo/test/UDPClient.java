package com.demo.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static final int CLIENT_PORT = 9831;
	
	public static void main(String[] args) {
		if(args.length!=1) {
			System.err.println("Input correct no. of arguments");
			System.exit(0);
		}
		DatagramSocket sock = null;
		try {
			sock = new DatagramSocket(CLIENT_PORT);
		
		byte[] recvBuffer = new byte[1024];
		DatagramPacket recvPacket = new DatagramPacket(recvBuffer,recvBuffer.length);
		
		Scanner console = new Scanner(System.in);
		System.out.print("Message: ");
		String str = console.nextLine();
		
		InetAddress[] addrList = InetAddress.getAllByName(args[0]);
		
		byte[] buffer = str.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, addrList[0], UDPServer.SERVER_PORT);
		
		sock.send(sendPacket);
		sock.receive(recvPacket);
		String response = new String(recvBuffer, 0, recvPacket.getLength());
		System.out.println("Response: "+response);
		
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
