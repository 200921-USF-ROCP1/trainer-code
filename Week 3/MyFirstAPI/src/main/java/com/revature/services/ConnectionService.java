package com.revature.services;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// A ConnectionService provides a centralized place to store your Connection object.
// Now whenever one is needed, you can simply call CnnectionService.getConnection() and forget about it.
// It is a Singleton. A Singleton has only one instance (or in this case, zero) and carries a centralized place for data 
// and functionality.
public class ConnectionService {
	private static Connection connection;
	
	public static Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName("org.postgresql.Driver");
				FileInputStream fis = new FileInputStream("connection.properties");
				Properties prop = new Properties();
				prop.load(fis);
				
				connection = DriverManager.getConnection(prop.getProperty("url"), 
						prop.getProperty("username"), prop.getProperty("password"));
				
				/* String url = "jdbc:postgresql://lallah.db.elephantsql.com:5432/hcyqwvag";
				String username = "hcyqwvag";
				String password = "hn1iKFCKCIwuwOQrBkAuRMO9VtIDsbD-";
				
				connection = DriverManager.getConnection(url, username, password); */
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return connection;
	}
	
	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
