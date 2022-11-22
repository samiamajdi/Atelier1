package ma.fstt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ma.fstt.dao.SingletonConnection;
import ma.fstt.entities.Personne;

public class MetierImpl implements IMetier{
	@Override
	public List<Personne> getProduitsParMC(String mc) { 
	 // TODO Auto-generated method stub
	 List<Personne> prods=new ArrayList<Personne>(); 
	 Connection conn=SingletonConnection.getConnection(); 
	try { 
	 PreparedStatement ps=conn.prepareStatement("select * from Personne"); 
	 
	 ResultSet rs=ps.executeQuery(); 
	 while(rs.next()){ 
	 
	 Personne p =new Personne(); 
	 p.setId(rs.getLong("id")); 
	 p.setNom(rs.getString("nom")); 
	 
	 prods.add(p); 
	 } 
	 
	 
	 
	 } catch (SQLException e) { 
	 // TODO Auto-generated catch block
	 e.printStackTrace(); 
	 } 
	 return prods; 
	 }

	@Override
	public Personne saveClient(Personne c) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	
	
	
}
