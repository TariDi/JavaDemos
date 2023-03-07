package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.demo.task.FactorialCallable;
import com.demo.task.IsPrimeCallable;
import com.demo.task.MyTable;
import com.demo.task.PrintTableCallable;

public class TestExecutor {
	
	private static final int NTHREADS = 10;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MyTable table = new MyTable();
		boolean exit = false;
		//int n = 0;
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		List<Future<String>> list1 = new ArrayList<>();
		List<Future<String>> list2 = new ArrayList<>();
		List<Future<String>> list3 = new ArrayList<>();
		Callable<String> worker1;
		Callable<String> worker2;
		Callable<String> worker3;
		Future<String> submission1;
		Future<String> submission2;
		Future<String> submission3;
		
		do {
			System.out.println("1.Printtable\n2.Factorial\n3.isPrime\n4.exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter no. whose table has to be printed:");
				int n1 = sc.nextInt();
				worker1 = new PrintTableCallable(table,n1);
				submission1 = executor.submit(worker1);
				list1.add(submission1);
				break;
				
			case 2:
				System.out.println("Enter no. whose factorial has to be calculated:");
				int n2 = sc.nextInt();
				worker2 = new FactorialCallable(table,n2);
				submission2 = executor.submit(worker2);
				list2.add(submission2);
				break;
				
			case 3:
				System.out.println("Enter no. which should be checked:");
				int n3 = sc.nextInt();
				worker3 = new IsPrimeCallable(table,n3);
				submission3 = executor.submit(worker3);
				list3.add(submission3);
				break;
				
			case 4:
				exit= true;
				break;				
			}
		}while(!exit);
		
		System.out.println("Result of Print Table:");
		for(Future<String> l : list1) {
			try {
				System.out.println(l.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Result of Factorial:");
		for(Future<String> l : list2) {
			try {
				System.out.println(l.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Result of isPrime:");
		for(Future<String> l : list3) {
			try {
				System.out.println(l.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
