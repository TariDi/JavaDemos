package com.demo.test;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File(args[0]);
		if(f.exists())
			System.out.println("File exists");
		else System.out.println("File does not exist");
	}

}
