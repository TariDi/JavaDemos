import java.util.*;

public class MaxVariables{
	public static void main(String args[]){
		System.out.println("Value of largest byte= "+Byte.MAX_VALUE);
		System.out.println("Value of largest integer= "+Integer.MAX_VALUE);
		System.out.println("Value of largest short= "+Short.MAX_VALUE);
		System.out.println("Value of largest long= "+Long.MAX_VALUE);
		System.out.println("Value of largest float= "+Float.MAX_VALUE);
		System.out.println("Value of largest double= "+Double.MAX_VALUE);
		char achar='a';
		boolean b=true;
		if(Character.isUpperCase(achar))
			System.out.println("The character is uppercase: " +achar);
		else
			System.out.println("The character is lowercase: " +achar);
		System.out.println("The value of b= "+b);
	}
} 

/**Here, we use classes Byte,Integer,Short,Long,Float and Double which are all subclasses of abstract superclass Number.
  *The above classes wrap respective data types in objects.
  *MAX_VALUE is a field in each class which holds the largest positive finite value of that data type.
*/
