package com.demo.package1;

public class C {
	A ob= new A();
	
	public void myMethod() {
		//System.out.println(ob.x);	//Error because x is a private field of A
		System.out.println(ob.y);
		System.out.println(ob.z);
		System.out.println(ob.m);
	}
}
