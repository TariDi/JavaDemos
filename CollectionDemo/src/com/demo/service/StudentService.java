package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.model.Student;


public class StudentService {
	public static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	
	public static void acceptStudent(List<Student> l) {
		String ans;
		do {
			System.out.println("Enter student name: ");
			String name = sc.next();
			System.out.println("Enter marks in subject1: ");
			int m1 = sc.nextInt();
			System.out.println("Enter marks in subject2: ");
			int m2 = sc.nextInt();
			System.out.println("Enter marks in subject3: ");
			int m3 = sc.nextInt();
			l.add(new Student(name, m1, m2, m3));
			
			System.out.println("Do you wish to continue?(y/n)");
			ans=sc.next();
			
		}while(ans.equals("y") || ans.equals("Y"));
		
	}
	
	
	public static float calcAvg(List<Student> l) {
		System.out.println("Enter student name whose avg has to be calculated: ");
		String name = sc.next();
		
		
		if(searchStudent(l,name)!=null) {
				return ((float)s.getMarks1()+(float)s.getMarks2()+(float)s.getMarks3())/3f;
		}
		}
		
		return -1f;
	}
	
	public static Student searchStudent(List<Student> l, String name) {
		for(Student s: l) {
			if(name.equals(s.getName())) {
				return s;
			}
		}
		
		return null;
	}
	
	public static void acceptStudent(Map<String,Student> m) {
		String ans;
		do {
			System.out.println("Enter student name: ");
			String name = sc.next();
			System.out.println("Enter marks in subject1: ");
			int m1 = sc.nextInt();
			System.out.println("Enter marks in subject2: ");
			int m2 = sc.nextInt();
			System.out.println("Enter marks in subject3: ");
			int m3 = sc.nextInt();
			m.put(name, new Student(name,m1,m2,m3));
			
			System.out.println("Do you wish to continue?(y/n)");
			ans=sc.next();
			
		}while(ans.equals("y") || ans.equals("Y"));
	}
	
	public static float calcAvg(Map<String,Student> m) {
		System.out.println("Enter student name whose avg has to be calculated: ");
		String name = sc.next();
		Student s = m.get(name);
		
		if(s!=null) {
			return ((float)s.getMarks1()+(float)s.getMarks2()+(float)s.getMarks3())/3f;
		}
		
		else return -1f;
	}
	
	public static void displayAll(Map<String,Student> m) {
		System.out.println(m);
	}
}
