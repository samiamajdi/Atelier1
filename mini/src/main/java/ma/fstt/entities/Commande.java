package ma.fstt.entities;

public class Commande {
public Long num_cmd ; 
private String date_cmd;
private Long cod_cli;
public Long getCod_cli() {
	return cod_cli;
}
public void setCod_cli(Long cod_cli) {
	this.cod_cli = cod_cli;
}
public Long getNum_cmd() {
	return num_cmd;
}
public void setNum_cmd(Long num_cmd) {
	this.num_cmd = num_cmd;
}
public String getDate_cmd() {
	return date_cmd;
}
public void setDate_cmd(String date_cmd) {
	this.date_cmd = date_cmd;
}
public Commande() {
	super();
}

}
