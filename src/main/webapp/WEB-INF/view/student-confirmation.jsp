<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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