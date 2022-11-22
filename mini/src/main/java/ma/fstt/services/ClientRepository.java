package ma.fstt.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import ma.fstt.entities.Client;

public interface ClientRepository {
	
	public void saveClient(Client c); 
	public List<Client> listClient();
	public Client getById(Long id);
	public void delete(Long id);
	public void updateClient(Client cc);

    
}
