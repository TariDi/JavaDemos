package com.demo.test;

import java.text.ParseException;
import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) throws ParseException {
		ArrayList<Person> ob = new ArrayList<>();
		ob.add(new Person(12,"aaa","1111","abc","22/12/2017"));
		ob.add(new Person(13,"bbb","2222","def","12/12/2017"));
		ob.add(new Person(14,"ddd","3333","xyz","01/12/2017"));
		if(ob.contains(new Person(14,"ddd","3333","xyz","01/12/2017"))){
			System.out.println("Exists");
		}else
			System.out.println("Does not exist");
		System.out.println(ob);
		
		
		ob.add(new SalariedEmp(12,"aaa","1111","abc","22/12/2017","Accounting","VP",40000,2000));
		ob.add(new ContractEmp(13,"bbb","2222","def","12/12/2017","Training","VP",35000,1500));
		Person test = new Person(13,"bbb","2222","def","12/12/2017");
		if(ob.contains(test))
			System.out.println("Exists; index: "+ob.indexOf(test));
		else System.out.println("Does not exist");
		
		/*Person p1 = new Person(12,"aaa","1111","abc","22/12/2017");
		Person p2 = new Person(12,"aaa","1111","abc","22/12/2017");

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		if(p1.equals(p2)) {
			System.out.println("objects are equal");
		}else System.out.println("objects are not equal");*/
	}

}
