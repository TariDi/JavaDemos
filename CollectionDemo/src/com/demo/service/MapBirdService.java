package com.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapBirdService {

	static Scanner sc = new Scanner(System.in);
	
	public static void addEntry(Map<String, HashSet<String>> m) {
		String ans= null;
		do {
			HashSet<String> hs = new HashSet<>();
			System.out.println("Enter city name:");
			String city = sc.next();
			
			do {
				System.out.println("Enter bird: ");
				String name = sc.next();
				hs.add(name);
				System.out.println("Do you wish to continue?(y/n)");
				ans = sc.next();
			}while(ans.equals("y")|| ans.equals("Y"));
			m.put(city, hs);
			System.out.println("Do you wish to continue?(y/n)");
			ans = sc.next();
		}while(ans.equals("y")|| ans.equals("Y"));
	}
	
	public static void displayAll(Map<String, HashSet<String>> m) {
		Set<String> keys = m.keySet();
		for(String s:keys) {
			System.out.println("City: "+s+"\nBirds:\n"+m.get(s));
		}
		
	}
	
	public static HashSet<String> searchByCity(Map<String, HashSet<String>> m){
		System.out.println("Enter Name of City: ");
		String cityName = sc.next();
		/*Set<String> keys = m.keySet();
		
		for(String str : keys) {
			if(cityName)
		}*/
		
		return m.get(cityName);
	}
	
	public static ArrayList<String> searchByBird(Map<String, HashSet<String>> m) {
		System.out.println("Enter name of bird:");
		String birdName = sc.next();
		ArrayList<String> result = new ArrayList<>();
		Set<String> keys = m.keySet();
		for(String s : keys) {
			for(String str : m.get(s)) {
				if(birdName.equals(str)) {
					result.add(s);
				}	
			}
		}
		
		return result;
	}
}
