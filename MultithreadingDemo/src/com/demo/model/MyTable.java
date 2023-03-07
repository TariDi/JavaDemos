package com.demo.model;

public class MyTable {
	 public void printTable(int n){
		synchronized(this) {  //?
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+"*"+i+" = "+(n*i));
			try {
				Thread.sleep(1000);	//throws a checked exception called InterruptedException
		}catch(InterruptedException e) {
			e.printStackTrace();
		} 
		}
		
		}	
		
	}
	 
	 public long factorialOfN(int n){
		 long factorial=1;
			synchronized(this) {
				for(int i=n; i>0; i--) {
					factorial*=i;
					try {
						Thread.sleep(1000);	//throws a checked exception called InterruptedException
				}catch(InterruptedException e) {
					e.printStackTrace();
				} 
				}
			}
			
			
			//System.out.println("Factorial of "+n+" = "+factorial);
			return factorial;
		}
	 
	 public boolean isPrime(int n) {
		 synchronized (this) {
			 for(int i=2; i<n; i++) {
				 if(n%i == 0)
					 return false;
				 try {
						Thread.sleep(1000);	//throws a checked exception called InterruptedException
				}catch(InterruptedException e) {
					e.printStackTrace();
				} 
			 }
		 }
		 
		 return true;
	 }
}
