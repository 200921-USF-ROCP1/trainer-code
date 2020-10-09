package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			Exception e = (Exception) request.getAttribute("javax.servlet.error.exception");
			response.getWriter().println(e.getMessage());
			
			StackTraceElement[] elements = e.getStackTrace();
			for (int i = 0; i < elements.length; ++i) {
				response.getWriter().println(elements[i].toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}
}
