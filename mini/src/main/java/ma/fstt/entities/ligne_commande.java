package ma.fstt.entities;

import java.util.ArrayList;

public class ligne_commande {
public Long num_ligne; 
private float qte_cmd;
private Long cod_prod; 
private Long num_cmd; 
public Long getCod_prod() {
	return cod_prod;
}
public void setCod_prod(Long cod_prod) {
	this.cod_prod = cod_prod;
}
public Long getNum_cmd() {
	return num_cmd;
}
public void setNum_cmd(Long num_cmd) {
	this.num_cmd = num_cmd;
}

public ligne_commande() {
	super();
}
public Long getNum_ligne() {
	return num_ligne;
}
public void setNum_ligne(Long num_ligne) {
	this.num_ligne = num_ligne;
}
public float getQte_cmd() {
	return qte_cmd;
}
public void setQte_cmd(float qte_cmd) {
	this.qte_cmd = qte_cmd;
}
}
