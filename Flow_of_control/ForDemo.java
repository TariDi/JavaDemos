import java.util.*;

public class ForDemo{
	public static void main(String[] args){
		int[] arrayOfInt={32,45,88,77,99};
		/*for(int i=0;i<arrayOfInt.length;i++){			//simple for loop
			System.out.print(arrayOfInt[i]+" ");
		}*/

		for(int i:arrayOfInt){
			System.out.print(i+" ");			//enhanced for loop
		}
		System.out.println();
	}
}

/**FOR LOOP:
	*Basic iterative block of code.
	*There are 3 types: Simple for loop;	enhanced for loop/for each loop;	labelled for loop
	*Simple loop- for(initialization;condition;increment/decrement)- if condition is false, the for loop terminates; else it increments/decrements and continues.
	*Enhanced loop- for(variable:collection_name/array_name)- used specifically for collections or arrays
	*Labelled loop- gives the ability to break out of certain for loops which were labelled.
	
