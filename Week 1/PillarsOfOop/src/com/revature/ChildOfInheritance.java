package com.revature;

public class ChildOfInheritance extends Inheritance {
	
	public ChildOfInheritance(String name) {
		super(name, 1);
	}

	public ChildOfInheritance(String name, int age) {
		super(name, age);
	}
	
	// printSelf overrides parent's method of the same name
	public void printSelf() {
		System.out.println("I am a child!");
	}
}
