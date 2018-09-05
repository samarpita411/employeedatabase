package com.teamsankya.employeedatabase.dto;

public class EmployeeMasterBean 
{   
	private EmployeeInfoBean empInfoBean=new EmployeeInfoBean();
	private EmployeePersonalInfoBean empPersonalInfoBean=new EmployeePersonalInfoBean();
	private EmployeeAddressInfoBean empAddressInfoBean= new EmployeeAddressInfoBean();
	private PreviousCompanyInfoBean previousCompanyInfoBean=new PreviousCompanyInfoBean();
	private CurrentCompanyInfoBean currentCompanyInfoBean= new CurrentCompanyInfoBean();
	public EmployeeInfoBean getEmpInfoBean() {
		return empInfoBean;
	}
	public void setEmpInfoBean(EmployeeInfoBean empInfoBean) {
		this.empInfoBean = empInfoBean;
	}
	public EmployeePersonalInfoBean getEmpPersonalInfoBean() {
		return empPersonalInfoBean;
	}
	public void setEmpPersonalInfoBean(EmployeePersonalInfoBean empPersonalInfoBean) {
		this.empPersonalInfoBean = empPersonalInfoBean;
	}
	public EmployeeAddressInfoBean getEmpAddressInfoBean() {
		return empAddressInfoBean;
	}
	public void setEmpAddressInfoBean(EmployeeAddressInfoBean empAddressInfoBean) {
		this.empAddressInfoBean = empAddressInfoBean;
	}
	public PreviousCompanyInfoBean getPreviousCompanyInfoBean() {
		return previousCompanyInfoBean;
	}
	public void setPreviousCompanyInfoBean(PreviousCompanyInfoBean previousCompanyInfoBean) {
		this.previousCompanyInfoBean = previousCompanyInfoBean;
	}
	public CurrentCompanyInfoBean getCurrentCompanyInfoBean() {
		return currentCompanyInfoBean;
	}
	public void setCurrentCompanyInfoBean(CurrentCompanyInfoBean currentCompanyInfoBean) {
		this.currentCompanyInfoBean = currentCompanyInfoBean;
	}
	
	
	
	
	
}
