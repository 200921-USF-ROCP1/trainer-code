package com.revature.annotations;

public class Animal {
	@Deprecated
	int eyeballs = 0;
	
	public void printEyeballs() {
		System.out.print("Im a  basicanimal.");
	}
}
// Annotations are keywords preceded by an @
// and they can go over classes, methods, and variables, depending
// on the annotation
class Bird extends Animal {
	
	// Override marks a method as overriding a parent method
	@Override
	public void printEyeballs() {
		System.out.println("Probably 2");
	}
	
	// Deprecated marks a method as being phased out and 
	// shouldnt be used
	@Deprecated
	public void printEyes() {
		System.out.println("Probably 2");
	}
}

@MyAnnotation(AString = "")
class UsesBird {
	
	// SuppressWarnings prevents certain certain warnings in certain contexts
	// that are given by the IDE
	@SuppressWarnings("deprecation")
	public void useBird() {
		Bird b = new Bird();
		b.printEyes();
	}
}

// You can even make your own annotations if
// you have the gumption
@interface MyAnnotation {
	String AString() default "A default value";
	String AnotherString() default "B";
}
