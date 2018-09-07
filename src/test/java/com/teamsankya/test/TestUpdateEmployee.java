package com.teamsankya.test;

import org.junit.Test;

import com.teamsankya.employeedatabase.dao.EmployeeDAOJDBCImpl;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

import junit.framework.TestCase;

public class TestUpdateEmployee {
	
	@Test
	public void updateEmployeeTest()
	{
		EmployeeDAOJDBCImpl  empDaoJdbcImpl=new EmployeeDAOJDBCImpl();
		EmployeeMasterBean data=new EmployeeMasterBean();
		data.getEmpInfoBean().setId("abc111");
		data.getEmpInfoBean().setFirstname("anu");
		data.getEmpInfoBean().setLastname("sharma");
		
		data.getPreviousCompanyInfoBean().setExperience(5);
		data.getPreviousCompanyInfoBean().setLastCompanyName("techchy");
      
        data.getEmpPersonalInfoBean().setDateOfBirth("04-05-2000");
		data.getEmpPersonalInfoBean().setPhNumber(1231231234);
		data.getEmpPersonalInfoBean().setEmailId("vvhj@gmail.com");
		
		data.getCurrentCompanyInfoBean().setDateOfJoining("07-05-2018");
		data.getCurrentCompanyInfoBean().setDesignation("analyst");
		data.getCurrentCompanyInfoBean().setCostToCompany(12000);
		
		data.getEmpAddressInfoBean().setAddress1("ewed");
		data.getEmpAddressInfoBean().setAddress2("dede");
		data.getEmpAddressInfoBean().setCity("fes");
		data.getEmpAddressInfoBean().setPincode(123456);
					
		boolean result=empDaoJdbcImpl.updateEmployee(data);
		TestCase.assertEquals(true, result);
	}


}//DONE
