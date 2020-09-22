package com.revature.syntax;

public class DataTypes {
	// Data types: all types are 2^x
	
	// Primitive types or Value types
	boolean bool; // 1 bit (true / false)
	byte b; // 8 bits, 2^3
	char c; // 16 bits 
	short s; // 16 bits, 2^4
	int i; // 32 bits, 2^5
	float f; // 32 bits
	long l; // 64 bits, 2^6
	double d; // 64 bits
	
	// Reference types contain a reference or ADDRESS
	// of something in the heap
	String str = new String("Hi Im new");
	Object o = new Object();
	// etc.
}
