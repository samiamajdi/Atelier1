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
<!-- <p>${empty nam ? "tfo" : nam }</p>
<c:if test="${ !empty nam}"><p> <c:out value="Ahlaaaaan b ${nam }"/></p></c:if>
 <h1>Salut tout le monde c notre site : </h1>
<h2>Veuillez les bien venue : </h2>

<p> ${ empty name ? '': name} </p>
<p>
${aut.prenom }

</p> 
-->

<!-- 
<table border="1" width="80%">
 <tr><th>ID</th><th>Nom</th>
 </tr>
 
 <c:forEach items="${liste}" var="p">
 
 <tr>
 <td>${ p.id}</td>
 <td>${ p.nom}</td>
 
 </tr> 
 
 </c:forEach>
 
</table> -->
<h1>Insérer le id du client pour commander </h1>
<form method="post" action="servv?action=addingCommande">
<label for="nom">Id Client</label>
<input type ="number" id="cod_cli" name="cod_cli">


<input type ="submit" value="enregistrer">
</form>

<a href="servv?action=lista"> Liste commande</a>








</body>
</html>