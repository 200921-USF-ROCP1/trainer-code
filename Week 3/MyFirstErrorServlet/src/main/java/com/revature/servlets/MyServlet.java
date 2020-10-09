package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			throw new NullPointerException("Hello from MyServlet!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
