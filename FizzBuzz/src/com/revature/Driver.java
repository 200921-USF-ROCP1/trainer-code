package com.revature;

public class Driver {
	public static void main(String[] args) {
		int testValue = 16;
		
		FizzBuzz(testValue);
	}
	
	/*
	 * Given a positive integer A, print a line for each of the integers from 1 to A.
	 * But for multiples of 3, print “Fizz” instead of the number.
	 * For the multiples of 5, print “Buzz” instead of the number.
	 * For numbers which are multiple of 3 and 5 both, print “FizzBuzz” instead of the number.
	 */
	public static void FizzBuzz(int a) {
		for (int i = 1; i <= a; ++i) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	/* Sample output for a = 5:
	 1
	 2
	 Fizz
	 4
	 Buzz
	 */
}
