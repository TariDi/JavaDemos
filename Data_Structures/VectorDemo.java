import java.util.*;

public class VectorDemo{
	public static void main(String args[]){
		
		//create new Vector instance
		Vector<String> v = new Vector<String>();
	
		//add objects to the vector
		v.addElement("abc");
		v.addElement("def");
		v.addElement("ghi");
		v.addElement("jkl");

		//print elements of Vector
		for(int i=0; i<v.size(); i++){
			System.out.println(v.elementAt(i));		
		}

		//info about contents
		System.out.println("Size="+v.size()+"  Capacity="+v.capacity()+"  isEmpty="+v.isEmpty());

		//remove an element
		v.removeElementAt(2);
		System.out.println("\nRemoving element at 2. Vector now looks like:");

		//print elements of Vector
		for(int i=0; i<v.size(); i++){
			System.out.println(v.elementAt(i));		
		}

		//info about contents
		System.out.println("Size="+v.size()+"  Capacity="+v.capacity()+"  isEmpty="+v.isEmpty());

		//using an object from a Vector means casting
		System.out.println("\nVectors, Iterators, instanceof and casting.");
		Vector<String> vnew = new Vector<String>();
		vnew.addElement("ONE");
		vnew.addElement("TWO");
		vnew.addElement("THREE");
		vnew.addElement("FOUR");
		vnew.addElement("FIVE");
		
		Iterator iter = vnew.iterator();
		Object myObj = null;
		String myS = null;
		while(iter.hasNext()){
			myObj = iter.next();

			System.out.print("next="+myObj);
			if(myObj instanceof String){
				myS = (String)myObj;
				System.out.println(" lowercase is: "+myS.toLowerCase());
			}
			else System.out.println();
		}
	}
}
