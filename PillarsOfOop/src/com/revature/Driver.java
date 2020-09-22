package com.revature;

public class Driver {
	public static void main(String[] args) {
		ChildOfInheritance ch = new ChildOfInheritance("Jacob", 1);
		Inheritance in = new Inheritance("Bob", 1);
		
		doTheThing(ch);
		doTheThing(in);
		
		Inheritance parentRef = new ChildOfInheritance("Jimmy", 1);
		ChildOfInheritance childRef = (ChildOfInheritance)parentRef;
		
		doMath(1, 1, new AbstractionImpl());
	}
	
	public static void doTheThing(Inheritance in) {
		in.printSelf();
	}
	
	public static int doMath(int a, int b, Abstraction abstraction) {
		return abstraction.add(a, b) / abstraction.subtract(a, b);
	}
}
