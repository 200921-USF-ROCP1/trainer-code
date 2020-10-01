package com.revature.dao.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.interfaces.ResidentDAO;
import com.revature.models.Resident;

public class ResidentDAOImpl implements ResidentDAO {

	Connection connection;
	
	public ResidentDAOImpl(Connection connection) {
		this.connection = connection;
	}
	
	public void createResident(Resident resident) {
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("INSERT INTO residents (first_name, last_name, apartment_id) VALUES ('" 
					+ resident.getFirstName() + "', '" + resident.getLastName() + "', " 
					+ resident.getApartmentId() + ");");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Resident getResident(int id) {
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM residents WHERE id = ?");
			ps.setInt(1, id);
			
			// We use executeQuery because it is a DQL command.
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Resident resident = new Resident();
				resident.setId(rs.getInt("id"));
				resident.setFirstName(rs.getString("first_name"));
				resident.setLastName(rs.getString("last_name"));
				resident.setApartmentId(rs.getInt("apartment_id"));
				
				return resident;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// There were 0 records returned
		return null;
	}

	public void updateResident(Resident resident) {
		try {
			// In order to update the record, we will use the UPDATE command
			PreparedStatement ps = connection.prepareStatement("UPDATE residents"
					+ " SET first_name = ?, last_name = ?, apartment_id = ?"
					+ " WHERE id = ?;");
			
			// Because we have four ?s, we need for sets
			ps.setString(1, resident.getFirstName());
			ps.setString(2, resident.getLastName());
			ps.setInt(3, resident.getApartmentId());
			ps.setInt(4, resident.getId());
			
			// We use executeUpdate because it is a DML command
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteResident(Resident resident) {
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM residents WHERE id = ?;");
			ps.setInt(1, resident.getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Resident> getAllResidents() {
		List<Resident> residents = new ArrayList<Resident>();
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM residents;");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Resident resident = new Resident();
				resident.setId(rs.getInt("id"));
				resident.setFirstName(rs.getString("first_name"));
				resident.setLastName(rs.getString("last_name"));
				resident.setApartmentId(rs.getInt("apartment_id"));
				
				residents.add(resident);
			}
			
			return residents;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
