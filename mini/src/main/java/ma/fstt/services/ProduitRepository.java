package ma.fstt.services;

import java.util.List;

import ma.fstt.entities.Produit;

public interface ProduitRepository {
  
	public void saveProduit(Produit c); 
	public List<Produit> listProduit();
	public Produit getById(Long id);
	
	public void delete(Long id);
	public void update (Produit a);
}
