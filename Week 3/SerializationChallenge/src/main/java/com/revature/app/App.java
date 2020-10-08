package com.revature.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;

public class App {
	
	public static void main(String[] args) {
		try {
			BufferedReader xmlData = new BufferedReader(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
					+ "<DemoClass>\r\n"
					+ "    <b>true</b>\r\n"
					+ "    <i>10</i>\r\n"
					+ "    <s>Hello</s>\r\n"
					+ "</DemoClass>"));
			
			BufferedReader jsonData = new BufferedReader(new StringReader("{\"i\":56,\"s\":\"Hi there!\",\"b\":false}"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DemoClass marshalJson(Reader reader) {
		return new DemoClass();
	}
	
	
}

class DemoClass {
	
}
