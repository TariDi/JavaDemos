package com.demo.test;


import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String args[]) throws ParseException {
		Set<Person> ob = new HashSet<>();
		ob.add(new Person(12,"aaa","1111","abc","22/12/2017"));
		/*if(ob.add(new Person(12,"aaa","1111","abc","22/12/2017"))) {
			System.out.println("Added");
		}
		else System.out.println("Duplicate");*/
		ob.add(new Person(13,"bbb","2222","def","12/12/2017"));
		ob.add(new Person(14,"ddd","3333","xyz","01/12/2017"));
		/*if(ob.contains(new Person(14,"ddd","3333","xyz","01/12/2017"))){
			System.out.println("Exists");
		}else
			System.out.println("Does not exist");
		System.out.println(ob);*/

		/*for(Person p:ob) {
			if(p.getId()==12) {
				p.setEmailId("uuu");
			}
		}
		System.out.println(ob);*/
		
		Iterator<Person> it = ob.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
			if(p.getId() == 12) {
				it.remove();
			}
		}
		System.out.println(ob);
	}
}
