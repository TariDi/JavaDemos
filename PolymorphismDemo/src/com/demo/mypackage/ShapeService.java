package com.demo.mypackage;

import java.util.Scanner;

public class ShapeService {
	
	public static void acceptDimension(Rectangle r) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length: ");
		float length = sc.nextFloat();
		System.out.println("Enter Breadth: ");
		float breadth = sc.nextFloat();
		r.setLength(length);
		r.setBreadth(breadth);
		sc.close();
	}
	
	public static void acceptDimension(Triangle t) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Base: ");
		float base = sc.nextFloat();
		System.out.println("Enter Height: ");
		float height = sc.nextFloat();
		System.out.println("Enter Side: ");
		float side = sc.nextFloat();
		t.setBase(base);
		t.setHeight(height);
		t.setSide(side);
		sc.close();
	}
	
	public static void acceptDimension(Circle c) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius: ");
		float radius = sc.nextFloat();
		c.setRadius(radius);
		sc.close();
	}

}
