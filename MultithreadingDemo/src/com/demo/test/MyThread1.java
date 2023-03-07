package com.demo.test;

import com.demo.model.MyTable;

public class MyThread1 implements Runnable {
	private MyTable table;
	private int n;
	
	public MyThread1(MyTable m,int n) {
		table=m;
		this.n=n;
	}
	
	public void run() {
			table.printTable(n);
	}

}
