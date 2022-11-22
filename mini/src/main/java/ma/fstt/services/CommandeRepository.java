package ma.fstt.services;

import java.util.List;

import ma.fstt.entities.Commande;

public interface CommandeRepository {
	public void saveCommande(Commande c); 
	public List<Commande> listCommande();
	public Commande getById(Long id);
	public void delete(Long id);
	public void updateCommande(Commande cc);
	public Long latest() ;
}
