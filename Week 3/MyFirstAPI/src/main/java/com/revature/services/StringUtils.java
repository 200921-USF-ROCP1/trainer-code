package com.revature.services;

public class StringUtils {
	public static boolean isInteger(String s) {
		if (s == null || s.length() == 0) return false;
		
		for (int i = 0; i < s.length(); ++i) {
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		
		return true;
	}
}
