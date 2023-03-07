package com.demo.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import com.demo.exception.BelowMinBalanceException;


public class Account {
	static public double minBalance;
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
	private java.util.Date dob;
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
				java.util.Date dt;
				dt = sdf.parse(dob);
				this.dob = dt;
			}else this.dob = null;
			this.balance = balance;
			
			this.accntId = new String(fName.charAt(0)+""+fName.charAt(1)+""+lName.charAt(lName.length()-2)+""+lName.charAt(lName.length()-1)+""+Integer.toString(counter++));
			System.out.println("Account No: "+this.accntId+"\tPin No:"+this.pinNo);
		}catch(ParseException e) {
			e.printStackTrace();
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

	public java.util.Date getDob() {
		return dob;
	}

	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	//function to change pin no. (randomly-generated)
	/*public void changePin() {
		this.setPinNo(Integer.toString(1000 + rnd.nextInt(9000)));
	}*/
	
	public int calcWithdraw(double withdrawAmt) {
		try {
			double newBalance = this.balance-withdrawAmt; 
			if(newBalance < minBalance) {
				throw new BelowMinBalanceException("Balance cannot be below Rs. 10000");
			}
			else {
				this.balance = newBalance;
				return 0;
			}
		}catch(BelowMinBalanceException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	} 
	
	
	public void calcDeposit(double depositAmt) {
		this.balance += depositAmt;
	}
	
	
	
	public String toString() {
		return "Account Id: "+accntId+", Name: "+fName+" "+lName+", Mobile No: "+mobileNo+", Balance: "+balance+"\n";
	}
	
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		if(this.accntId.equals(acc.accntId) && this.pinNo.equals(acc.pinNo)) {
			return true;
		}
		else return false;
	}
	
	
	
	//tried to make inserting values into PreparedStatement easier and faster, 
	//but this goes against the proper structure of a project.
	//everything related to database connectivity must be incorporated into dao classes only.
	/*public void setQueryValues(PreparedStatement add) {
		try {
			add.setString(1, accntId);
			add.setString(2, pinNo);
			add.setString(3, fName);
			add.setString(4, lName);
			add.setString(5, mobileNo);
			add.setString(6, emailId);
			add.setDate(7, new java.sql.Date(dob.getTime()));
			add.setDouble(8, balance);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	*/
	
}
