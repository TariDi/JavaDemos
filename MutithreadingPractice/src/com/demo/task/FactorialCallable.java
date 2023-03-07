package com.demo.task;

import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<String>{
	private MyTable table;
	private int n;
	
	public FactorialCallable(MyTable table, int n) {
		this.table = table;
		this.n = n;
	}
	
	public String call() throws Exception{
		return n+"! = "+table.factorial(n);
	} 

}
