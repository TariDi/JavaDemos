package com.demo.interfaces;

public interface MyInterface1 {
	int myVar=35;	//public static final
	int myMethod1();
	void myMethod2(int i);
	default void myMethod3() { //default methods are used if the class does not define this function
		System.out.println("In myMethod3 method");
		
	}

}
