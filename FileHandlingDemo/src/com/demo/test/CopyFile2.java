package com.demo.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile2 {

	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new FileReader("ABC.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("xyz.txt"))) {
			
			String str = br.readLine();
			while(str!=null) {
				//pw.write(str);
				pw.println(str);
				str = br.readLine();
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
