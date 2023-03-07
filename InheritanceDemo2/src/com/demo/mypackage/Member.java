package com.demo.mypackage;

import java.text.ParseException;

public class Member extends Person{
	private String memberType;
	private double feesPaid;
	private String[] facilities= new String[10];
	
	public Member() {
		super();
		memberType=null;
		feesPaid=0.0;
		facilities= null;
	}
	
	public Member(int id, String name, String mobileNo, String emailId, String DOJ, String memberType, double feesPaid, String[] facilities) throws ParseException {
		super(id, name, mobileNo, emailId, DOJ);
		this.memberType=memberType;
		this.feesPaid=feesPaid;
		for(int i=0;i<facilities.length;i++) {
			this.facilities[i]= facilities[i];
		}
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<facilities.length;i++) {
			if(facilities[i]!=null) {
				s=s+"\n"+facilities[i];
			} else break;
		}
		
		return super.toString()+"\nType Of Membership: "+memberType+"\nFees Paid: "+feesPaid+"\nFacilities provided: "+s;
	}
	
}
