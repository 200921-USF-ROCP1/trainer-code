package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	// HttpServletRequest and HttpServletResponse represent
	// the HTTP request and response messages, including
	// all of the data and metadata we talked about
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 
			response.getWriter().println("Hello, servlet world!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
