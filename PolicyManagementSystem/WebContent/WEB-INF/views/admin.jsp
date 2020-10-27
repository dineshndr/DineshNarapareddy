<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
   <%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HCL Admin</title>
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
<div id=admin_div>
<form action="./adminsubmitForm" method="POST">
<div align="center">
<table>
<tr>
<td>VendorId</td>
<td><input type="text" name="vendorId" /></td>
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

</div>

</form>
<p><strong>Not registered?</strong><a href="./adminregisteration">Click Here</a> <strong>to register</strong></p>
</div>



</body>
</html>