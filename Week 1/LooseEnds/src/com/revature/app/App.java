package com.revature.app;

import com.revature.finallyize.WhatIsFinal;

/*
 * Annotations, including Override and Deprecated
 * final vs finalize vs finally
 * Var args (or the ...)
 */
public class App {
	public static void main(String[] args) {
		String a = "Hello", b = "there", c ="friend!";
		
		// If you use array, you need to create one
		String[] arr = {a, b, c};
		printArgs(arr);
		
		printVarArgs(a, b, c);
		printVarArgs();
		
		printVarArgs(arr);
		
		// Methods like printf use them!
		System.out.printf("%d %d %d", 1, 2, 3);
		
		WhatIsFinal f = new WhatIsFinal();
	}
	
	public static void printArgs(String[] strings) {
		for (int i = 0; i < strings.length; ++i) {
			System.out.println(strings[i]);
		}
	}
	
	// Var args uses ellipsis instead of array symbol
	// to take 0 or more arguments
	public static void printVarArgs(String... strings) {
		for (int i = 0; i < strings.length; ++i) {
			System.out.println(strings[i]);
		}
	}
	
	// Other parameters can be used, but the varargs must be the last parameter
	// and only one parameter can be varargs
	public static void aNameAndSomeStrings(String name, String... strings) {
		
	}
	
	
}
