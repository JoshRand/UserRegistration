<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
crossorigin="anonymous">

<style type="text/css">

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Registration successfull!</h3>
name: <c:out value="${user.uName }"></c:out><br>
password: <c:out value="${user.password }"></c:out><br>
email: <c:out value="${user.email }"></c:out><br>
department: <c:out value="${user.department }"></c:out><br>
Country: <c:out value="${user.country }"></c:out><br>
City: <c:out value="${user.city }"></c:out><br>
<br>
<tr>Languages:</tr>
 <br>
<c:forEach var ="languages" items="${ user.languages}">
<c:out value="${languages }"/>
</c:forEach>
<br>
Hobbies:<br>
<c:forEach var ="hobbies" items="${ user.hobbies}">
<c:out value="${hobbies }"/>
</c:forEach>
</body>
</html>