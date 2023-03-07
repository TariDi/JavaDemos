package com.demo.test;

import com.demo.model.MyTable;

public class Thread2 extends Thread {
	private MyTable table;
	private int n;
	
	public Thread2(MyTable m,int n) {
		table=m;
		this.n=n;
	}
	
	public void run() {
		//table.factorialOfN(n);
		System.out.println("Factorial of "+n+" = "+table.factorialOfN(n));
	}

}
