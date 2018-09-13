package com.teamsankya.test;

import org.junit.Test;

import com.teamsankya.employeedatabase.dao.EmployeeDAOJDBCImpl;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

import junit.framework.TestCase;

public class TestCreateEmployee {

	@Test
	public void createEmployeeStringTest()
	{
		EmployeeDAOJDBCImpl  empDaoJdbcImpl=new EmployeeDAOJDBCImpl();
		EmployeeMasterBean data=new EmployeeMasterBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			data.getEmpInfoBean().setId("abc222");
			data.getEmpInfoBean().setFirstname("kylie");
			data.getEmpInfoBean().setLastname("simpson");
			
			data.getPreviousCompanyInfoBean().setExperience(5);
			data.getPreviousCompanyInfoBean().setLastCompanyName("techchy");
	      
	        data.getEmpPersonalInfoBean().setDateOfBirth("04-08-2000");
			data.getEmpPersonalInfoBean().setPhNumber(1231231239);
			data.getEmpPersonalInfoBean().setEmailId("vfdbn@gmail.com");
			
			data.getCurrentCompanyInfoBean().setDateOfJoining("07-07-2018");
			data.getCurrentCompanyInfoBean().setDesignation("analyst");
			data.getCurrentCompanyInfoBean().setCostToCompany(12000);
			
			data.getEmpAddressInfoBean().setAddress1("ewed");
			data.getEmpAddressInfoBean().setAddress2("dede");
			data.getEmpAddressInfoBean().setCity("fes");
			data.getEmpAddressInfoBean().setPincode(123456);
			
			
			String result=empDaoJdbcImpl.createEmployee(data);
			TestCase.assertNotNull(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
