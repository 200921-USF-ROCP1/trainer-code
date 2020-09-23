package com.revature.generics;

// A generic a type-agnostic class
// in other words, it could interact with
// any given class
public class GenericThing<T> {
	T t;
	
	public GenericThing(T newT) {
		this.t = newT;
		
		System.out.println(t.toString());
	}
}
