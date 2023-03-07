package com.demo.test;


import java.text.ParseException;


public class SalariedEmp extends Employee {
	private double salary, bonus;
	
	public SalariedEmp() {
		super();
		//System.out.println("In SalariedEmp default constructor");
		salary=0.0;
		bonus=0.0;
	}
	
	public SalariedEmp(int id, String name, String mobileNo, String emailId, String DOJ,String dept, String desg, double salary, double bonus) throws ParseException {
		super(id, name, mobileNo, emailId, DOJ, dept, desg);
		//System.out.println("In SalariedEmp parameterized constructor");
		this.salary=salary;
		this.bonus=bonus;
	}
	
	//getter methods
	
	public double getSalary() {
		return salary;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	//setter methods
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	
	public String toString() {
		return super.toString()+"\nSalary: "+salary+"\nBonus: "+bonus;
	}
		
	public double calculateSalary() {
		double da= 0.1*salary;
		double hra= 0.15*salary;
		double pf= 0.08*salary;
		return salary+da+hra-pf;
	}

}
