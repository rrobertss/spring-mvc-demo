<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation</title>
</head>
<body>

	The student is confirmed: ${student.firstName} ${student.lastName}
	<br />
	The student country is :  ${student.country}
	<br />
	The student favorite programming language is: ${student.favoriteLanguage}
	<br />
	Operating systems:
	<ul> 
	<c:forEach items="${student.operatingSystems}" var="system">
		<li>${system}</li>	
	</c:forEach>
	</ul>
</body>
</html>