package com.demo.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.demo.exception.InsufficientBalanceException;

public class Account {
	static double minBalance;
	static SimpleDateFormat sdf;
	static int counter;
	static Random rnd;
	static {
		minBalance = 10000.0;
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		counter = 0;
		rnd = new Random();
	}
	private String pinNo, accntId, fName, lName, mobileNo, emailId; 
	private Date dob;
	private double balance;
	
	public Account() {
		this.pinNo = null;
		this.accntId = null;
		this.fName = null;
		this.lName = null;
		this.mobileNo = null;
		this.emailId = null;
		this.dob = null;
		this.balance = 0.0;
	} 
	
	public Account(String fName, String lName, String mobileNo, String emailId, String dob,
			double balance) {
		try {
			this.pinNo = Integer.toString(1000 + rnd.nextInt(9000));

			this.fName = fName;
			this.lName = lName;
			this.mobileNo = mobileNo;
			this.emailId = emailId;
			if(dob!=null) {
				Date dt = sdf.parse(dob);
				this.dob = dt;
			}else this.dob = null;
			if(balance < minBalance)
				throw new InsufficientBalanceException();
			this.balance = balance;
			accntId = new String(fName.charAt(0)+fName.charAt(1)+lName.charAt(lName.length()-2)+lName.charAt(lName.length()-1)+Integer.toString(counter++));
			System.out.println("Account No: "+this.accntId+"\tPin No:"+this.pinNo);

			} catch(InsufficientBalanceException | ParseException e) {
				System.out.println(e.getMessage());
			}
		}

	public String getPinNo() {
		return pinNo;
	}
	
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}

	public String getAccntId() {
		return accntId;
	}

	public void setAccntId(String accntId) {
		this.accntId = accntId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	public void changePin() {
		this.setPinNo(Integer.toString(1000 + rnd.nextInt(9000)));
	}
	
	public String toString() {
		return "Account Id: "+accntId+", Name: "+fName+" "+lName+", Mobile No: "+mobileNo+", Balance: "+balance;
	}
	
}
