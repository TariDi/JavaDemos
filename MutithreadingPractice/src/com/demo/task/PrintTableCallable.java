package com.demo.task;

import java.util.concurrent.Callable;


public class PrintTableCallable implements Callable<String>{
	
	private MyTable table;
	private int n;
	
	public PrintTableCallable(MyTable table, int n) {
		this.table = table;
		this.n = n;
	}
	
	public String call() throws Exception{
		return table.printTable(n);
	}

}
