<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script ></script>
<meta charset="ISO-8859-1">
<title>POLICY MANAGEMENT</title>
</head>
<style>
	h2 {
		padding-top:;
		padding-left:30%;
	}
body{
	
	background-image:url("D:/bgimage2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
a{
	color: black;
	padding-right: 20%;
}
p {
	color: white;
}
</style>
<body>
<h2>Search Policy</h2>
<form action="${pageContext.request.contextPath}/policysearch" method = "GET">
  <input type="text" placeholder="Search.." name="search">
  <input type="submit" value="submit">
</form>
<p>PolicyId:${policy.policyId}<br>
PolicyName:${policy.policyName}<br>
PolicyType:${policy.policyType}<br>
PolicyProvider:${policy.policyProvider}<br>
PolicyDuration:${policy.policyDuration}<br>
PolicyDuedate:${policy.policyDueDate}<br>
PolicyAmount:${policy.policyAmount}<br>
 </p>
</body>
</html>