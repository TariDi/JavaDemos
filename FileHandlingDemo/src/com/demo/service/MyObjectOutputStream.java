package com.demo.service;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {
	
	public MyObjectOutputStream(OutputStream out) throws IOException{
		super(out);
	}
	
	protected void writeStreamHeader() throws IOException{	//this is done to avoid writing stream header to a file multiple times
															//otherwise we get an error while reading and file gets corrupted.
		
	}

}
