package com.hungdev.entities;

public class University {
	private String universityID;

	private String universityName;

	private String address;

	private String phoneNumber;

	public University(String universityID, String universityName, String address, String phoneNumber) {
		this.universityID = universityID;
		this.universityName = universityName;
		this.address = address;
		this.phoneNumber = phoneNumber;

	}

	public String getUniversityID() {
		return universityID;
	}

	public void setUniversityID(String universityID) {
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
