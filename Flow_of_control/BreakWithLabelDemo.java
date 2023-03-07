import java.util.*;

public class BreakWithLabelDemo{
	public static void main(String args[]){
		int[][] arrayOfInt={{45,32,12},{71,89,100,91,60},{32,123,111}};
		int searchFor=60;
		int i=0;
		int j=0;
		boolean foundIt=false;
		
		search:
		for(;i<arrayOfInt.length;i++){
			for(j=0;j<arrayOfInt[i].length;j++){
				if(arrayOfInt[i][j] == searchFor){
					foundIt=true;
					break search;		
				}
			}
		}

		if(foundIt){
			System.out.println("Found "+searchFor+" at ("+i+" , "+j+")");
		}
		else System.out.println(searchFor+" not found");
	}
}
