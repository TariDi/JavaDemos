package com.demo.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.model.Student;
import com.demo.service.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();
		Map<String,Student> m = new HashMap<>();
		StudentService.acceptStudent(m);
		Scanner sc = new Scanner(System.in);
		String ans;
		
		do {
				float avg = StudentService.calcAvg(m);
				if(avg==-1f) {
					System.out.println("Entry not found");
				}
				
				else {
					System.out.println("Average of student: "+avg);
				
			}
			
			
			System.out.println("Do you wish to continue?(y/n)");
			ans=sc.next();

		}while(ans.equals("y") || ans.equals("Y"));
		
		StudentService.displayAll(m);
		
	}

}
