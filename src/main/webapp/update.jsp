<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="https://images.unsplash.com/photo-1532680678473-a16f2cda8e43?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c35c44795a15fb33ba90a783355c2fc6&auto=format&fit=crop&w=500&q=60">

<center>

<br>

<a href="home.html"><button style="background-color:teal;height:50px; width:150px;"><font size=3>Home</font size></button></a>

<a href="create.html"><button style="background-color:teal;height:50px; width:150px;"><font size=3>Register</font size></button></a>

<a href="search.html"><button style="background-color:teal;height:50px; width:150px;"><font size=3>Search</font size></button></a>
<a href="update.html"><button style="background-color:dodgerblue;height:50px; width:150px;"><font size=3>Edit</font size></button></a>

<a href="delete.html"><button style="background-color:teal;height:50px; width:150px;"><font size=3>Delete</font size></button></a>
<hr>
</center>
<form action="./update" method="post">
<table cellpadding="3" width="50%" bgcolor="cornsilk" align="center"
cellspacing="3">

<tr>
<td colspan=3>
<center><font size=6><b>Edit your details</b></font></center>
</td>
</tr> 
                 <tr>
					<td>ID</td>
					<td><input type="text" name="id" size="30"  /></td>
				</tr>

                                  
                                  
                  <tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" size="30"  /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" size="30" /></td>
				</tr>
				
                   <tr>
					<td>Phone No</td>
					<td><input type="tel" name="phNumber"  size="30"/></td>
				   </tr>
                   <tr>
					<td>Email ID</td>
					<td><input type="emailid" name="emailId"  size="30"/></td>
				  </tr>
                <tr>
					<td>Date Of Birth</td>
					<td><input type="date" name="dateOfBirth"size="30" /></td>
				</tr>
                   <tr>
					<td>Date Of Joining</td>
					<td><input type="date" name="dateOfJoining" size="30" /></td>
				</tr>
                  
                  <tr>
					<td>Designation</td>
					<td><input type="text" name="designation" size="30" /></td>
				</tr>
				    <tr>
					         <td>Cost To Company</td>
					          <td><input type="text" name="costToCompany"size="30" /></td>
				           </tr>
				
               <tr>
					<td>Experience</td>
					<td><input type="number" name="experience" size="30" /></td>
				</tr>
                                <tr>
					<td>Last Company Name</td>
					<td><input type="text" name="lastCompanyName" size="30" /></td>
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
<td><input type="reset"></td>
<td colspan="5"><input type="submit" value="Update" /></td>
</tr>
</table>
</form>
</body>
</html>

</html>