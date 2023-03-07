import java.util.*;
import java.lang.String;

public class Whiledemo{
	public static void main(String[] args){
		String copyFromMe = "Copy this string until you reach the character 'g'.";
		//StringBuffer copyToMe= new StringBuffer();
		
		int i=0;
		char c=copyFromMe.charAt(i);

		while(c!='g'){
			//copyToMe.append(c);
			System.out.print(c);
			c=copyFromMe.charAt(++i);
		}

		System.out.println(copyFromMe);
		//System.out.println(copyToMe);
	}
}
