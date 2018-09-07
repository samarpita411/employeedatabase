package com.teamsankya.test;

import org.junit.Test;

import com.teamsankya.employeedatabase.dao.EmployeeDAOJDBCImpl;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

import junit.framework.TestCase;

public class TestSearchEmployee {
	@Test
	public void searchEmployeeBooleanTest()
	{
		EmployeeDAOJDBCImpl  empDaoJdbcImpl=new EmployeeDAOJDBCImpl();
		EmployeeMasterBean result=empDaoJdbcImpl.searchEmployee("abc002");
		TestCase.assertNotNull(result);
	
	}

}//DONE
