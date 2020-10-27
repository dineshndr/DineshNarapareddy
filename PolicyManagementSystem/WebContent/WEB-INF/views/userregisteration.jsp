<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>
	body{
	
	background-image:url("D:/bgimage2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
	p {
	padding-left: 50%;
	}
	
</style>
</head>
<body>
<form action="./userregister" method="POST">
<div align="center">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="age"/></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="text" name="gender"/></td>
</tr>
<tr>
<td>Contact Number</td>
<td><input type="text" name="contactNo"/></td>
</tr>
<tr>
<td>User Name</td>
<td><input type="text" name="userId"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="Submit"/></td>
</tr>
</table>
<div style="color: red">${error}</div>
</div>

</form>

</body>
</html>