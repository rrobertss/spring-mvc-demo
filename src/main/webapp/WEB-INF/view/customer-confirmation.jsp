<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Customer confirmation</title>
</head>
<body>

	The customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br>
	Free passes: ${customer.freePasses}
	<br> 
	Polish postal code: ${customer.postalCode}
	<br>
	Course code is : ${customer.courseCode}
	<br>
	Choose currency is : ${customer.currency}
</body>
</html>