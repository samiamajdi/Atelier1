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
<h1>Liste des articles commandés</h1>
 <tr><th>ID</th><th>code produit</th><th>num commande</th><th>Quantité</th>
 </tr>
 
 <c:forEach items="${listecmd}" var="p">
  <tr><th>${p.num_ligne}</th><th>${p.cod_prod}</th><th>${p.num_cmd}</th><th>${p.qte_cmd} </th>
 </tr>
 </c:forEach>
</body>
</html>