package com.demo.classes;

import com.demo.interfaces.MyInterface1;
import com.demo.interfaces.MyInterface4;

public class MyClass implements MyInterface1, MyInterface4 {

	@Override
	public int m1() {
		System.out.println("In m1 method");
		return 0;
	}

	@Override
	public char m2() {
		System.out.println("In m2 method");
		return 0;
	}

	@Override
	public void m3() {
		System.out.println("In m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("In m4 method");
		
	}

	@Override
	public void m6() {
		System.out.println("In m6 method");
		
	}

	@Override
	public void m5() {
		System.out.println("In m5 method");
		
	}

	@Override
	public int myMethod1() {
		System.out.println("In myMethod1 method");
		return 0;
	}

	@Override
	public void myMethod2(int i) {
		System.out.println("In myMethod2 method");
		
	}

}
