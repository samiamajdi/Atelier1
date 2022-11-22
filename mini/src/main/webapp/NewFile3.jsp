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
<h1>Ajouter un produit </h1>
<form method="post" action="servv?action=Addproduct">
<input type ="hidden" id="cod_prod" name="cod_prod" ><br/><br/>
<label for="nom">Nom Produit</label>
<input type ="text" id="nom_prod" name="nom_prod" ><br/><br/>

<label for="pre_cli">Prix Unitaire</label>
<input type ="text" id="pu" name="pu" ><br/><br/>

<label for="adr_cli">Quantité de stock</label>
<input type ="text" id="qte_stock" name="qte_stock" ><br/><br/>



<input type ="submit" value="Ajouter">
</form>
</body>
</html>