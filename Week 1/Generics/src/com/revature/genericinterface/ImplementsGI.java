package com.revature.genericinterface;

public class ImplementsGI implements GenericInterface<Integer> {
	public Integer add(Integer a, Integer b) {
		return a + b;
	}
}
