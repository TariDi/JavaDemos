package com.demo.service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import com.demo.model.Account;

public class AccountService {
	public static Scanner sc;
	static int counter;
	public static Iterator<Account> it;
	static {
		sc = new Scanner(System.in);
		counter = 0;
	}
	
	
	public static void addAccount(Set<Account> accounts){
		String ans = "y";
		do {
			System.out.println("Enter account details: ");
			System.out.println("Enter first name: ");
			String fname = sc.next();
			System.out.println("Enter last name: ");
			String lname = sc.next();
			System.out.println("Enter mobile no.: ");
			String mobileNo = sc.next();
			System.out.println("Enter email no.: ");
			String emailNo = sc.next();
			System.out.println("Enter date of birth (dd/mm/yyyy)");
			String dob = sc.next();
			System.out.println("Enter balance: ");
			Double balance = sc.nextDouble();
			
			if
			
			accounts.add(new Account(fname,lname,mobileNo,emailNo,dob,balance));
			counter++;
			
			System.out.println("Do you want to continue (y/n)");
			ans = sc.next();
		}while(ans.equals("y") || ans.equals("Y"));
	}
	
	public static Iterator<Account> searchAccount(Set<Account> accounts) {
		System.out.print("Enter id, pin no. of account to be deleted: ");
		String accntId = sc.next();
		String pinNo = sc.next();
		it = accounts.iterator();
		while(it.hasNext()) {
			Account a = it.next();
			if(accntId==a.getAccntId() && pinNo==a.getPinNo()) {
				return it;
			}
		}
		
		return null;
	}
	
	public static void closeAccount(Set<Account> accounts) {
		if(searchAccount(accounts) != null) {
			it.next();
			it.remove();
		}
		else {
			System.out.println("Account does not exist.");
		}
	}
	
	

}
