package com.demo.test;

import java.text.ParseException;

public class ContractEmp extends Employee{
	private double hrlyCharges, hrsWorked;
	
	public ContractEmp() {
		super();
		//System.out.println("In ContractEmp default constructor");
		hrlyCharges=0.0;
		hrsWorked=0.0;
	}
	
	public ContractEmp(int id, String name, String mobileNo, String emailId, String DOJ,String dept, String desg, double hrlyCharges, double hrsWorked) throws ParseException {
		super(id, name, mobileNo, emailId, DOJ,dept, desg);
		//System.out.println("In ContractEmp parameterized constructor");
		this.hrlyCharges=hrlyCharges;
		this.hrsWorked=hrsWorked;
	}

	public String toString() {
		return super.toString()+"\nHourly Charges: "+hrlyCharges+"\nHours Worked: "+hrsWorked;
	}
	
	public double calculateSalary() {
		
		return hrlyCharges*hrsWorked;
		
	}
}
