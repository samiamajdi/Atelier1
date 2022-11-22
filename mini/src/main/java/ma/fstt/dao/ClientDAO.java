package ma.fstt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ma.fstt.entities.Client;
import ma.fstt.entities.Personne;
import ma.fstt.services.ClientRepository;
@ApplicationScoped
public class ClientDAO implements ClientRepository {
	Connection conn;    
	
	
	public ClientDAO() {
		super();
		this.conn=SingletonConnection.getConnection(); 
	}
	public void saveClient(Client c) {
		
		try {
			 PreparedStatement ps=conn.prepareStatement("insert into client (nom_cli,pre_cli, adr_cli, tel_cli, ville_cli)values(?,?,?,?,?)"); 
			 ps.setString(1, c.getNom_cli());
			 ps.setString(2, c.getPre_cli());
			 ps.setString(3, c.getAdr_cli());
			 ps.setString(4, c.getTel_cli());
			 ps.setString(5, c.getVille_cli());
			 ps.execute();
			
			
		} catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
		
	}

	

	@Override
	public List<Client> listClient() {
		 List<Client> prods=new ArrayList<Client>(); 
		 Connection conn=SingletonConnection.getConnection(); 
		try { 
		 PreparedStatement ps=conn.prepareStatement("select * from client"); 
		 
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
		 
		 Client p =new Client(); 
		
		 p.setCod_cli(rs.getLong("cod_cli"));
			p.setNom_cli(rs.getString("nom_cli"));
			p.setPre_cli(rs.getString("pre_cli"));
			p.setTel_cli(rs.getString("tel_cli"));
			p.setVille_cli(rs.getString("ville_cli"));
			p.setAdr_cli(rs.getString("adr_cli"));
		 prods.add(p); 
		 } }catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
		return prods;
	}

	@Override
	public Client getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client c) {
		try { 
			 PreparedStatement ps=conn.prepareStatement("update produit set nom_cli=?,pre_cli=?, adr_cli=?, tel_cli=?, ville_cli=? where cod_cli= ? "); 
			
			 ps.setLong(1, c.getCod_cli());
			 ps.setString(2, c.getNom_cli());
			 ps.setString(3, c.getPre_cli());
			 ps.setString(4, c.getAdr_cli());
			 ps.setString(5, c.getTel_cli());
			 ps.setString(6, c.getVille_cli());
			 ps.execute();
			 } catch (SQLException e) { 
				 // TODO Auto-generated catch block
				 e.printStackTrace(); 
				 } 
		
	}

}
