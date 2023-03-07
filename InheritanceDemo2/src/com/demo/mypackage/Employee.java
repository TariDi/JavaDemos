package com.demo.mypackage;

import java.text.ParseException;

public abstract class Employee extends Person {
	private String dept,desg;

	public Employee() {
		//System.out.println("In Employee default constructor");
		dept=null;
		desg=null;
	}
	
	public Employee(int id, String name, String mobileNo, String emailId, String DOJ,String dept, String desg) throws ParseException {
		super(id, name, mobileNo, emailId, DOJ);
		//System.out.println("In Employee parameterized constructor");
		this.dept=dept;
		this.desg=desg;
	}
	
	public String toString() {
		return super.toString()+"\nDepartment: "+dept+"\nDesignation: "+desg; //toString method from Person is called using super.
	}
	
	public abstract double calculateSalary();
		
}
