<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg }</h1>
	<%-- <c:forEach   var ="user" items="${}"> --%>
	<img alt="medicines images" src="<c:url value="/images/${ filename}"/>" />
</body>
</html>