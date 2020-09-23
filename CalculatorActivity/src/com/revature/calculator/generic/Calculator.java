package com.revature.calculator.generic;

public interface Calculator<T extends Number> {
	// Basic operations
	public double add(T a, T b);
	
	public double subtract(T a, T b);
	
	public double multiply(T a, T b);
	
	public double divide(T a, T b);
	
	// Advanced operations
	
	// Return x to the power e
	public double exponent(T x, T e);
	// Return fib(i)
	public double fibonacci(T i);
	
	// Parse a String into parameters and an operation
	// eg, given "5 + 2", return add(5, 2)
	// Look into String.split()
	public double parse(String s);

}
