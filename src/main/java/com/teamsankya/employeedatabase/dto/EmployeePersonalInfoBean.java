package com.teamsankya.employeedatabase.dto;

public class EmployeePersonalInfoBean{
	private String id;
	private String dateOfBirth;
	private int phNumber;
	private String emailId;
	
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPhNumber() {
		return phNumber;
	}
	public void setPhNumber() {
		this.phNumber=phNumber ;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
