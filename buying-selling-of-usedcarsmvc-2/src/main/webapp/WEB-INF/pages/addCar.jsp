<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to buy cars</title>
</head>
<body style="background-color:pink;">

<h1 style="text-align:centre; color:#ff0000;">Welcome to Buy Sell Cars</h1>
<h2>Welcome to car sales</h2>
<form:form method="post" action="cars">

<form:label path="model">Model</form:label>
<form:input  path="model"/>

<form:label path="year">Date of Manufacture</form:label>
<form:input   path="year"/>

<form:label path="kilometers">Kilometers covered</form:label>
<form:input   path="kilometers"/>

<form:label path="brand">Brand</form:label>
<form:select path="brand" items="${brands}"/>

<form:label path="status">Status</form:label> 
<form:select path="status" items="${status}"/>


<input type="submit" value="add"/>
</form:form>


</body>
</html>