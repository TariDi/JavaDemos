package com.demo.model;

public class Storage {
	private int n;
	boolean valueFlag = false;	//false- value hasn't been written yet; true- value hasn't been read yet
	
	synchronized public void put(int x) {
		if(valueFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		n=x;
		System.out.println("Put : "+n);
		valueFlag = true;
		notify();
	}
	
	synchronized public void get() {
		if(!valueFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got : "+n);
		valueFlag = false;
		notify();
	}

}
