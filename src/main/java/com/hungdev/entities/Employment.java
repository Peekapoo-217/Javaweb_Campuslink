package com.hungdev.entities;

import java.sql.Date;

public class Employment {
	private String nationalID;

	private Date startDate;

	private String majorID;

	private String jobTitle;

	private String companyAddress;

	private int duration;

	public Employment(String nationalID, Date startDate, String majorID, String jobTitle, String companyAddress,
			int duration) {
		super();
		this.nationalID = nationalID;
		this.startDate = startDate;
		this.majorID = majorID;
		this.jobTitle = jobTitle;
		this.companyAddress = companyAddress;
		this.duration = duration;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getMajorID() {
		return majorID;
	}

	public void setMajorID(String majorID) {
		this.majorID = majorID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
