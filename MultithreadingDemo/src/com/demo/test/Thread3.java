package com.demo.test;

import com.demo.model.MyTable;

public class Thread3 extends Thread{
	private MyTable table;
	private int n;
	
	public Thread3(MyTable m,int n) {
		table=m;
		this.n=n;
	}
	
	public void run() {
		if(table.isPrime(n))
			System.out.println(n+" is a prime no.");
		else
			System.out.println(n+" is not a prime no.");
	}

}
