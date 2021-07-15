<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Add new student</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br />
		Last name: <form:input path="lastName"/>
		<br />
		Country:
		<form:select path="country">
			<form:options items="${theCountryOptions}" />
			theCountryOptions
		</form:select>
		<br/>
		Favorite programming language:
		<!--  
		Java<form:radiobutton path="favoriteLanguage" value="Java"/>
		Javascript<form:radiobutton path="favoriteLanguage" value="Javascript"/>
		C#<form:radiobutton path="favoriteLanguage" value="C#"/>
		Python<form:radiobutton path="favoriteLanguage" value="Python"/>
		-->
		<form:radiobuttons path="favoriteLanguage"  items="${student.favoriteLanguageOptions}"/>
		<br/>
		Operating systems:
		Windows<form:checkbox path="operatingSystems" value="Windows"/>
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		MacOS<form:checkbox path="operatingSystems" value="MacOS"/>
		<br/><br/>
		<input type="submit" value="Next">		
	</form:form>

	
</body>
</html>