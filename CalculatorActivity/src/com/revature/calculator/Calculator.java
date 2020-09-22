package com.revature.calculator;

public interface Calculator {
	// Basic operations
	public int add(int a, int b);
	
	public int subtract(int a, int b);
	
	public int multiply(int a, int b);
	
	public int divide(int a, int b);
	
	// Advanced operations
	
	// Return x to the power e
	public int exponent(int x, int e);
	// Return fib(i)
	public int fibonacci(int i);
	
	// Parse a String into parameters and an operation
	public int parse(String s);
}
