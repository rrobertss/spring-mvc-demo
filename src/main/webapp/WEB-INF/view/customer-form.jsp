<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
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
		Free passes (*): <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br><br>
		Postal code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br><br>
		Course code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		<br><br>
		Currency: <form:input path="currency" />
		<form:errors path="currency" cssClass="error" />
		<br><br>
		<input type="submit" value="Next" />
	</form:form>
	<br><br><br><br>
	<i>* - required data</i>
</body>
</html>