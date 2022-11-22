<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="80%">
<h1>Liste des commandes </h1>
 <tr><th>ID</th><th>Date</th><th>Code client</th>
 </tr>
 
 <c:forEach items="${liste}" var="p">
  <tr><th><a href="servv?action=consulterC&idc=${p.num_cmd}">${p.num_cmd}</a></th><th>${p.date_cmd}</th><th>${p.cod_cli}</th>
 </tr>
 </c:forEach>
</body>
</html>