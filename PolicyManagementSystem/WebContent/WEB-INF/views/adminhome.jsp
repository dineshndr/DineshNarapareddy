<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HCL AdminHome</title>
<style>
	body{
	
	background-image:url("D:/bgimage2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
	a {
	padding-left: 50%;
	}
	
	h3 {
	padding-left: 50%;
	}
	
	
</style>
</head>

</style>
<body>
<h3 >Welcome to the admin <strong>${userId}</strong></h3>


<div>
<a href="./policyregisteration">Create New Policy</a>
<a href="./editedpolicy">Edit Policy</a>
</div>
</body>
</html>