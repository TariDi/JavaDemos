package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import com.demo.service.MapBirdService;

public class DemoBirdMap {

	public static void main(String[] args) {
		Map<String, HashSet<String>> city = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String ans =null;
		do {
			System.out.println("1. Add\n2. Delete\n3. Search by City\n4. Search by Bird\n5. Exit");
			String ch = sc.next();
			switch(ch) {
			
			case "1":
				MapBirdService.addEntry(city);
				MapBirdService.displayAll(city);
				break;
				
			case "3":
				HashSet<String> result1 = MapBirdService.searchByCity(city);
				if(result1==null) {
					System.out.println("City not found");
				}else {
					System.out.println(result1);
				}
				
			case "4":
				ArrayList<String> result2 = MapBirdService.searchByBird(city);
				if(result2.size()==0) {
					System.out.println("Bird Not Found");
					
				}else {
					System.out.println(result2);
				}
					
			case "5":
				System.exit(0);
			}
			System.out.println("Do you wish to continue?(y/n)");
			ans = sc.next();
			
		}while(ans.equals("y") || ans.equals("Y"));
		
	}
		

}
