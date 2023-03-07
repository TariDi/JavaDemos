package com.demo.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static final int SERVER_PORT = 9832;
	
	public static void main(String[] args) {
		DatagramSocket sock = null;
		try {
			sock = new DatagramSocket(SERVER_PORT);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] recvBuffer = new byte[1024];
		DatagramPacket recvPacket = new DatagramPacket(recvBuffer,recvBuffer.length);
		
		try {
			sock.receive(recvPacket);
			String str = new String(recvBuffer,0,recvBuffer.length);
			
			System.out.println("Got: "+str+"\n");
			
			str = str.toUpperCase();
			
			byte[] sendBuffer = str.getBytes();
			
			DatagramPacket sendPacket = new DatagramPacket(sendBuffer,sendBuffer.length,recvPacket.getAddress(),recvPacket.getPort());
			
			sock.send(sendPacket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
