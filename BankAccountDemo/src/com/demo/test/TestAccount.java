package com.demo.test;

import java.sql.Connection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Account;
import com.demo.service.AccountService;

public class TestAccount {

	public static void main(String[] args) {
		Set<Account> accounts = new HashSet<>();	//used to store all accounts locally
		Scanner sc = new Scanner(System.in);
		
		AccountService.addAccount(accounts);
		System.out.println(accounts);
		
		do {
			
			System.out.print("Enter id, pin no. of account: ");
			String accntId = sc.next();
			String pinNo = sc.next();
			Account current =AccountService.validateAccount(accounts, accntId, pinNo);
			if(current!=null) {
				System.out.println("Welcome Account Holder "+current.getfName()+" "+current.getlName());
				boolean exit = false;
				do {
					System.out.println("Choose action:\n1.Withdraw\n2.Deposit\n3.Check Balance\n4.Change Pin\n5.Close Account\n6.Exit");
					int choice = sc.nextInt();
					
					switch(choice) {
					case 1:
						System.out.println("Enter amount to be withdrawn: ");
						double withdrawAmt = sc.nextDouble();
						double withdrawal = AccountService.withdraw(current, withdrawAmt);
						if(withdrawal>0)
						System.out.println("Rs. "+withdrawal+" has been successfully withdrawn.");
						else
							System.out.println("Withdrawal not possible");
						break;
						
					case 2:
						System.out.println("Enter amount to be deposited: ");
						double depositAmt = sc.nextDouble();
						double deposit = AccountService.deposit(current, depositAmt);
						System.out.println("Rs. "+deposit+" was deposited");
						break;
						
					case 3:
						System.out.println("Current Balance is Rs. "+AccountService.checkBalance(current));
						break;
						
					case 4:
						System.out.println("Please enter new Pin no.:");
						String newPin = sc.next();
						System.out.println("Enter new Pin no. again (for confiramtion):");
						String newPinConfirm = sc.next();
						if(AccountService.changePin(current, newPin, newPinConfirm))
							System.out.println("Pin no. was changed successfully");
						else {
							System.out.println("Change was unsuccessful."
									+ "\nNew pin no. should be different from old pin"
									+ "\nMake sure first and second entry match");
						}
							
						break;
						
					case 5:
						String closeAccount = current.getAccntId();
						if(AccountService.closeAccount(accounts, current))
							System.out.println("Account "+closeAccount+" successfully closed");
						break;
						
					case 6:
						exit = true;
						break;
						
					}
				
				}while(!exit);
				
			}
			else {
				System.out.println("Account login is invalid");
			}
			
			System.out.println(accounts);
		
		}while(true);

	}

}
