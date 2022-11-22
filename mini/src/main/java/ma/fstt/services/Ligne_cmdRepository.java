package ma.fstt.services;

import java.util.List;

import ma.fstt.entities.ligne_commande;

public interface Ligne_cmdRepository {
	public ligne_commande saveLignecmd(ligne_commande c); 
	public List<ligne_commande> listLignecmd(Long num);
	public ligne_commande getById(Long id);
	public void delete(Long id);
	//public List<Long> getArticle(Long cmd);
	
}
