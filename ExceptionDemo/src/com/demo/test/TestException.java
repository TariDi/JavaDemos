package com.demo.test;

import java.util.Scanner;

import com.demo.exception.NegativeValueException;

public class TestException {
	public static float divide(int a,int b) throws NegativeValueException {
		try {
			if(b<0 || a<0) {
				throw new NegativeValueException("a and b cannot be negative");	//built-in exceptions can be thrown explicitly
			}
			System.out.println("In divide method");
			return (a/b);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
			//return 0.0f;
		}
	}

	public static void main(String[] args) {
		String str="hello"; //local variables must be initialized
		/*String str;
		 * str="hhh";	//this is assignment
		 */
		//int[] intarr = new int[10];	//declaration of array (only memory allocation)
		int[] intarr = {12,13,14,25,26};	//initialization (and memory allocation)
		//intarr[0]=12;	//assignment (assignment of array can only be done one at a time)
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("String length: "+str.length());
			int i=sc.nextInt();
			System.out.println(divide(12,13));
			System.out.println(divide(34,0));
			System.out.println("In try block");
		}catch(NullPointerException| ArrayIndexOutOfBoundsException | NegativeValueException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}*/
		finally {
			//closing all resources
			System.out.println("In finally block");
		}
		System.out.println("End of main method");

	}

}
