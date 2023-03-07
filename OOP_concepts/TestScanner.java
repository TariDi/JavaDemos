import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestScanner {
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		Scanner sc=null;
		PrintWriter output=null;
		
		try{
		 sc = new Scanner(new BufferedReader(new FileReader("input.txt"))).deLimiter();
		output = new PrintWriter(new FileWriter("NewOutput.txt"));
		while(sc.hasNext()){
			output.print(sc.next()+" ");
		}

		}finally{
			if(sc != null)
				sc.close();
			if(output != null)
				output.close();
		}
		
	}
}
