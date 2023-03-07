package com.demo;

public class TestCoffee {

	public static void main(String[] args) {
		Coffee c = Coffee.small;
		switch(c) {
		case small: System.out.println("You selected small; quantity: "+c.getQty()+"; price: "+c.getPrice());
		break;
		
		case medium: System.out.println("You selected medium; quantity: "+c.getQty()+"; price: "+c.getPrice());
		break;
		
		case large: System.out.println("You selected large; quantity: "+c.getQty()+"; price: "+c.getPrice());
		break;
		}

	}

}
