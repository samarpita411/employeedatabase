<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action="./create" method="post">

<table cellpadding="3" width="50%" bgcolor="lightcyan" align="center"
cellspacing="3">

<br>
</br>
<center>
<tr>
<td colspan=3>
<center><font size=6><b>Employee Registration Form</b></font></center>
</td>
</tr>                    <tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" size="30"  /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" size="30" /></td>
				</tr>
				
                   <tr>
					<td>Contact No</td>
					<td><input type="tel" name="contact"  size="30"/></td>
				   </tr>
                   <tr>
					<td>Email ID</td>
					<td><input type="emailid" name="email_id"  size="30"/></td>
				  </tr>

                   <tr>
					<td>Date Of Joining</td>
					<td><input type="date" name="date_of_joining" size="30" /></td>
				</tr>
                   <tr>
					<td>Date Of Birth</td>
					<td><input type="date" name="date_of_birth"size="30" /></td>
				</tr>
                  <tr>
					<td>Designation</td>
					<td><input type="text" name="designation" size="30" /></td>
				</tr>
               <tr>
					<td>Experience</td>
					<td><input type="number" name="experience" size="30" /></td>
				</tr>
                                <tr>
					<td>Last Company Name</td>
					<td><input type="text" name="last_company_name" size="30" /></td>
				</tr>
				<tr>
					<td>Address</td>
                 <tr>
					<td>Address1 </td>
                                        <td><input type="text" name="address1" size="30" /></td>
                                </tr>
                                <tr>
                                        <td>Address2 </td>
                                        <td><input type="text" name="address2" size="30" /></td>
                                </tr>
                                <tr>
                                        <td>City </td>
                                        <td><input type="text" name="city" size="30" /></td>
                                </tr>
                                <tr>
                                        <td>PinCode </td>
                                        <td><input type="text" name="pincode" size="30" /></td>

				</tr>
                                 <tr>
					<td>Cost To Company</td>
					<td><input type="text" name="cost_to_company"size="30" /></td>
				</tr>
				<tr>
<td><input type="reset"></td>
<td colspan="3"><input type="submit" value="Submit" /></td>
</tr>
</table>
</form>
</hr>
</body>
</html>
</body>
</html>