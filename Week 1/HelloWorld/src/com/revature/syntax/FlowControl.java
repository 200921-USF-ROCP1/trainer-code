package com.revature.syntax;

public class FlowControl {
	
	// Control statements
	public void control(boolean yes, int val) {
		if (yes) {
			// Do something if yes is true
		} else if (val == 2) {
			// Do something if val is 2
		} else {
			
		}
		
		// For-loops iterate some n number of times
		// Format is: (declaration; statement that must be true to keep going; what do do after each iteration)
		for (int i = 0; i < val; ++i) {
			
		}
		
		for (int i = 0; ; ++i) {
			// Break immediately exits the loop
			break;
		}
		
		for ( ; yes ;) {
			// Basically a while loop
			
			if (val == 1)
				// Skips the rest of the CURRENT ITERATION and goes to the next
				continue;
		}
		
		// ++i is precrement: increment the value, then resolve the statement
		// i++ is post-cremement: resolve the statement, then increment the value
		for ( ; val++ < 5; ) { } // Compare val and 5, then increment val
		for ( ; ++val < 5; ) { } // Increment val, and then compare val and 5
		
		while (yes) {
			// Do something repeatedly while yes is true
		}
		
		do {
			// Run once, and THEN run for as long yes is true
		} while (yes);
		
		switch (val) {
		case 0:
			// Do something if val is 0
			break;
		case 1:
			// Do something if val is 1
			break;
		case 2:
			// Do something if val is 2
			break;
		default:
			// If no other cases match, do this
			break;
		}
		
	}
}
