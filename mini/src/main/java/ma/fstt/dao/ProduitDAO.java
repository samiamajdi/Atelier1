package ma.fstt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ma.fstt.entities.Client;
import ma.fstt.entities.Produit;
import ma.fstt.services.ProduitRepository;

public class ProduitDAO implements ProduitRepository{
	Connection conn;
	public ProduitDAO() {
		super();
		this.conn=SingletonConnection.getConnection(); 
	}
	@Override
	public void saveProduit(Produit c) {
		
		try {
			 PreparedStatement ps=conn.prepareStatement("insert into produit (nom_prod,pu,qte_stock)values(?,?,?)"); 
			 ps.setString(1, c.getNom_prod());
			 ps.setFloat(2, c.getPu());
			 ps.setFloat(3, c.getQte_stock());
			
			 ps.execute();
			
			
		} catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
	}

	@Override
	public void delete(Long id) {
		try {
			 PreparedStatement ps=conn.prepareStatement("delete from produit where cod_prod= ?"); 
			 ps.setLong(1, id);
				ps.execute();
		} catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
	}
	
	
	
	@Override
	public List<Produit> listProduit() {
		 List<Produit> prods=new ArrayList<Produit>(); 
		 Connection conn=SingletonConnection.getConnection(); 
		try { 
		 PreparedStatement ps=conn.prepareStatement("select * from produit"); 
		 
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
		 
		 Produit p =new Produit(); 
		
		 p.setCod_prod(rs.getLong("cod_prod"));
			p.setNom_prod(rs.getString("nom_prod"));
			p.setPu(rs.getFloat("pu"));
			p.setQte_stock(rs.getFloat("qte_stock"));
			
		 prods.add(p); 
		 } }catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
		return prods;
	}

	@Override
	public Produit getById(Long id) {
	
		 Produit p =new Produit(); 
		try { 
			 PreparedStatement ps=conn.prepareStatement("select * from produit where cod_prod = ?"); 
			ps.setLong(1, id);
			 ResultSet rs=ps.executeQuery(); 
			 while(rs.next()){ 
			 p.setCod_prod(rs.getLong("cod_prod"));
				p.setNom_prod(rs.getString("nom_prod"));
				p.setPu(rs.getFloat("pu"));
				p.setQte_stock(rs.getFloat("qte_stock"));
			 } }catch (SQLException e) { 
				 // TODO Auto-generated catch block
				 e.printStackTrace(); 
				 } 
		System.out.println(p.getNom_prod()+"samia khayba ");
		return p;
	}

	



	@Override
	public void update(Produit a) {
		try { 
			 PreparedStatement ps=conn.prepareStatement("UPDATE produit SET nom_prod= ?,pu=?, qte_stock=? where cod_prod= ? "); 
			ps.setLong(4, a.getCod_prod());
			ps.setString(1, a.getNom_prod());
			ps.setFloat(2, a.getPu());
			ps.setFloat(3, a.getQte_stock());
			 ps.execute();
			 } catch (SQLException e) { 
				 // TODO Auto-generated catch block
				 e.printStackTrace(); 
				 } 
	}
	

}
