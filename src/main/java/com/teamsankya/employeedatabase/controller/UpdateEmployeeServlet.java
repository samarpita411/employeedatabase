package com.teamsankya.employeedatabase.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.dto.EmployeeAddressInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeCompanyInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeDesignationInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;
import com.teamsankya.employeedatabase.dto.EmployeePersonalInfoBean;
import com.teamsankya.employeedatabase.factory.EmployeeServiceManager;

public class UpdateEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setId((req.getParameter("id")));
		employeeInfoBean.setFirstname(req.getParameter("firstname"));
		employeeInfoBean.setLastname(req.getParameter("lastname"));
		
		EmployeePersonalInfoBean employeePersonalInfoBean = new EmployeePersonalInfoBean();
	    employeePersonalInfoBean.setId((req.getParameter("id")));
	    employeePersonalInfoBean.setDateOfBirth(req.getParameter("dateOfBirth"));
	    employeePersonalInfoBean.setPhNumber(Integer.parseInt(req.getParameter("phNumber")));
	    employeePersonalInfoBean.setEmailId(req.getParameter("emailId"));
	    
	    EmployeeAddressInfoBean employeeAddressInfoBean = new EmployeeAddressInfoBean();
	    employeeAddressInfoBean.setId((req.getParameter("id")));
	    employeeAddressInfoBean.setAddress1(req.getParameter("address1"));
	    employeeAddressInfoBean.setAddress2(req.getParameter("address2"));
	    employeeAddressInfoBean.setCity(req.getParameter("city"));
	    employeeAddressInfoBean.setPincode(Integer.parseInt(req.getParameter("pincode")));
	    
        EmployeeCompanyInfoBean employeeCompanyInfoBean = new EmployeeCompanyInfoBean();
        employeeCompanyInfoBean.setId((req.getParameter("id")));
        employeeCompanyInfoBean.setDateOfJoining(req.getParameter("dateOfJoining"));
        employeeCompanyInfoBean.setExperience(Integer.parseInt(req.getParameter("experience")));
        employeeCompanyInfoBean.setLastCompanyName(req.getParameter("lastCompanyName"));
        
        EmployeeDesignationInfoBean employeeDesignationInfoBean = new EmployeeDesignationInfoBean();
        employeeDesignationInfoBean.setId((req.getParameter("id")));
        employeeDesignationInfoBean.setDesignation(req.getParameter("designation"));
        employeeDesignationInfoBean.setCostTocompany(Integer.parseInt(req.getParameter("costToCompany")));
	    
        EmployeeMasterBean employeeMasterBean = new EmployeeMasterBean();
        employeeMasterBean.setEmpInfoBean(employeeInfoBean);
        employeeMasterBean.setEmpPersonalInfoBean(employeePersonalInfoBean);
        employeeMasterBean.setEmpAddressInfoBean(employeeAddressInfoBean);
        employeeMasterBean.setEmpCompanyInfoBean(employeeCompanyInfoBean);
        employeeMasterBean.setEmpDesignationInfoBean(employeeDesignationInfoBean);
		
	
	
	
		EmployeeDAO dao = EmployeeServiceManager
				.getInstance()
				.daoGenerator();
		System.out.println("Calling update method");
		dao.updateEmployee(employeeMasterBean);
		System.out.println("Update method called");
        req.getRequestDispatcher("yet to add response.jsp").forward(req, resp);		

		
		
	}

}
