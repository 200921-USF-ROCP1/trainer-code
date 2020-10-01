package com.revature.calculator;

public class CaclulatorImpl implements Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int exponent(int x, int e) {
		int num = 1;
		for (int i = 0; i < e; ++i ) {
			num *= x;
		}
		
		return num;
	}
	
	public int exponentRecursive(int x, int e) {
		if (e == 0)
			return 1;
		
		return x*exponentRecursive(x, e - 1);
	}

	public int fibonacci(int i) {
		if (i < 2)
			return i;
		
		else return fibonacci(i - 1) + fibonacci(i - 2);
	}

	public int parse(String s) {
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
				return add(firstNum, secondNum);
			case "-":
				return subtract(firstNum, secondNum);
			case "*":
				return multiply(firstNum, secondNum);
			case "/":
				return divide(firstNum, secondNum);
			default:
				return 0;
			
			}
		} else {
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
		}
	}
	
}
