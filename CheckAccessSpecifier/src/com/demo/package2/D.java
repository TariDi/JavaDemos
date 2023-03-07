package com.demo.package2;

import com.demo.package1.A;

public class D extends A {
	
	public void myMethod() {
		//System.out.println(ob.x);	//Error because x is a private field of A
		System.out.println(y);
		System.out.println(z);
		//System.out.println(m);	//Error because m is default and A is in another package
	}

}
