<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Creation Form</title>
<style>
	body{
	
	background-image:url("D:/bgimage2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>

<form action="./createpolicy" method="POST">
<div align="center">
<table>
<tr>
<td>Policy Name</td>
<td><input type="text" name="policyName"/></td>
</tr>
<tr>
<td>Policy Provider</td>
<td><input type="text" name="policyProvider"/></td>
</tr>
<tr>
<td>Policy Type</td>
<td><input type="text" name="policyType"/></td>
</tr>
<tr>
<td>Policy Duration</td>
<td><input type="text" name="duration"/></td>
</tr>
<tr>
<td>Policy Due Date</td>
<td><input type="date" name="duedate"/></td>
</tr>
<tr>
<td>Amount</td>
<td><input type="text" name="amount"/></td>
</tr>
<tr>
<tr>
<td></td>
<td><input type="submit" name="Submit"/></td>
</tr>
</table>
</div>
</form>
<div style="color: red"></div>
</body>
</html>