package ma.fstt.entities;

import java.util.ArrayList;

public class Produit {
public Long cod_prod; 
private String nom_prod; 
private float pu; 
private float qte_stock;
ArrayList<ligne_commande> ligne_cmd1= new ArrayList<ligne_commande>();
public ArrayList<ligne_commande> getLigne_cmd1() {
	return ligne_cmd1;
}
public void setLigne_cmd1(ArrayList<ligne_commande> ligne_cmd1) {
	this.ligne_cmd1 = ligne_cmd1;
}
public Produit() {
	super();
}
public Long getCod_prod() {
	return cod_prod;
}
public void setCod_prod(Long cod_prod) {
	this.cod_prod = cod_prod;
}
public String getNom_prod() {
	return nom_prod;
}
public void setNom_prod(String nom_prod) {
	this.nom_prod = nom_prod;
}
public float getPu() {
	return pu;
}
public void setPu(float pu) {
	this.pu = pu;
}
public float getQte_stock() {
	return qte_stock;
}
public void setQte_stock(float qte_stock) {
	this.qte_stock = qte_stock;
}
}
