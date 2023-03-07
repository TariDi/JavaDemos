import java.util.*;

public class BreakDemo{
	public static void main(String[] args){
		int[] arrayOfInt={12,172,45,69,31,87};
		int searchFor=0;
		int i=0;
		boolean foundIt=false;

		for(;i<arrayOfInt.length;i++){
			if(arrayOfInt[i] == searchFor){
				foundIt=true;
				break;
			}
		}

		if(foundIt){
			System.out.println("Found "+searchFor+" at index "+i);
		} 
		else System.out.println(searchFor+" not found");
	}
}
