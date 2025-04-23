package com.hungdev.entities;

public class University {
	private int universityID;

	private String universityName;

	private String address;

	private String phoneNumber;

	public University(int universityID, String universityName, String address, String phoneNumber) {
		this.universityID = universityID;
		this.universityName = universityName;
		this.address = address;
		this.phoneNumber = phoneNumber;

	}

	public int getUniversityID() {
		return universityID;
	}

	public void setUniversityID(int universityID) {
		this.universityID = universityID;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
