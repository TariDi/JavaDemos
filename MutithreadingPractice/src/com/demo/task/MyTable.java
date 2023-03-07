package com.demo.task;

/**
 * A class consisting of functions which perform arithmetic operations
 * on an integer- print table, factorial, isPrime
 * 
 * @author Tarini
 */
public class MyTable extends Thread{
	
	/**
	 * A function that returns the multiplicative table
	 * of {@code n} from 1 to 10
	 * @param n
	 * @return result as a string
	 */
	public synchronized String printTable(int n) {
		String result="";
		for(int i=1; i<=n; i++) {
			result+= n+"*"+i+" = "+n*i+"\n";
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		return result;
	}

	/**
	 * A method which calculates the factorial of
	 * a {@code n} 
	 * @param n
	 * @return factorial as long
	 */
	public synchronized long factorial(int n) {
		long f= 1;
		for(int i=1; i<=n; i++) {
			f*=i;
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		return f;
	}
	
	/**
	 * checks if {@code n} is prime or not
	 * @param n
	 * @return true if prime and false if not prime
	 */
	public synchronized boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i == 0)
				return false;
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		return true;
	}

}
