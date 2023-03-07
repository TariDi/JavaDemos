package com.demo.test;

import java.util.Scanner;

import com.demo.model.MyTable;


public class TestMyTable {

	public static void main(String[] args) {
		MyTable table = new MyTable();
		/*MyThread1 t2 = new MyThread1(table,7);
		Thread th2 = new Thread(t2);*/
		
		//th2.start();		//including main function, 3 threads are running at this point.
		/*try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
		String ans="y";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Printtable 2.Factorial 3.Is Prime?");
			System.out.println("Enter choice:");
			int choice = sc.nextInt();
			System.out.println("Enter number:");
			int n= sc.nextInt();
			
			switch(choice) {
			case 1:
				MyThread1 t1 = new MyThread1(table,n);
				Thread th1 = new Thread(t1);
				th1.setPriority(Thread.MAX_PRIORITY);
				th1.setName("TableThread");
				th1.start();
				break;
				
			case 2:
				Thread2 t2 = new Thread2(table,n);
				t2.start();
				//Thread th2 = new Thread(t2);
				//th2.start();
				break;
				
			case 3:
				Thread3 t3 = new Thread3(table,n);
				t3.start();
				//Thread th3 = new Thread(t3);
				//th3.start();
				break;
				
			}
			
			System.out.println("Continue?(y/n)");
			ans = sc.next();
			
		}while(ans.equals("y")||ans.equals("Y"));
		
		System.out.println("Reached to the end of main");
	}

}
