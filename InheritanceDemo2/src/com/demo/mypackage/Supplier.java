package com.demo.mypackage;

import java.text.ParseException;

public class Supplier extends Person {
	private String address;
	private String[] listOfProducts= new String[10];
	
	public Supplier() {
		super();
		address=null;
		listOfProducts=null;
	}
	
	public Supplier(int id, String name, String mobileNo, String emailId, String DOJ, String address, String[] listOfProducts) throws ParseException {
		super(id, name, mobileNo, emailId, DOJ);
		this.address=address;
		for(int i=0;i<listOfProducts.length;i++) {
			if(listOfProducts[i]!=null) {
				this.listOfProducts[i]=listOfProducts[i];
			}else break;
		}
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<listOfProducts.length;i++) {
			if(listOfProducts[i]!=null) {
				s=s+"\n"+listOfProducts[i];
			} else break;
		}
		
		return super.toString()+"\nAddress: "+address+"\nList Of Products: "+s;
	}

}
