package com.demo.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(new File("Product.txt"));) {
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				Scanner sc1 = new Scanner(str);
				sc1.useDelimiter(":");
					/*int id = sc1.nextInt();
					String name = sc1.next();
					float price = sc1.nextFloat();
					int qty = sc1.nextInt();
				System.out.format("Id: %d; Name: %s; Price: %f; Qty: %d\n",id, name, price, qty);*/
				while(sc1.hasNext()) {
					System.out.println(sc1.next());
				}
			}
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
