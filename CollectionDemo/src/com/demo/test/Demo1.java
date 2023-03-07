package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<>();	//Generics in Java 
		ob.add(12);	//boxes automatically and stored as Object
		//ob.add("aaaa");
		ob.add(20);
		if(ob.add(20)) {
			System.out.println("Done");
		}
		else
			System.out.println("Duplicate");
		ob.add(40);
		if(ob.contains(20)) {
			System.out.println("Available at "+ob.indexOf(20));
		} else
			System.out.println("Not available");
		System.out.println(ob);

	}

}
