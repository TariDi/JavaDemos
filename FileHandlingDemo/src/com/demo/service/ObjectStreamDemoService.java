package com.demo.service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.Scanner;

import com.demo.model.Person;

public class ObjectStreamDemoService {
	
	public static void acceptData(Person[] p) throws ParseException {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<p.length; i++) {
			System.out.print("Enter Details- \n");
			System.out.print("\nId: ");
			int id= sc.nextInt();
			System.out.print("\nName: ");
			String name= sc.next();
			System.out.print("\nMobile No: ");
			String mobileNo=sc.next();
			System.out.print("\nEmail Id: ");
			String emailId=sc.next();
			System.out.print("\nDate Of Joining: ");
			String doj=sc.next();
			
			p[i]= new Person(id, name, mobileNo, emailId, doj);
		}
	}
	
	public static void writeToFile(Person[] p) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.dat"));
		
		for(int i=0;i<p.length;i++) {
			oos.writeObject(p[i]);
		}
		
		oos.close();
		
	}
	
	public static void readFromFile(Person[] p) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		/*for(int i=0; i<p.length; i++) {
			p[i]= (Person)ois.readObject();
		}*/
		int i=0;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.dat"));) {
			while(true) {
				//p[i] = (Person)ois.readObject();
				System.out.println((Person)ois.readObject());
			}
		}catch(EOFException e) {
			System.out.println("Reached end of file.");
		}
	}
	
	public static void displayData(Person[] p) {
		System.out.println("Person Details are:");
		for(Person pTemp:p) {
			System.out.println(pTemp);
		}
	}
}
