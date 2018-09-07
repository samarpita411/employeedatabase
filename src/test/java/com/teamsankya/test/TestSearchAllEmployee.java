package com.teamsankya.test;

import java.util.List;

import org.junit.Test;

import com.teamsankya.employeedatabase.dao.EmployeeDAOJDBCImpl;

import junit.framework.TestCase;

public class TestSearchAllEmployee {
	@Test
	public void searchAllEmployeeTest()
	{
		EmployeeDAOJDBCImpl  empDaoJdbcImpl=new EmployeeDAOJDBCImpl();
		List result=empDaoJdbcImpl.searchAllEmployee();
		TestCase.assertNotNull(result);
	
	}

}//DONE
