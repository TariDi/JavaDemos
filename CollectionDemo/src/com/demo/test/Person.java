package com.demo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Person implements Comparable<Person>{
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

	@Override
	public int hashCode() {
		System.out.println("Hashcode() called.");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOJ == null) ? 0 : DOJ.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + id;
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
	 System.out.println("Equals() called.");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (DOJ == null) {
			if (other.DOJ != null)
				return false;
		} else if (!DOJ.equals(other.DOJ))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (id != other.id)
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public int compareTo(Person o) {	
		System.out.println("In compareTo method");
		/*if(this.id < o.id) {
			return -1;
		}else if(this.id == (o.id)) {
			return 0;
		}else return 1;*/
		return this.name.compareTo(o.name);
	}
	
	public abstract double calculateSalary();
	
}
