import java.util.*;

public class HashtableDemo{
	public static void main(String args[]){
	
	Hashtable<Integer,String> myHash = new Hashtable<Integer,String>();
	
	//any object may be the key and/or value
	myHash.put(new Integer(98),"abc");
	myHash.put(new Integer(32),"def");
	myHash.put(new Integer(54),"gif");

	//can get values from hashtable using keys that is "equals" to the key in Hashtable
	System.out.println("\nHASHTABLE");
	System.out.println("\nGet value for 98:\t"+myHash.get(98));
	System.out.println("\nGet value for 32:\t"+myHash.get(32));

	//A hashtable can return an Enumeration (object) that will let you iterate over key values

	System.out.println("\nDisplay Keys in Hashtable using Enumeration:");

	Enumeration keysEnum = myHash.keys();
	while(keysEnum.hasMoreElements()){
			System.out.println(keysEnum.nextElement());
		}

	System.out.println("\nDisplay Values in Hashtable using Enumeration:");

	Enumeration valsEnum = myHash.elements();
	while(valsEnum.hasMoreElements()){
			System.out.println(valsEnum.nextElement());
		}
	}
}


