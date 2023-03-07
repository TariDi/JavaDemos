import java.util.*;

public class StringDemo{
	public static void main(String args[]){
		String palindrome = "dot saw I was tod";
		int len = palindrome.length();
		StringBuffer dest = new StringBuffer();
		
		for(int i=len-1;i>=0;i--){
			dest.append(palindrome.charAt(i));
		}

		System.out.println("Destination string is- "+dest);
		System.out.println("Destination string is- "+dest.toString());
	}
}
