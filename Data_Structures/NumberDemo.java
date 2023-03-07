public class NumberDemo{
	public static void main(String args[]){
		Float one = new Float(14.87f-13.78f);
		Float one_again = Float.valueOf("1.0");
		Double double_one = new Double(1.0);

		int difference = one.compareTo(one_again);

		if(difference == 0){
			System.out.println("one and one_again are equal.");
		} else if(difference > 0){
			System.out.println("one is greater than one_again.");
		} else if(difference < 0){
			System.out.println("one is less than one_again.");
		}

		System.out.println("one is "+(one.equals(double_one)?"equal ":"not equal ")+"to double_one.");
 
	}
}
