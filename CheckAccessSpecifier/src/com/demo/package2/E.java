package com.demo.package2;

import com.demo.package1.A;

public class E {
	A ob= new A();
	
	public void myMethod() {
		//System.out.println(ob.x);	//Error because x is a private field of A
		//System.out.println(ob.y);	//Error because y is protected
		System.out.println(ob.z);
		//System.out.println(ob.m);	//Error because m is default
	}
}
