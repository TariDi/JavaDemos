package com.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.BankAccountDao;
import com.demo.exception.BelowMinBalanceException;
import com.demo.model.Account;

public class AccountService {
	public static Scanner sc1;
	public static Scanner sc;
	static int counter;
	public static Iterator<Account> it;
	//static BelowMinBalanceException exception;	
	static {
		sc = new Scanner(System.in);
		try {
			sc1 = new Scanner(new File("/home/tarini/eclipse-workspace/BankAccountDemo/src/com/demo/test/accnt.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//exception = new BelowMinBalanceException("Balance less than minimum balance allowed!");	//not required- we should only create exception object when exception handling is required
		counter = 0;
	}
	
	
	//function to add new account info from file accnt.txt 
	
	public static void addAccount(Set<Account> accounts){	
		//String ans = "y";
			while(sc1.hasNextLine()) {
				Scanner sc2 = new Scanner(sc1.nextLine());
				try {
					String fname = sc2.next();
					String lname = sc2.next();
					String mobileNo = sc2.next();
					String emailNo = sc2.next();
					String dob = sc2.next();
					Double balance = sc2.nextDouble();
					
					if(balance < Account.minBalance) {
						throw new BelowMinBalanceException("Balance cannot be below Rs. 10000");
					}
					Account temp = new Account(fname,lname,mobileNo,emailNo,dob,balance);
				
					if(!accounts.contains(temp));
					{
						accounts.add(temp);
						BankAccountDao.addAccount(temp);
						counter++;
					}
				}catch(BelowMinBalanceException e) {
					System.out.println(e.getMessage());
				}
				
			}
			
	}
	
	//function to validate account based on account no. and pin no.
	
	public static Account validateAccount(Set<Account> accounts, String accntId, String pinNo) {
		for(Account temp : accounts) {
			if(temp.getAccntId().equals(accntId) && temp.getPinNo().equals(pinNo)) {
				return temp;
			}
		}
		return null;
	}
	
	
	//function to close an account
	public static boolean closeAccount(Set<Account> accounts, Account a) {
		boolean status = accounts.remove(a);
		return status;
	}
	
	
	//function to withdraw money from an account
	public static double withdraw(Account a, double withdrawAmt) {
			int status = a.calcWithdraw(withdrawAmt);
			if(status == 0)
				return withdrawAmt;
			else
				return -1;
			
	}
	
	
	//function to deposit money to an account
	public static double deposit(Account a, double depositAmt) {
			a.calcDeposit(depositAmt);
			return depositAmt;
	}
	
	//function to check balance of an account
	public static double checkBalance(Account a) {
		return a.getBalance();
	} 
	
	//function to change pin no. (randomly generated)
	/*public static String changePin(Account a) {
		a.changePin();
		return a.getPinNo();
	}*/
	
	//function to change pin no. (user- generated)
	public static boolean changePin(Account a, String newPin, String newPinConfirm) {
		if(!newPin.equals(newPinConfirm) || newPin.equals(a.getPinNo())) {
			return false;
		}
		
		a.setPinNo(newPin);
		return true;
	}
	

}
