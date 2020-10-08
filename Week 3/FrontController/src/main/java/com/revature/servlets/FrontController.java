package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * A Front Controller is a singular servlet that acts as the router
 * for all requests.
 * Technically, you could get away with only having this one servlet
 * and just handling the requests with your own services or classes.
 * You could also route requests to other servlets if you wanted to.
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getRequestURI(); // /FrontController/MyServlet/1?search=hello&id=9&age=17
		String[] parts = path.split("/"); // [ "", "FrontController", "MyServlet", "1"]
		
		request.getQueryString(); // search=hello&id=9&age=17
		String[] queryParameters = request.getQueryString().split("&");
		
		// /cars/:id, /users/:id. I want to call CarDAOImpl.get(id) for one, and userDAOImpl.get(id) for the other
		switch (parts[2]) {
		case "car":
			// I could call a CarService here and pass request and response to deal with them there
			// I could also get the data from the request and pass them to my DAO here
			break;
		case "user":
			break;
		}
		
		// To path match /car/1: /car/*. What if I wanted car/1/version/1. Url path? car/1/version/*
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
