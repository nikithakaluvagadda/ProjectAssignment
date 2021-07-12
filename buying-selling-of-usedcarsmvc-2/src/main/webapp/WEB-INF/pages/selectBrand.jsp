<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="brands">

<form:label path="brand">Brand</form:label>
<form:select path="brand" items="${brands}"/>
<input type="submit" value="Show">
</form:form>
</body>
</html>