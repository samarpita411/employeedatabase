 package com.teamsankya.employeedatabase.dto;

public class CurrentCompanyInfoBean {
	private String id;
	private String dateOfJoining;
	private String designation;
	private int costToCompany;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getCostToCompany() {
		return costToCompany;
	}
	public void setCostToCompany(int costToCompany) {
		this.costToCompany = costToCompany;
	}

	
	
}
