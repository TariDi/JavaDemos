package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try(FileInputStream fin= new FileInputStream("ABC.txt");
			FileOutputStream fout = new FileOutputStream("pqr.txt");) {
			
			int n= fin.read();
			while(n!=-1) {
				fout.write(n);
				n= fin.read();
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
