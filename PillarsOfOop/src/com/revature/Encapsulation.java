package com.revature;

/*
 * We use Encapsulation to protect our data from misuse
 * via getters and setters.
 */
public class Encapsulation {
	private int i, j, k;
	
	private String name;
	
	// We use getters to get values of private variables
	public int getI() {
		return i;
	}
	
	// Setters set a private variable to a new value
	protected void setI(int i) {
		this.i = i;
	}
	
	public String getName() {
		return name;
	}
	
	// Getters and setters can be public, but also 
	// default or protected, depending on the need
	public void setName(String name) {
		this.name = name;
	}
}
