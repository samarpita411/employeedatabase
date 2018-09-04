package com.teamsankya.employeedatabase.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;
import com.teamsankya.employeedatabase.factory.EmployeeServiceManager;

public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int empId = Integer.parseInt(req.getParameter("empId"));
    
    EmployeeDAO dao = EmployeeServiceManager
    		.getInstance()
    		.daoGenerator();
    EmployeeMasterBean bean = dao.getEmployee(empId);
    PrintWriter out = resp.getWriter();
    out.println("Employee Id "+bean.getEmpInfoBean().getId());
    out.println("First name "+bean.getEmpInfoBean().getFirstname());
    out.println("Last name "+bean.getEmpInfoBean().getLastname());
    out.println("Date of birth "+bean.getEmpPersonalInfoBean().getDateOfBirth());
    out.println("Email "+bean.getEmpPersonalInfoBean().getEmailId());
    out.println("Mobile number "+bean.getEmpPersonalInfoBean().getPhNumber());
    out.println("Address1 "+bean.getEmpAddressInfoBean().getAddress1());
    out.println("Address2 "+bean.getEmpAddressInfoBean().getAddress2());
    out.println("City "+bean.getEmpAddressInfoBean().getCity());
    out.println("Pincode "+bean.getEmpAddressInfoBean().getPincode());
    out.println("Date of joining "+bean.getEmpCompanyInfoBean().getDateOfJoining());
    out.println("Experience "+bean.getEmpCompanyInfoBean().getExperience());
    out.println("Last company name "+bean.getEmpCompanyInfoBean().getLastCompanyName());
    out.println("Designation "+bean.getEmpDesignationInfoBean().getDesignation());
    out.println("Cost to company "+bean.getEmpDesignationInfoBean().getCostTocompany());


    
		
		super.doPost(req, resp);
	}

}
