package com.demo.classes;

import com.demo.interfaces.MyInterface1;
import com.demo.interfaces.MyInterface4;

public class TestMyClass {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		ob.myMethod3();
		ob.myMethod1();
		System.out.println(MyInterface1.myVar);
		MyInterface1 obj1 = new MyClass();
		//obj1.m1();	//ERROR- The method m1() is undefined for the type MyInterface1
		obj1.myMethod2(12);
		MyInterface4 obj2 = new MyClass();
		obj2.m3();
	}
}
