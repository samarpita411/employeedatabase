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
    out.println(bean.getEmpInfoBean().getId());
    out.println(bean.getEmpInfoBean().getFirstname());
    out.println(bean.getEmpInfoBean().getLastname());
    out.println(bean.getEmpPersonalInfoBean().getDateOfBirth());
    out.println(bean.getEmpPersonalInfoBean().getEmailId());
    out.println(bean.getEmpPersonalInfoBean().getPhNumber());
    out.println(bean.getEmpAddressInfoBean().getAddress1());
    out.println(bean.getEmpAddressInfoBean().getAddress2());
    out.println(bean.getEmpAddressInfoBean().getCity());
    out.println(bean.getEmpAddressInfoBean().getPincode());
    out.println(bean.getEmpCompanyInfoBean().getDateOfJoining());
    out.println(bean.getEmpCompanyInfoBean().getExperience());
    out.println(bean.getEmpCompanyInfoBean().getLastCompanyName());
    out.println(bean.getEmpDesignationInfoBean().getDesignation());
    out.println(bean.getEmpDesignationInfoBean().getCostTocompany());


    
		
		super.doPost(req, resp);
	}

}
