package com.demo.test;

import java.util.Set;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(30);
		s.add(20);
		s.add(10);
		s.add(40);
		
		System.out.println(s);
		
		Set<String> s1 = new TreeSet<>();
		s1.add("Tarini");
		s1.add("Deepali");
		s1.add("Shriya");
		
		System.out.println(s1);

	}

}
