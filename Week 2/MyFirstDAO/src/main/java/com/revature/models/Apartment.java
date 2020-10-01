package com.revature.models;

public class Apartment {
	private int id;
	private String buildingLetter;
	private int roomNumber;
	private double monthlyRent;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuildingLetter() {
		return buildingLetter;
	}
	public void setBuildingLetter(String buildingLetter) {
		this.buildingLetter = buildingLetter;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	
	
}
