package com.demo.mypackage;

public class Rectangle extends Shape{
	private float length, breadth;
	
	public Rectangle() {
		this.length=0.0f;
		this.breadth=0.0f;
	}
	
	public Rectangle(float length, float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	//setter methods
	
	public void setLength(float length) {
		this.length=length;
	}
	
	public void setBreadth(float breadth) {
		this.breadth=breadth;
	}
	
	public float area() {
		return length*breadth;
	}
	
	public float perimeter() {
		return 2*(length+breadth);
	}
	
	public String toString() {
		return "Rectangle: [Length: "+length+", Breadth: "+breadth+"]";
	}

}
