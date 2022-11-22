package ma.fstt.entities;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

public class Client {

public Long cod_cli; 
 private String nom_cli; 
 private String pre_cli; 
 private String adr_cli; 
 private String tel_cli; 
 private String ville_cli;
 ArrayList<Commande> commande= new ArrayList<Commande>();
public ArrayList<Commande> getCommande() {
	return commande;
}
public void setCommande(ArrayList<Commande> commande) {
	this.commande = commande;
}
public Long getCod_cli() {
	return cod_cli;
}
public void setCod_cli(Long cod_cli) {
	this.cod_cli = cod_cli;
}
public String getNom_cli() {
	return nom_cli;
}
public void setNom_cli(String nom_cli) {
	this.nom_cli = nom_cli;
}
public String getPre_cli() {
	return pre_cli;
}
public void setPre_cli(String pre_cli) {
	this.pre_cli = pre_cli;
}
public String getAdr_cli() {
	return adr_cli;
}
public void setAdr_cli(String adr_cli) {
	this.adr_cli = adr_cli;
}
public String getTel_cli() {
	return tel_cli;
}
public void setTel_cli(String tel_cli) {
	this.tel_cli = tel_cli;
}
public String getVille_cli() {
	return ville_cli;
}
public void setVille_cli(String ville_cli) {
	this.ville_cli = ville_cli;
}
public Client() {
	System.out.println("client initialized");
} 
 
}
