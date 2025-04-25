package com.hungdev.entities;

import java.sql.Date;

public class Graduation {
	private String nationalID;

	private String universityID;

	private String majorID;

	private String graduationType;

	private Date graduationDate;

	private String degreeType;

	public Graduation(String nationalID, String universityID, String majorID, String graduationType, Date graduationDate,
			String degreeType) {
		super();
		this.nationalID = nationalID;
		this.universityID = universityID;
		this.majorID = majorID;
		this.graduationType = graduationType;
		this.graduationDate = graduationDate;
		this.degreeType = degreeType;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getUniversityID() {
		return universityID;
	}

	public void setUniversityID(String universityID) {
		this.universityID = universityID;
	}

	public String getMajorID() {
		return majorID;
	}

	public void setMajorID(String majorID) {
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
