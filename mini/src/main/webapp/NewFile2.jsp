<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des produits</h1>
<table border="1" width="80%">
 <tr><th>ID</th><th>Nom</th><th>Prix unitaire</th><th>Quantité de stock</th><th></th><th></th><th></th>
 </tr>
 
 <c:forEach items="${listep}" var="p">
 <tr>
 <td> ${p.cod_prod}</td>
 <td> ${p.nom_prod}</td>
  <td>${ p.pu}</td>
 <td>${ p.qte_stock}</td>
  <td><form method="post" action="servv?action=LigneComm">
  
  <input type ="hidden" name ="cod_prod"value ="<c:out value='${p.cod_prod}' />">
  
  <input type ="text"  name ="qte_cmd" id="qte_cmd">
  <input type ="submit" value ="commander">
  </form></td> 
  
  <td>

 <button> <a href="servv?action=AjouterProd&idddd=<c:out value='${p.cod_prod}' />">Modifier</a></button>
 </td>
 <td>
 <button> 
 <form method="post" action="servv?action=delete">
 		<input type="hidden" value="<c:out value='${p.cod_prod}' />"  name="cod_prod">
 		  <input type ="submit" value ="supprimer">
 </form></button>
  </td>
 </tr> 
 
 </c:forEach>
 
</table>
<button><a href="servv?action=lista"> Liste commande</a></button>
<button> <a href="servv?action=3">Ajouter un produit</a> </button>
</body>

</html>