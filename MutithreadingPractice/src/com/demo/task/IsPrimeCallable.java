package com.demo.task;

import java.util.concurrent.Callable;

public class IsPrimeCallable implements Callable<String> {
	private MyTable table;
	private int n;
	
	public IsPrimeCallable(MyTable table, int n) {
		this.table = table;
		this.n = n;
	}
	
	public String call() throws Exception{
		return "is "+n+" prime? "+table.isPrime(n);
	} 
}
