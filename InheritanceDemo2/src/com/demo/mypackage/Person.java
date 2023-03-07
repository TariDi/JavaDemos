package com.demo.mypackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
	private int id;
	private String name;
	private String mobileNo, emailId;
	private Date DOJ;
	
	public Person() {
		//System.out.println("In Person default constructor");
		id=0;
		name=null;
		mobileNo=null;
		emailId=null;
		DOJ=null;
	}
	
	public Person(int id, String name, String mobileNo, String emailId, String DOJ) throws ParseException{
		//System.out.println("In Person parameterized constructor");
		this.id=id;
		this.name=name;
		this.mobileNo=mobileNo;
		this.emailId=emailId;
		if(DOJ!=null) {
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			Date dt= sdf.parse(DOJ);
			this.DOJ=dt;
		}
		else this.DOJ=null;
		
	}
	
	//setter methods
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setEmailId(String emailId) {
		this.emailId=emailId;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo=mobileNo;
	}
	
	//getter methods
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getEmailId() {
		return this.emailId;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public Date getDOJ() {
		return this.DOJ;
	}
	
	public String toString() {
		if(this.DOJ==null)
			return "Id: "+id+"\nName: "+name+"\nMobile No: "+mobileNo+"\nEmail Id: "+emailId+"\nDate Of Joining: n/a";
		else return "Id: "+id+"\nName: "+name+"\nMobile No: "+mobileNo+"\nEmail Id: "+emailId+"\nDate Of Joining: "+DOJ;
	}

}
