package com.revature.dao.interfaces;

import java.util.List;

import com.revature.models.Resident;

public interface ResidentDAO {
	// A classic DAO has four basic operations: create or add; retrieve or get; update; delete
	
	public void createResident(Resident resident);
	
	public Resident getResident(int id);
	
	public void updateResident(Resident resident);
	
	public void deleteResident(Resident resident);
	
	// Not a part of the basic CRUD ops
	public List<Resident> getAllResidents();
}
