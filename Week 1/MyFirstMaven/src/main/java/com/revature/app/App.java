package com.revature.app;

public class App {
	int objectsNumber;
	
	// Main's scope is like a pseudo-global scope
	// Anything declared in main can be passed to ANYTHING in your program
	public static void main(String[] args) {
		
		// Lets say I need a number
		int aNumber; // Semicolon is  like "end-of-statement".
		
		// When I just type a type and name with no value, this is called "declaration".
		
		aNumber = 4; // This is a "definition". I have given a value to a variable that was already declared but not yet defined.
		
		int anotherNumber = 5; // Giving a variable an initial value is called "initialization". 
		// anotherNumber has been "initialized to 5".
		
		Object o = new Object(); // Whenever "new" is used, we are "instantiating" some object
		// Remember that an object is an INSTANCE of a class
		// new can only be used on reference types, ie objects
		
		// It's common to call temporary variables the lower case first letter of the type
		int i; char c; boolean b; String s; App a;
		
		// Scopes:
		// 1. Class
		// 2. Method
		// 3. Block { Block { Block } } 
		
		Object[] arr = { new Object() };
		ImportantClass ic = new ImportantClass(arr);
		
		// For numbers, situations where int wont work?
		// Decmials
		double d = (double)anotherNumber; // In this case, extra data is added in the form of a bunch of zeroes after the decimal. 30 -> 30.000000000
		aNumber = (int)d; // In this case, fractional is lost, eg 30.61 -> 30 
		
		// What if I just to know if something is true or false?
		boolean trulean = true, falsean = false;
		
		// Writing "if (boolean)" is equivalent to writing "if (boolean == true)"
		if (trulean == true || falsean == true || true == true) { } // Logical OR
		
		
		if (falsean && trulean) { } // Logical AND
		// Short-circuit logic: the JVM stops interpreting the boolean statement
		// as soon as it knows it will fail
		
		Object objRef = new Object();
		if (objRef != null && ((String)objRef).equals("")) { }// != is saying "not equal to"
		// Short-circuit is useful when we need to check if a reference is not null
		// before we use it
		
		
		// Comparing numbers
		int num1 = 0, num2 = 0;
		
		// Symbols are for primitives
		if (num1 < num2) {} // Checks if num1 is LESS THAN num2
		if (num1 > num2) {} // Checks if num1 is GREATER THAN num2
		if (num1 <= num2) {} // LESS THAN OR EQUAL TO
		if (num1 >= num2) {} // GREATER THAN OR EQUAL TO
		if (num1 == num2) {} // EQUAL TO
		if (num1 != num2) {} // NOT EQUAL TO
		
		// Which equals to use?
		// Single equals is for ASSIGNMENT, ie "giving a value"
		int newNumber = 5; // I'm giving newNumber the value 5.
		// Double equals is for COMPARISON, ie "comparing a value", specifically, are they equal?
		boolean areTheyEqual = (newNumber == 5);
		
		App app = new App();
		app.help(1, 2, 3);
	}
	
	public int help(int a, int b, int c) {
		
		objectsNumber = 5;
		
		return a + b + c;
	}
}
