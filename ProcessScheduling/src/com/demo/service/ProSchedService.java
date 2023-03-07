package com.demo.service;


import java.util.Scanner;
import com.demo.model.Process;
import java.util.Collections;
import java.util.List;

public class ProSchedService {
	public static int count;
	public static Scanner sc;
	static {
		count=0;
		sc = new Scanner(System.in);
	}
	
	public static void acceptProcess(List<Process> queue) {
		
		System.out.println("Enter no. of processes: ");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter arrival time for process "+(i+1));
			float arrivalTime= sc.nextFloat();
			System.out.println("Enter burst time for process "+(i+1));
			float burstTime= sc.nextFloat();
			
			queue.add(new Process(burstTime,arrivalTime));
			count++;
		}
		
	}
	
	public static void displayProcess(List<Process> list) {
		Collections.sort(list);
		System.out.println(list);
	}
}
