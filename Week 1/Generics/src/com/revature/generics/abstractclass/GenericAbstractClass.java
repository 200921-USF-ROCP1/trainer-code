package com.revature.generics.abstractclass;

public abstract class GenericAbstractClass<T> {
	
	public abstract T add(T a, T b);
	
	public String toString() {
		return "I am a generic class.";
	}
}
