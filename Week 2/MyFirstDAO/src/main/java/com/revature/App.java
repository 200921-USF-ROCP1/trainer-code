package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.revature.dao.implementations.ResidentDAOImpl;
import com.revature.dao.interfaces.ResidentDAO;
import com.revature.models.Resident;

public class App {
	public static void main(String[] args) {
		String connectionString = "jdbc:postgresql://lallah.db.elephantsql.com:5432/hcyqwvag",
				username = "hcyqwvag",
				password = "hn1iKFCKCIwuwOQrBkAuRMO9VtIDsbD-";
	
		Connection connection = null;
		
		try {		
			connection = DriverManager.getConnection(connectionString, username, password);
			
			ResidentDAO residentDao = new ResidentDAOImpl(connection);
			Resident res = new Resident();
			res.setFirstName("Ressy");
			res.setLastName("Ressison");
			res.setApartmentId(1);
			
			residentDao.createResident(res);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
