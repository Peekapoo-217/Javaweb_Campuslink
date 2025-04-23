package com.hungdev.entities;

import java.sql.Date;

public class Graduation {
	private int nationalID;

	private int universityID;

	private int majorID;

	private String graduationType;

	private Date graduationDate;

	private String degreeType;

	public Graduation(int nationalID, int universityID, int majorID, String graduationType, Date graduationDate,
			String degreeType) {
		super();
		this.nationalID = nationalID;
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
