import java.util.*;

public class StackDemo{
	public static void main(String args[]){
		Stack<String> stack = new Stack<String>();

		stack.push("abc");
		stack.push("def");
		stack.push("ghi");

		System.out.println("\nPop the stack:\t"+stack.pop());

		//can use Vector methods since Stack is subclass of Vector
		System.out.println("Stack at position 1:\t"+stack.elementAt(1));
	}
}
