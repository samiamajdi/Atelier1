package ma.fstt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ma.fstt.entities.Commande;
import ma.fstt.entities.ligne_commande;
import ma.fstt.services.Ligne_cmdRepository;

public class Ligne_cmdDAO implements Ligne_cmdRepository {
	Connection conn;    
	
	
	public Ligne_cmdDAO() {
		super();
		this.conn=SingletonConnection.getConnection(); 
	}
	@Override
	public ligne_commande saveLignecmd(ligne_commande c) {
		try {
			 PreparedStatement ps=conn.prepareStatement("insert into ligne_commande (cod_prod,num_cmd, qte_cmd)values(?,?,?)"); 
			 
			 ps.setLong(1, c.getCod_prod());
			 ps.setLong(2, c.getNum_cmd());
			
			 ps.setFloat(3, c.getQte_cmd());
				
			 ps.execute();
			
			
		} catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 }
		return null;
	}

	@Override
	public List<ligne_commande> listLignecmd(Long num) {
		 List<ligne_commande> prods=new ArrayList<ligne_commande>(); 
		 Connection conn=SingletonConnection.getConnection(); 
		try { 
		 PreparedStatement ps=conn.prepareStatement("select * from ligne_commande where num_cmd=?"); 
		 ps.setLong(1, num);
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
		 
		 ligne_commande p =new ligne_commande(); 
		p.setCod_prod(rs.getLong("cod_prod"));
		p.setNum_cmd(rs.getLong("num_cmd"));
		
		p.setNum_ligne(rs.getLong("num_ligne"));
		p.setQte_cmd(rs.getFloat("qte_cmd"));
			
		 prods.add(p); 
		 } }catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
		return prods;
	}

	@Override
	public ligne_commande getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
