package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	
	public static void main(String[] args) {
		String connectionString = "jdbc:postgresql://lallah.db.elephantsql.com:5432/hcyqwvag",
				username = "hcyqwvag",
				password = "hn1iKFCKCIwuwOQrBkAuRMO9VtIDsbD-";
	
		Connection connection = null;
		
		try {
			// This can help 
			Class.forName("org.postgresql.Driver");
			
			// The Connection object represents our authenticated connection to our database
			// Its where Statement and PreparedStatement objects come from
			connection = DriverManager.getConnection(connectionString, username, password);
			
			regularStatement(connection);
			
			preparedStatement(connection);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// We should close our connection at the end.
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void regularStatement(Connection connection) throws SQLException {
		// The Statement object doesn't represent a statement; it's the vehicle for running statements
		Statement stmt = connection.createStatement();
		
		// We use our Statement to execute a query, which will return a ResultSet
		// ResultSets contain the rows returned by the query
		ResultSet rs = stmt.executeQuery("select * from residents;");
		
		// ResultSet has an internal iterator that starts at the row above the first row.
		// We move it along by calling ResultSet.next().
		// If there is no next row, next() returns false.
		while (rs.next()) {
			// In order to get data out of the row, we can call a variety of get methods, such as
			// ResultSet.getString, and give either the column number or name as the parameter
			// to identify the column.
			System.out.println(rs.getString(1) + " " + rs.getString("last_name"));
		}
	}
	
	public static void preparedStatement(Connection connection) throws SQLException {
		// PreparedStatements are Statements that have question marks in them. The ?s represent
		// parameters, or variables, that are then set after the PreparedStatement is created.
		// The ?s can be anything.
		PreparedStatement ps = connection.prepareStatement("select * from residents where id = ?");
		
		// We use PreparedStatement.set<Type>(position, value) to set the value of a particular parameter.
		// As with columns in ResultSet.gets, the first ? is number 1.
		ps.setInt(1, 2);
		
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
		}
	}
}
