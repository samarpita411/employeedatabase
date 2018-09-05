package com.teamsankya.employeedatabase.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.dto.EmployeeAddressInfoBean;
import com.teamsankya.employeedatabase.dto.PreviousCompanyInfoBean;
import com.teamsankya.employeedatabase.dto.CurrentCompanyInfoBean;
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
	    employeePersonalInfoBean.setPhNumber(Long.parseLong(req.getParameter("phNumber")));
	    employeePersonalInfoBean.setEmailId(req.getParameter("emailId"));
	    
	    EmployeeAddressInfoBean employeeAddressInfoBean = new EmployeeAddressInfoBean();
	    employeeAddressInfoBean.setId((req.getParameter("id")));
	    employeeAddressInfoBean.setAddress1(req.getParameter("address1"));
	    employeeAddressInfoBean.setAddress2(req.getParameter("address2"));
	    employeeAddressInfoBean.setCity(req.getParameter("city"));
	    employeeAddressInfoBean.setPincode(Integer.parseInt(req.getParameter("pincode")));
	    
        PreviousCompanyInfoBean PreviousCompanyInfoBean = new PreviousCompanyInfoBean();
        PreviousCompanyInfoBean.setId((req.getParameter("id")));
        PreviousCompanyInfoBean.setExperience(Integer.parseInt(req.getParameter("experience")));
        PreviousCompanyInfoBean.setLastCompanyName(req.getParameter("lastCompanyName"));
        
        CurrentCompanyInfoBean CurrentCompanyInfoBean = new CurrentCompanyInfoBean();
        CurrentCompanyInfoBean.setId((req.getParameter("id")));
        CurrentCompanyInfoBean.setDateOfJoining(req.getParameter("dateOfJoining"));
        CurrentCompanyInfoBean.setDesignation(req.getParameter("designation"));
        CurrentCompanyInfoBean.setCostToCompany(Integer.parseInt(req.getParameter("costToCompany")));
	    
        EmployeeMasterBean employeeMasterBean = new EmployeeMasterBean();
        employeeMasterBean.setEmpInfoBean(employeeInfoBean);
        employeeMasterBean.setEmpPersonalInfoBean(employeePersonalInfoBean);
        employeeMasterBean.setEmpAddressInfoBean(employeeAddressInfoBean);
        employeeMasterBean.setPreviousCompanyInfoBean(PreviousCompanyInfoBean);
        employeeMasterBean.setCurrentCompanyInfoBean(CurrentCompanyInfoBean);
		
	
	
	
		EmployeeDAO dao = EmployeeServiceManager
				.getInstance()
				.daoGenerator();
		
		boolean b = dao.updateEmployee(employeeMasterBean);
		if(b==true)
		req.getRequestDispatcher("update_response.jsp").forward(req, resp);		
		req.getRequestDispatcher("update_response1.jsp").forward(req, resp);		
		
		
	}

}
