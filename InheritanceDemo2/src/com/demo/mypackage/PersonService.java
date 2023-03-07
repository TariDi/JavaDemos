package com.demo.mypackage;

import java.text.ParseException;
import java.util.Scanner;

public class PersonService {
	
	public static void acceptDetails(Person[] p) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int j=0, choice=0 ;
		while(true) {
			System.out.print("Choices:\n1. Salaried Employee\n2. Contract Employee\n3. Member\n4. Supplier\n5. Exit\nEnter choice: ");
			choice= sc.nextInt();
			if(choice == 5)
				break;
			System.out.print("Enter Details- \n");
			System.out.print("\nId: ");
			int id= sc.nextInt();
			System.out.print("\nName: ");
			String name= sc.next();
			System.out.print("\nMobile No: ");
			String mobileNo=sc.next();
			System.out.print("\nEmail Id: ");
			String emailId=sc.next();
			System.out.print("\nDate Of Joining: ");
			String doj=sc.next();
			
			
			switch(choice) {
			
			case 1:
				System.out.print("\nDepartment: ");
				String dept=sc.next();
				System.out.print("\nDesignation: ");
				String desg=sc.next();
				System.out.print("\nSalary: ");
				Double salary=sc.nextDouble();
				System.out.print("\nBonus: ");
				Double bonus=sc.nextDouble();
				
				p[j]= new SalariedEmp(id,name,mobileNo,emailId,doj,dept,desg,salary,bonus);
				j++;
				System.out.println("Entry created.");
				break;
				
			case 2:
				System.out.print("\nDepartment: ");
				dept=sc.next();
				System.out.print("\nDesignation: ");
				desg=sc.next();
				System.out.print("\nHourly charges: ");
				Double hrlyCharges=sc.nextDouble();
				System.out.print("\nHours worked: ");
				Double hrsWorked=sc.nextDouble();
				
				p[j]= new ContractEmp(id,name,mobileNo,emailId,doj,dept,desg,hrlyCharges,hrsWorked);
				j++;
				System.out.println("Entry created.");
				break;
				
			case 3:
				System.out.print("\nType of Membership:  ");
				String memberType=sc.next();
				System.out.print("\nFees Paid: ");
				Double feesPaid=sc.nextDouble();
				System.out.print("\nFacilities provided ('enter' for next element & 'end' to exit): ");
				String[] facilities = new String[10];
				for(int i=0;i<facilities.length;i++) {
					facilities[i] = sc.next();
					if(facilities[i].equals("end")) {
						facilities[i] = null;
						break;
					}
				}
				
				p[j]= new Member(id,name,mobileNo,emailId,doj,memberType,feesPaid,facilities);
				j++;
				System.out.println("Entry created.");
				break;
				
			case 4:
				System.out.print("\nAddress:  ");
				String address=sc.next();
				System.out.print("\nList Of Products ('enter' for next element & 'end' to exit): ");
				String[] products = new String[10];
				for(int i=0;i<products.length;i++) {
					products[i] = sc.next();
					if(products[i].equals("end")) {
						products[i] = null;
						break;
					}
				}
				
				p[j]= new Supplier(id,name,mobileNo,emailId,null,address,products);
				j++;
				System.out.println("Entry created.");
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("INVALID CHOICE");
				break;
				
			}
			
		}
		
		sc.close();	
		
	}
	
	
	
	
	/*public static ContractEmp acceptDetails(ContractEmp ce) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details for Salaried Employee:\n");
		System.out.print("\nId: ");
		int id= sc.nextInt();
		System.out.print("\nName: ");
		String name= sc.next();
		System.out.print("\nMobile No: ");
		String mobileNo=sc.next();
		System.out.println("\nEmail Id: ");
		String emailId=sc.next();
		System.out.println("\nDate Of Joining: ");
		String doj=sc.next();
		System.out.print("\nDepartment: ");
		dept=sc.next();
		System.out.print("\nDesignation: ");
		desg=sc.next();
		System.out.print("\nHourly charges: ");
		Double hrlyCharges=sc.nextDouble();
		System.out.print("\nHours worked: ");
		Double hrsWorked=sc.nextDouble();
		
		ce= new ContractEmp(id,name,mobileNo,emailId,doj,dept,desg,hrlyCharges,hrsWorked);
		
		return ce;
	}
	
	public static */
	
	
		
		
}
