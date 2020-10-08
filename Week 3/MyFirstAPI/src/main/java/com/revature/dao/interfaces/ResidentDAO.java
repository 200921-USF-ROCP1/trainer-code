package com.revature.dao.interfaces;

import java.util.List;

import com.revature.models.Resident;

public interface ResidentDAO {
	// A classic DAO has four basic operations: create or add; retrieve or get; update; delete
	
	// POST
	public void createResident(Resident resident);
	
	// GET
	public Resident getResident(int id);
	
	// PUT
	public void updateResident(Resident resident);
	
	// DELETE
	public void deleteResident(Resident resident);
	
	// GET
	// Not a part of the basic CRUD ops
	public List<Resident> getAllResidents();
}
