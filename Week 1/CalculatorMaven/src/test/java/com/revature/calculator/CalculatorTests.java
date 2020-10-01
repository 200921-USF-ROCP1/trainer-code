package com.revature.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTests {

	@Test
	public void test1() {
		// Set up
		Calculator calc = new CaclulatorImpl();
		
		int a = 3, b = 2;
		int testAnswer = 5;
		
		// Execute
		int actualAnswer = calc.add(a, b);
		
		// Verify
		Assertions.assertEquals(testAnswer, actualAnswer);
		
		// Tear down
	}
}
