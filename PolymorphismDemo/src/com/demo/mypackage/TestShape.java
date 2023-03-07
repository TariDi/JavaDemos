package com.demo.mypackage;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		Shape s[] = new Shape[10];
		Scanner sc= new Scanner(System.in);
		int choice= 0,i=0;
		do {
			System.out.println("Enter choice: ");
			System.out.println("1. Triangle\t2. Circle\t3. Rectangle\t4. Exit");
			System.out.print("Choice: ");
			choice= sc.nextInt();
			//Shape s= null;
			
			switch(choice) {
			
			case 1:
				s[i]= new Triangle();			//here, s[i] could not be passed to acceptDimension() even though it is referencing a triangle object.
				//Triangle t= new Triangle();		
				ShapeService.acceptDimension((Triangle)s[i]);
				//s[i]=t;
				i++;
				break;
				
			case 2:
				Circle c= new Circle();
				ShapeService.acceptDimension(c);
				s[i]=c;
				i++;
				break;
				
			case 3:
				Rectangle r= new Rectangle();
				ShapeService.acceptDimension(r);
				s[i]=r;
				i++;
				break;
				
			case 4:
				break;
			}
			

		}while(choice!=4);
		
		int tCount=0, cCount=0, rCount=0;
		
		for(int j=0; j<i; j++) {
			if(s[j] instanceof Triangle) {
				System.out.println("Triangle was created.");
				System.out.println("Area: "+s[j].area());
				System.out.println("Perimeter: "+s[j].perimeter());
				tCount++;
			}
			else if(s[j] instanceof Circle) {
				System.out.println("Circle was created.");
				System.out.println("Area: "+s[j].area());
				System.out.println("Perimeter: "+s[j].perimeter());
				cCount++;
			}
			
			else if(s[j] instanceof Rectangle) {
				System.out.println("Rectangle was created.");
				System.out.println("Area: "+s[j].area());
				System.out.println("Perimeter: "+s[j].perimeter());
				rCount++;
			}
				
		}
		sc.close();//releases sc object memory and the link of sc with keyboard will end
		
	}

}
