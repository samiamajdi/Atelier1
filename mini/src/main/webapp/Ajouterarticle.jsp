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
<form method="post" action="servv?action=Update">
<input type ="hidden" id="cod_prod" name="cod_prod" value="<c:out value='${produit.cod_prod}' />"></br>
<label for="nom">Nom Produit</label>
<input type ="text" id="nom_prod" name="nom_prod" value="<c:out value='${produit.nom_prod}' />"></br>

<label for="pre_cli">Prix Unitaire</label>
<input type ="text" id="pu" name="pu" value="<c:out value='${produit.pu}' />"></br>

<label for="adr_cli">Quantité de stock</label>
<input type ="text" id="qte_stock" name="qte_stock" value="<c:out value='${produit.qte_stock}' />"></br>



<input type ="submit" value="modifier">
</form>
</body>
</html>