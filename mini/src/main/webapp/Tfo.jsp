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
<h1>Inscription du Client</h1>
<form method="post" action="servv?action=AddingClient">
<label for="nom">Nom Client</label>
<input type ="text" id="nom_cli" name="nom_cli"></br></br>

<label for="pre_cli">Prenom Client</label>
<input type ="text" id="pre_cli" name="pre_cli"></br></br>

<label for="adr_cli">Adresse Client</label>
<input type ="text" id="adr_cli" name="adr_cli"></br></br>

<label for="tel_cli">Telephone Client</label>
<input type ="text" id="tel_cli" name="tel_cli"></br></br>

<label for="ville_cli">Ville Client</label>
<input type ="text" id="ville_cli" name="ville_cli"></br></br>

<input type ="submit" value="enregistrer">
</form>








</body>
</html>