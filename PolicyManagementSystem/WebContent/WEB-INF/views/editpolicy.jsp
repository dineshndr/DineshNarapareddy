<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Policy</title>
<style>
	body{
	
	background-image:url("D:/bgimage2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
	h3 {
	padding-left: 50%;
	}
	
</style>
</head>
<body>
<h3 >Please enter the following details <strong>${userId}</strong></h3>

<form action="./editingpolicy" method="POST">
<div align="center">
<table>
<tr>
<td>Policy Id</td><td><input type="text" name="policyId"></td>
</tr>
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
</body>
</html>