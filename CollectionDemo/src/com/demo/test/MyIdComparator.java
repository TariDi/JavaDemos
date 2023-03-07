package com.demo.test;

import java.util.Comparator;

public class MyIdComparator implements Comparator<Person> {
	
	public int compare(Person p1, Person p2){
		System.out.println("In compare() method");
		if(p1.getId()<p2.getId()) {
			return -1;
		}else if(p1.getId() == p2.getId()) {
			return 0;
		}else return 1;
	}
}
