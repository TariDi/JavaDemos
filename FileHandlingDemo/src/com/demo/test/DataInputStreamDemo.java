package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;

import com.demo.model.Person;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		try(FileOutputStream fout = new FileOutputStream(args[0]);
			DataOutputStream dout = new DataOutputStream(fout);
				FileInputStream fin = new FileInputStream(args[0]);
				DataInputStream din = new DataInputStream(fin);) {
			
			Person obj= new Person(11,"aaa","11111","abc@xyz","12/09/2017");
			dout.writeInt(obj.getId());
			dout.writeUTF(obj.getName());
			dout.writeUTF(obj.getMobileNo());
			dout.writeUTF(obj.getEmailId());
			dout.writeUTF(Person.sdf.format(obj.getDOJ()));
			
			System.out.println("READING DATA FROM FILE-");
			int id = din.readInt();
			String name = din.readUTF();
			String mobileNo = din.readUTF();
			String emailId = din.readUTF();
			String DOJ = din.readUTF();
			
			System.out.format("%d %s %s %s %s",id, name,mobileNo, emailId, DOJ);
			
		}catch(IOException | ParseException e) {
			e.printStackTrace();
		}

	}

}
