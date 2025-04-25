package com.hungdev.entities;

public class Major {
	private String majorID;

	private String majorName;

	private String majorType;

	public Major(String majorID, String majorName, String majorType) {
		this.majorID = majorID;
		this.majorName = majorName;
		this.majorType = majorType;
	}

	public String getMajorID() {
		return majorID;
	}

	public void setMajorID(String majorID) {
		this.majorID = majorID;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getMajorType() {
		return majorType;
	}

	public void setMajorType(String majorType) {
		this.majorType = majorType;
	}
}
