 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" 
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
 
<h3>Welcome to registration page</h3>

<form:form method="post" modelAttribute="user">
<form:errors/>
<table>
<tr>Username: <tc><form:input path="uName"/></tr>

<br/>
</tc><form:errors path="uName"/>
email: <form:input path="email"/><br/>
password: <form:password path="password"/><br/>
<br>
<form:select path="department" >
<form:option value="0" label="Department Name"/>
<form:options items="${dept}" itemValue="departmentName" itemLabel="departmentName"/></form:select>
<br><br>
<form:select path="city">
<form:option value="0" label="City ID"/>
<form:options items="${city}" itemValue="cityName" itemLabel="cityName"/></form:select>
<br><br>
<form:select path="country">
<form:option value="0" label="Country ID"/>
<form:options items="${country}" itemValue="countryName" itemLabel="countryName"/></form:select>
<br><br>
</table>
languages:
<br>
<form:checkboxes path="languages"  items="${lang }"   itemValue="key" itemLabel="value"/>
<br>
Hobbies:
<br>
<form:checkboxes path="hobbies"  items="${hobs }"   itemValue="key" itemLabel="value"/>

<input type="submit" value="register"/>



</form:form>
</body>
</html>