public class ArrayDemo{
	public static void main(String args[]){
		int[] anArray;
		anArray = new int[10];

		//assign a value to each array element and print
		for(int i=0;i<anArray.length;i++){
			anArray[i]=i;
			System.out.print(anArray[i]+" ");		
		}
	}
}
