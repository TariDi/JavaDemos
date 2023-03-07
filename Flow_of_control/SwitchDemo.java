import java.util.*;

public class SwitchDemo{
	public static void main(String args[]){
		int month=2;
		int year=2000;
		int numofDays=0;
	
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numofDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numofDays=30;
				break;
			case 2:
				if((year%4==0) && !(year%100==0) || (year%400==0))
					numofDays=29;
				else numofDays=28;
			break;
		}
		System.out.println("Number of days= "+numofDays);
	}
}
