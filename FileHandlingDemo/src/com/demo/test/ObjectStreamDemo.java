package com.demo.test;

import java.io.IOException;
import java.text.ParseException;

import com.demo.model.Person;
import com.demo.service.ObjectStreamDemoService;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		try {
			Person[] p1 = new Person[3];
			Person[] p2 = new Person[3];
			ObjectStreamDemoService.acceptData(p1);
			ObjectStreamDemoService.writeToFile(p1);
			ObjectStreamDemoService.readFromFile(p2);
			ObjectStreamDemoService.displayData(p2);
			
		}catch(IOException | ClassNotFoundException | ParseException e) {
			e.printStackTrace();		
		}
		

	}

}
