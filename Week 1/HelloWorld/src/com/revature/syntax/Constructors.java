package com.revature.syntax;

public class Constructors {
	int i;
	char c;
	boolean bool;
	
	// Constructors
	// No-params constructor
	public Constructors() {
		System.out.println("Inside Jacob constructor.");
	}
	
	// Parameterized constructor
	public Constructors(int i, char c, boolean bool) {
		this.i = i;
		this.c = c;
		this.bool = bool;
	}
	
	// Java favors the most specific scope for parameters!
	// Class scope
	// Method scope
	// There is also Block scope, but you can't redefine a variable 
	// in Block scope like you can in Method scope
	
	// i here overshadows the class' i
	public void scopes(int i) {
		 // Use "this" to get to class variables in that case
		this.i = i;
	}
}
