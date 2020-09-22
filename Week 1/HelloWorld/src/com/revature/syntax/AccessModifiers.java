package com.revature.syntax;

public class AccessModifiers {
	String str;
	
	// Access Modifiers:
	// public
	// default
	// protected
	// private
	
	// Public methods and variables can be accessed 
	// from anywhere.
	public void myMethod() {
		// Instance method
		str.charAt(0); // 'H'
		
		// Static method
		String.valueOf(5); // "5"
	}
	
	// No access modifier = default access modifier:
	// Anything in the package can access
	// Also known as  package-private
	void myDefaultMethod() { }
	
	// Protected means it can accessed from inside the class
	// and any subclasses (aka child classes)
	protected void myProtectedMethod() { }
	
	// Private methods and variables cant be seen 
	// from anywhere but inside the class
	private void myPrivateMethod() { }
	
	// Classes can only be public and default unless
	// declared inside of a class
	
	private class PrivateClass { }
	
	static class StaticClass { }
}
