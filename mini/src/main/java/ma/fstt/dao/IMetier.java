package ma.fstt.dao;

import java.util.List;

import ma.fstt.entities.Client;
import ma.fstt.entities.Personne;

public interface IMetier {
	public List<Personne> getProduitsParMC(String mc); 
	public Personne saveClient(Personne c); 
//	public void addPersonne(Personne p); 
}
