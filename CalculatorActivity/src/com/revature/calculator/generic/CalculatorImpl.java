package com.revature.calculator.generic;

import com.revature.calculator.generic.Calculator;


public class CaclulatorImpl<T extends Number> implements Calculator<T> {

	@Override
	public double add(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}

	@Override
	public double subtract(T a, T b) {
		return a.doubleValue() - b.doubleValue();
	}

	@Override
	public double multiply(T a, T b) {
		return a.doubleValue() * b.doubleValue();
	}

	@Override
	public double divide(T a, T b) {
		return a.doubleValue() / b.doubleValue();
	}

	@Override
	public double exponent(T x, T e) {
		double num = 1;
		for (int i = 0; i < e.intValue(); ++i ) {
			num *= x.doubleValue();
		}
		
		return num;
	}
	
	/* public double exponentRecursive(T x, T e) {
		if (e.intValue() == 0)
			return 1;
		
		return x.doubleValue()*exponentRecursive(x, e - 1);
	}

	@Override
	public int fibonacci(int i) {
		if (i < 2)
			return i;
		
		else return fibonacci(i - 1) + fibonacci(i - 2);
	} */

	@Override
	public double parse(String s) {
		// "5 + 2"
		String[] parts = s.split(" ");
		
		// "fib E e E"
		
		//								  0    1    2
		// Now we have array like this: ["5", "+", "2"]
		
		if (Character.isDigit(parts[0].charAt(0))) {
			int firstNum = Integer.parseInt(parts[0]),
					secondNum = Integer.parseInt(parts[2]);
			
			switch(parts[1]) {
			case "+":
				return add((Number)new Integer(firstNum), (Number) new Integer(secondNum));
			case "-":
				return subtract(firstNum, secondNum);
			case "*":
				return multiply(firstNum, secondNum);
			case "/":
				return divide(firstNum, secondNum);
			default:
				return 0;
			
			}
		} /* else {
			switch (parts[0]) {
			case "fib":
				// fib 25
				return fibonacci(Integer.parseInt(parts[1]));
			case "exp":
				// exp 10 2
				return exponent(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
			default:
				return 0;
			}
		} */
	}
	
}

