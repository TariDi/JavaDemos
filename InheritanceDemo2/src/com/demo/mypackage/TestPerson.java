package com.demo.mypackage;

import java.text.ParseException;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		//Person p=new Person(12,"Tarini","2222","abc@xyz.com",new Date());
		//Employee e=new Employee(12,"Tarini","2222","abc@xyz.com",new Date(),"Training","VP");
		//System.out.println(p);- prints reference of Person object p(without overriding toString() method)
		//System.out.println(p);	//prints properties since we have overriden toString() in Person class
		/*SalariedEmp se=new SalariedEmp(12,"Tarini","2222","abc@xyz.com",new Date(),"Training","VP",35000,10000);
		System.out.println("Salary of employee= "+se.calculateSalary());
		ContractEmp ce=new ContractEmp(13,"Riya","111","def@xyz.com",new Date(),"Training","VP",1000,8.5);
		System.out.println("Salary of contract employee= "+ce.calculateSalary());*/
		
		/*String[] s= {"Gym","Swimming Pool","Locker Rooms","Jogging Track"};
		
		Member m=new Member(12,"Tarini","2222","abc@xyz.com",new Date(),"Temporary",4000,s);
		System.out.println(m);*/
		
		/*String[] s= {"Treadmill","Eliptical Trainer","Bench press","Spin cycle"};
		
		Supplier su= new Supplier(12,"Tarini","2222","abc@xyz.com","21/01/2017","Gaikwad Nagar, Aundh, Pune-07",s);
		System.out.println(su);*/
		
		Person[] p= new Person[10];
		
		PersonService.acceptDetails(p);
		
		for(int i=0;i<p.length;i++) {
			if(p[i] != null) {
				System.out.println(p[i]);
			}else break;
		}
	}

}
