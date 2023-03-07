package com.demo.mypackage;

public class Triangle extends Shape {
	private float base, height, side;
	
	public Triangle() {
		this.base=0.0f;
		this.height=0.0f;
		this.side=0.0f;
	}
	
	public Triangle(float base, float height, float side) {
		this.base=base;
		this.height=height;
		this.side=side;
	}
	
	//setter methods
	
	public void setBase(float base) {
		this.base=base;
	}
	
	public void setHeight(float height) {
		this.height=height;
	}
	
	public void setSide(float side) {
		this.side=side;
	}
	
	public String toString() {
		return "Triangle [base= "+base+",height= "+height+"]";
	}
	
	public float area() {
		return 0.5f*base*height;
	}
	
	public float perimeter() {
		return 3*side;
	}
}
