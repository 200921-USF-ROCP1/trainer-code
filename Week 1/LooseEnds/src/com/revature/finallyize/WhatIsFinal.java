package com.revature.finallyize;

// Final vs finally vs finalize

// Final classes cannot be extended
public final class WhatIsFinal {
	// Final variables cannot be changed after initialization
	final int b = 5;
	
	// Final methods cannot be overridden
	public final void doStuff() {
		
	}
	
	public void doFinally() {
		try {
			
		} catch (Exception e) {
			
		} finally {
			// This block always runs
			// even if the method has returned
		}
	}
	
	// finalize is run right before the object 
	// is destroyed by the Garbage Collector
	@Override
	public void finalize() {
		// I will run once, upon my death
		
		// Just for logic that pertains to the program;
		// low-level stuff is left to the JVM
		
		// Release resources here that exist for the
		// life of the method
	}
}
