import java.util.*;

public class RegionMatchesDemo{
	public static void main(String args[]){
		String searchMe = "Green Eggs and Ham";
		String findMe = "eggs";
		int len = findMe.length();
		boolean foundIt = false;

		int i = 0;
		while(!searchMe.regionMatches(true,i,findMe,0,len) && i<searchMe.length()){
			i++;
			if(searchMe.regionMatches(true,i,findMe,0,len))
				foundIt =true;
		}

		if(foundIt){
			System.out.println(searchMe.substring(i,i+len));
		}
		else System.out.println("Substring not found.");
		
	}
}
