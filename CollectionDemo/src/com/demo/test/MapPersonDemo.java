package com.demo.test;

import java.text.ParseException;
import java.util.Set;
import java.util.TreeMap;

public class MapPersonDemo {
	public static void main(String args[]) throws ParseException {
		TreeMap<Integer,Person> tm = new TreeMap<>();
		tm.put(1000 , new Person(1000,"xxx","1111","abc","22/12/2017"));
		tm.put(800 , new Person(800,"zzz","2222","abc","22/12/2017"));
		
		Set<Integer> keys = tm.keySet();
		
		for(Integer i : keys) {
			System.out.println(tm.get(i));
		}
	}
	
	
}
