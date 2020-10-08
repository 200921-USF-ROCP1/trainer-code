package com.revature.servlets;

import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.implementations.ResidentDAOImpl;
import com.revature.dao.interfaces.ResidentDAO;
import com.revature.models.*;
import com.revature.services.StringUtils;

public class ResidentServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String[] parts = request.getRequestURI().split("/"); // [ "", "MyFirstAPI", "resident", ":id"? ]
		
		ResidentDAO residentDao = new ResidentDAOImpl();
		
		try {
			// if user doesnt have access, return 401
			if (parts.length == 3) {
				// If there is no ID, it is a getAll
				
				// First, we get the actual data
				List<Resident> residents =  residentDao.getAllResidents();
				
				// Next, we need to get an ObjectMapper
				ObjectMapper mapper = new ObjectMapper();
				
				// Finally, we convert our list into JSON and write it to the body
				response.getWriter().println(mapper.writeValueAsString(residents));
				
			} else if (parts.length == 4) {
				// Otherwise, the last element is an id
				if (StringUtils.isInteger(parts[3])) {
					int id = Integer.parseInt(parts[3]);
					
					Resident resident = residentDao.getResident(id);
					
					ObjectMapper mapper = new ObjectMapper();
					response.getWriter().println("For id " + id + ":");
					response.getWriter().println(mapper.writeValueAsString(resident));
				} else {
					// do some error handling
					response.getWriter().println("Invalid input");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			response.setStatus(500);
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			// Deserialize the body
			ObjectMapper mapper = new ObjectMapper();
			Resident resident = mapper.readValue(request.getReader(), Resident.class);
			
			ResidentDAO residentDao = new ResidentDAOImpl();
			residentDao.createResident(resident);
			
			response.setStatus(201);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
