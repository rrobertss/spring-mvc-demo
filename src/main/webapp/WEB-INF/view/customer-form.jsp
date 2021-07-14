<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer registration</title>
	<style type="text/css">
		.error{color: #ff0000;}	
	</style>	
</head>
<body>
	<br>
	<br>
	<form:form action="processCustomerForm" modelAttribute="customer">
		First name: <form:input path="firstName"/>
		<br><br>
		Last name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		<input type="submit" value="Next" />
	</form:form>
	<br><br><br><br>
	<i>* - required data</i>
</body>
</html>