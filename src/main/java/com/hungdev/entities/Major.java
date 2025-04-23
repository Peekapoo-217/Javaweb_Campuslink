package com.hungdev.entities;

public class Major {
	private int majorID;

	private String majorName;

	private String majorType;

	public Major(int majorID, String majorName, String majorType) {
		this.majorID = majorID;
		this.majorName = majorName;
		this.majorType = majorType;
	}

	public int getMajorID() {
		return majorID;
	}

	public void setMajorID(int majorID) {
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
