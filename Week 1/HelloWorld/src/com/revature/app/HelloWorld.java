package com.revature.app;

import com.revature.jacob.*;

public class HelloWorld {
	// public - Can be accessed from any other context.
	// static - The method belongs to the class.
	// void - The return type. Void  means the method returns nothing.
	// String[] args - A parameter. Is an array of Strings
	public static void main(String[] args) {
		Jacob j = new Jacob();

		System.out.println("Hello world!");
	}
}
