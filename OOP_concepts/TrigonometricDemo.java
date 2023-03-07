public class TrigonometricDemo{
	public static void main(String[] args){
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		System.out.println("Value of pi is "+Math.PI);
		System.out.println("Sine of "+degrees+" is "+Math.sin(radians));
		System.out.println("Cosine of "+ degrees +" is "+Math.cos(radians));
		System.out.println("Tangent of "+ degrees +" is "+Math.tan(radians));
		System.out.println("The arc sine of "+Math.sin(radians)+" is "+Math.toDegrees(Math.asin(Math.sin(radians))));
	}
}
