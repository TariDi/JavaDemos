package com.demo.test;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class CollectionsAlgoDemo {

	public static void main(String[] args) {
		List list = Arrays.asList("aaa bb ccc ddd eee".split(" "));
		List sublist = Arrays.asList("eee ttt".split(" "));
		List searchList = Arrays.asList("eee");
		System.out.println("Elements in the list: "+list);
		//create a copy of defined list and print objects of copy list
		//This will overwrite first 2 entries
		Collections.copy(list, sublist);
		System.out.println("copy of the list: "+list);
		//find and display maximum and minimum object value from the list
		System.out.println("object of max value: "+Collections.max(list));
		System.out.println("object of min value: "+Collections.min(list));
		//search the list for a value and display the first occurrence of sublist in list
		System.out.println("First index of 'eee'"+Collections.indexOfSubList(list,searchList));
		//search last occurrence of sublist
		System.out.println("Last index of 'eee'"+Collections.lastIndexOfSubList(list, searchList));
		//replace all objects in list by a new given object
		Collections.replaceAll(list, "eee", "replaced");
		System.out.println(list);
		//list in reverse order
		Collections.reverse(list);
		System.out.println("List in reverse order: "+list);
		//rotate the given no of objects in list, here 4
		Collections.rotate(list, 4); //right to left
		System.out.println("After rotation: "+list);
		//find size of the list
		System.out.println("Size of the list: "+list.size());
		/*Swap elements in list*/
		Collections.swap(list, 0, list.size()-1);
		//Replace all elements with given elements using fill()
		Collections.fill(list, "replaced");
		System.out.println("After filling all 'replaced' in list"+list);
		//ncopies returns immutable list consisting of copies
		List raviList = Collections.nCopies(3, "Ravi");
		System.out.println("List created by ncopy()"+raviList);
		
		//getting enum type specified list through enumeration().
		Enumeration e = Collections.enumeration(raviList);
		Vector v = new Vector();
		while(e.hasMoreElements()) {
			v.addElement(e.nextElement());
		}
		ArrayList arraylist = Collections.list(v.elements());
		System.out.println("arraylist: "+arraylist);

	}

}
