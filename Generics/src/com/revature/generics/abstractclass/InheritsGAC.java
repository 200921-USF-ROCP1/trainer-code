package com.revature.generics.abstractclass;

// We can implement generic, abstract class by giving a type in
// the extends clause.
// Because generics only takes reference types, we have to use a
// wrapper class for int. Converting from primitive to wrapper is
// called 'boxing' and converting back is 'unboxing'
public class InheritsGAC extends GenericAbstractClass<Integer> {
	public Integer add(Integer a, Integer b) {
		return a + b;
	}
}
