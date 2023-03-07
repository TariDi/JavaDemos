public class BostonAccentDemo{
	private static void bostonAccent(String sentence){
		String translatedSentence = sentence.replace('r','h');
		System.out.println(translatedSentence);
	}

	public static void main(String args[]){
		String translateThis = "Park the car in Harvard Yard.";
		bostonAccent(translateThis);
	}
}
