package com.demo.assignment;

import com.demo.test.Person;
import com.demo.test.SalariedEmp;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.demo.test.ContractEmp;
import com.demo.test.Employee;

public class ArrayListPrac {
	
	public static void main(String args[]) throws ParseException {
		ArrayList<Person> person = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String ans="y";
		do {
			System.out.println("Enter employee type to be inserted(salaried/ contract): ");
			String choice = sc.next();
			
			switch(choice) {
			case "salaried":
				try {
					Scanner sc1 = new Scanner(new File("/home/tarini/eclipse-workspace/CollectionDemo/src/com/demo/assignment/semp.txt"));
					while(sc1.hasNextLine()) {
						Scanner sc2 = new Scanner(sc1.nextLine());
						int id = sc2.nextInt();
						String name = sc2.next();
						String mobileNo = sc2.next();
						String emailId = sc2.next();
						String DOJ = sc2.next();
						String dept = sc2.next();
						String desg = sc2.next();
						double salary = sc2.nextDouble();
						double bonus = sc2.nextDouble();
						
						Person p = new SalariedEmp(id,name,mobileNo,emailId,DOJ,dept,desg,salary,bonus);
						if(!person.contains(p))
							person.add(p);
						else
							System.out.println("Entry already exists at "+person.indexOf(p));

					}
					sc1.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();

				}
				break;
				
			case "contract":
				try {
					Scanner sc3 = new Scanner(new File("/home/tarini/eclipse-workspace/CollectionDemo/src/com/demo/assignment/cemp.txt"));
					while(sc3.hasNextLine()) {
						Scanner sc2 = new Scanner(sc3.nextLine());
						int id = sc2.nextInt();
						String name = sc2.next();
						String mobileNo = sc2.next();
						String emailId = sc2.next();
						String DOJ = sc2.next();
						String dept = sc2.next();
						String desg = sc2.next();
						double hrlyCharges = sc2.nextDouble();
						double hrsWorked = sc2.nextDouble();
						
						Person p = new ContractEmp(id,name,mobileNo,emailId,DOJ,dept,desg,hrlyCharges,hrsWorked);
						if(!person.contains(p))
							person.add(p);
						else
							System.out.println("Entry already exists at "+person.indexOf(p));
						
					}
					sc3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
				
			default:
				System.out.println("Invalid Option");
				
			}
			System.out.println("Do you wish to continue?(y/n)");
			ans = sc.next();
		}while(ans.equals("y"));
		
		System.out.println(person);
		
		HashMap<Integer,Double> salary = new HashMap<>();
		
		Iterator<Person> it = person.iterator();
		
		while(it.hasNext()) { 
			Person temp = it.next();
			salary.put(temp.getId(), temp.calculateSalary());
		}
		
		System.out.println(salary);
	
	}
}
