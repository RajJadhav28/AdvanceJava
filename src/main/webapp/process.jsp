<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="JSP.User"/>
<jsp:setProperty name="obj" property="*"/>
Welcome,<jsp:getProperty name="obj"property="name"/><br>
password,<jsp:getProperty name="obj" property="password"/><br>
email,<jsp:getProperty name="obj" property="email"/>
</body>
</html>