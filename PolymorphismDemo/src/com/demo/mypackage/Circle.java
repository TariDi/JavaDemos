package com.demo.mypackage;

public class Circle extends Shape {
	private float radius;
	
	public Circle() {
		this.radius=0.0f;
	}
	
	public Circle(float radius) {
		this.radius=radius;
	}
	
	//setter method
	
	public void setRadius(float radius) {
		this.radius=radius;
	}
	
	public float area() {
		return 3.142f*radius*radius;
	}
	
	public String toString() {
		return "Circle: Radius: "+radius;
	}
	
	public float perimeter() {
		return 2*3.142f*radius;	//we don't have to write 2.0f because int can be converted to float
	}
}
