package com.revature.generics;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Driver> arr = new ArrayList<Driver>();
		
		String s = "Hello there!";
		GenericThing<String> gt = new GenericThing<String>(s);
	}
}
