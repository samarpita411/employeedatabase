package com.teamsankya.emp.dto;

public class EmployeeMasterBean 
{
	private EmployeeInfoBean empInfoBean=new EmployeeInfoBean();
	private EmployeePersonalInfoBean empPersonalInfoBean=new EmployeePersonalInfoBean();
	private EmployeeAddressInfoBean empAddressInfoBean= new EmployeeAddressInfoBean();
	private EmployeeCompanyInfoBean empCompanyInfoBean=new EmployeeCompanyInfoBean();
	private EmployeeDesignationInfoBean empDesignationInfoBean= new EmployeeDesignationInfoBean();
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
	public EmployeeCompanyInfoBean getEmpCompanyInfoBean() {
		return empCompanyInfoBean;
	}
	public void setEmpCompanyInfoBean(EmployeeCompanyInfoBean empCompanyInfoBean) {
		this.empCompanyInfoBean = empCompanyInfoBean;
	}
	public EmployeeDesignationInfoBean getEmpDesignationInfoBean() {
		return empDesignationInfoBean;
	}
	public void setEmpDesignationInfoBean(EmployeeDesignationInfoBean empDesignationInfoBean) {
		this.empDesignationInfoBean = empDesignationInfoBean;
	}

	
	
	
}
