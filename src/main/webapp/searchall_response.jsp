<%@page import="com.teamsankya.employeedatabase.dto.EmployeeMasterBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
EmployeeMasterBean bean = (EmployeeMasterBean) request.getAttribute("bean");
%>
<body>
<%if(bean!=null) {%>
	<table>
	 <tr bgcolor=\"green\">>
			<td>id</td>
			<td>firstname</td>
			<td>lastname</td>
			<td>Address1</td>
			<td>Address2</td>
			<td>City</td>
			<td>Pincode</td>
			<td>Email id</td>
			<td>Phone no</td>
			<td>Date of Birth</td>
			<td>Experience</td>
			<td>last company name</td>
			<td>designation</td>
			<td>Date of join</td>
			<td>CTC</td>	
		</tr>
		<tr>
			<td><%=bean.getEmpInfoBean().getId() %></td>
			<td><%=bean.getEmpInfoBean().getFirstname() %></td>
			<td><%=bean.getEmpInfoBean().getLastname() %></td>
			<td><%=bean.getEmpAddressInfoBean().getAddress1() %></td>
			<td><%=bean.getEmpAddressInfoBean().getAddress2() %></td>
			<td><%=bean.getEmpAddressInfoBean().getCity() %></td>
			<td><%=bean.getEmpAddressInfoBean().getPincode() %></td>
			<td><%=bean.getEmpPersonalInfoBean().getEmailId() %></td>
			<td><%=bean.getEmpPersonalInfoBean().getPhNumber() %></td>
			<td><%=bean.getEmpPersonalInfoBean().getDateOfBirth() %></td>
			<td><%=bean.getPreviousCompanyInfoBean().getExperience() %></td>
			<td><%=bean.getPreviousCompanyInfoBean().getLastCompanyName() %></td>
			<td><%=bean.getCurrentCompanyInfoBean().getDesignation() %></td>
			<td><%=bean.getCurrentCompanyInfoBean().getDateOfJoining()%></td>
			<td><%=bean.getCurrentCompanyInfoBean().getCostToCompany()%></td>
		</tr>
	</table>
	<%}else { %>
	<h1>Employee  does not exist</h1>
	<%} %>
	<a href='./searchall.jsp'>Click here to search an employee</a>
	<a href='./index.jsp'>Click here for Home Page</a>
</body>
</html>