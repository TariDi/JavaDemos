package com.demo.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;

import com.demo.model.Person;
import com.demo.service.MyObjectOutputStream;
import com.demo.service.ObjectStreamDemoService;

public class AppendModeTest {

	public static void main(String[] args) {
		ObjectOutputStream oos=null; 
		try {
			Person[] p= new Person[5];
			File f = new File("empdata.dat");
			if(f.exists()) {
				oos = new MyObjectOutputStream(new FileOutputStream(f,true));
			}
			else {
				oos = new ObjectOutputStream(new FileOutputStream(f));
			}
			
			Person p1 = new Person(11,"aaa","4565","frgh","04/09/2016");
			Person p2 = new Person(12,"bbb","3465","lll","04/12/2016");
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			ObjectStreamDemoService.readFromFile(p);
			
		}catch(IOException | ParseException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
