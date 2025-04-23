package com.hungdev.dtos;

import java.sql.Date;

import org.springframework.lang.NonNull;

public class GraduateInfoRequest {
	@NonNull
	private int nationalID;

	private String fullName;

	private String email;

	private String phoneNumber;

	private String address;

	private int universityID;

	private int majorID;

	private String graduationType;

	private Date graduationDate;

	private String degreeType;

	public GraduateInfoRequest(int nationalID, String fullName, String email, String phoneNumber, String address,
			int universityID, int majorID, String graduationType, Date graduationDate, String degreeType) {
		super();
		this.nationalID = nationalID;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.universityID = universityID;
		this.majorID = majorID;
		this.graduationType = graduationType;
		this.graduationDate = graduationDate;
		this.degreeType = degreeType;
	}

	public int getNationalID() {
		return nationalID;
	}

	public void setNationalID(int nationalID) {
		this.nationalID = nationalID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUniversityID() {
		return universityID;
	}

	public void setUniversityID(int universityID) {
		this.universityID = universityID;
	}

	public int getMajorID() {
		return majorID;
	}

	public void setMajorID(int majorID) {
		this.majorID = majorID;
	}

	public String getGraduationType() {
		return graduationType;
	}

	public void setGraduationType(String graduationType) {
		this.graduationType = graduationType;
	}

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
}
