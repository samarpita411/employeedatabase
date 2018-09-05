package com.teamsankya.employeedatabase.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.dto.CurrentCompanyInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeAddressInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;
import com.teamsankya.employeedatabase.dto.EmployeePersonalInfoBean;
import com.teamsankya.employeedatabase.dto.PreviousCompanyInfoBean;
import com.teamsankya.employeedatabase.factory.EmployeeServiceManager;

public class CreateEmployeeServlet extends HttpServlet {
	final static Logger logger = Logger.getLogger(CreateEmployeeServlet.class);
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        logger.info("EmployeeInfoBean is created");
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setId((req.getParameter("id")));
		employeeInfoBean.setFirstname(req.getParameter("firstname"));
		employeeInfoBean.setLastname(req.getParameter("lastname"));
		
		logger.info("EmployeePersonalInfoBean is created");
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
	    
	    PreviousCompanyInfoBean previousCompanyInfoBean = new PreviousCompanyInfoBean();
        previousCompanyInfoBean.setId((req.getParameter("id")));
        previousCompanyInfoBean.setExperience(Integer.parseInt(req.getParameter("experience")));
        previousCompanyInfoBean.setLastCompanyName(req.getParameter("lastCompanyName"));
        
        CurrentCompanyInfoBean currentCompanyInfoBean = new CurrentCompanyInfoBean();
        currentCompanyInfoBean.setId(req.getParameter("id"));
        currentCompanyInfoBean.setDateOfJoining(req.getParameter("dateOfJoining"));
        currentCompanyInfoBean.setDesignation(req.getParameter("designation"));
        currentCompanyInfoBean.setCostToCompany(Integer.parseInt(req.getParameter("costToCompany")));
      
        
	    
        EmployeeMasterBean employeeMasterBean = new EmployeeMasterBean();
        employeeMasterBean.setEmpInfoBean(employeeInfoBean);
        employeeMasterBean.setEmpPersonalInfoBean(employeePersonalInfoBean);
        employeeMasterBean.setEmpAddressInfoBean(employeeAddressInfoBean);
        employeeMasterBean.setPreviousCompanyInfoBean(previousCompanyInfoBean);
        employeeMasterBean.setCurrentCompanyInfoBean(currentCompanyInfoBean);
        
        EmployeeDAO dao = EmployeeServiceManager.getInstance().daoGenerator();
        logger.info("calling create method");
          dao.createEmployee(employeeMasterBean);
        logger.info("Create method called");
        
        req.getRequestDispatcher("create_response.jsp").forward(req, resp);		
        
    }

}










