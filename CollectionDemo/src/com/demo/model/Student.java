package com.demo.model;

public class Student {
	public static int counter;
	static {
		counter=0;
	}
	private String name,studentId;
	private int marks1, marks2, marks3;
	
	public Student(String name, int marks1, int marks2, int marks3){
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		this.studentId= Integer.toString(++counter);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	public String toString() {
		return "\n\nId: "+studentId+"\nName: "+name+"\nMarks1: "+marks1+"\nMarks2: "+marks2+"\nMarks3: "+marks3;
	}
	
}
