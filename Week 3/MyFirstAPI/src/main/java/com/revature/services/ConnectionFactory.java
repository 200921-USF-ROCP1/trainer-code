package com.revature.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// The ConnectionFactory carries all of the information to construct new Connections,
// but does not manage them. Its up to the programmer to close the connections once done
// with them.
public class ConnectionFactory {
	static final String connectionString = "jdbc:postgresql://lallah.db.elephantsql.com:5432/hcyqwvag",
			username = "hcyqwvag",
			password = "hn1iKFCKCIwuwOQrBkAuRMO9VtIDsbD-";
	
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(connectionString, username, password);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
