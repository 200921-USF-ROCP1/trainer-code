package com.revature.generic.array;

public class GenericArray<T> {
	Object[] arr;
	T[] tarr;
	
	public GenericArray(T t) {
		// The cool Kevin way
		tarr = (T[])(new Object[10]);
		
		// The painful way
		arr = new Object[10];
		
		arr[0] = (Object)t;
		T otherT = (T)arr[0];
	}
}
