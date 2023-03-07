public class Palindrome{
	public static void main(String args[]){
		String string = "Madam, I'm Adam.";
		
		System.out.println("Testing whether the following string is a palindrome:\t"+string);
		if(isPalindrome(string))
			System.out.println("Is a palindrome:\t"+removeJunk(string));
		else System.out.println("Is not a palindrome");
	}

	public static boolean isPalindrome(String stringToTest){
		String workingCopy = removeJunk(stringToTest);
		String reverseCopy = reverse(workingCopy);

		return reverseCopy.equalsIgnoreCase(workingCopy);
	}

	protected static String removeJunk(String string){
		int i,len=string.length();
		StringBuffer temp=new StringBuffer();
		char c;
		
		for(i=len-1;i>=0;i--){
			c = string.charAt(i);
			if(Character.isLetterOrDigit(c))
				temp.append(c);
		}

		return temp.toString();		//because temp is of the type StringBuffer. toString() converts to string type.
	}

	protected static String reverse(String string){
		StringBuffer temp= new StringBuffer();
		int len= string.length();
		char c;

		for(int i=len-1; i>=0; i--){
			c = string.charAt(i);
			temp.append(c);
		}

		return temp.toString();
	}
}
