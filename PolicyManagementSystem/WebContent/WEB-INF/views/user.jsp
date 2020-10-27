<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HCL User</title>
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
<div id=user_div>
<form action="./usersubmitForm" method="POST">
<div align="center">
<table>
<tr>
<td>UserName</td>
<td><input type="text" name="userId" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
<div style="color: red">${error}</div>
</div>
</form>
<p><strong>Not registered?</strong><a href="./userregisteration">Click Here</a> <strong>to register</strong></p>
</div>
</body>
</html>