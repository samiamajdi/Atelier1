package ma.fstt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ma.fstt.entities.Client;
import ma.fstt.entities.Commande;
import ma.fstt.services.CommandeRepository;

public class CommandeDAO  implements CommandeRepository{
	Connection conn; 
	public CommandeDAO() {
		super();
		this.conn=SingletonConnection.getConnection(); 
	}
	@Override
	public void saveCommande(Commande c) {
		
		
			try {
				 PreparedStatement ps=conn.prepareStatement("insert into commande (date_cmd,cod_cli)values(?,?)"); 
				 ps.setString(1, c.getDate_cmd());
				 ps.setLong(2, c.getCod_cli());
				 
				
				 ps.execute();
				
				
			} catch (SQLException e) { 
				 // TODO Auto-generated catch block
				 e.printStackTrace(); 
				 } 
			
		
		
	}
	public Long latest() {
		Long o=new Long(1);
		Connection conn=SingletonConnection.getConnection(); 
		try { 
		 PreparedStatement ps=conn.prepareStatement("SELECT * \r\n"
		 		+ "FROM commande\r\n"
		 		+ "WHERE num_cmd = (\r\n"
		 		+ "    SELECT MAX(num_cmd) \r\n"
		 		+ "  	FROM commande)"); 
		 
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
		 System.out.println("IDDD CMD");
		 System.out.println(rs.getLong("num_cmd"));
		 o =rs.getLong("num_cmd"); } } catch(Exception e) {}
		return o;
	}

	@Override
	public List<Commande> listCommande() {
		 List<Commande> prods=new ArrayList<Commande>(); 
		 Connection conn=SingletonConnection.getConnection(); 
		try { 
		 PreparedStatement ps=conn.prepareStatement("select * from commande"); 
		 
		 ResultSet rs=ps.executeQuery(); 
		 while(rs.next()){ 
		 
		 Commande p =new Commande(); 
		
		 p.setCod_cli(rs.getLong("cod_cli"));
			p.setDate_cmd(rs.getString("date_cmd"));
			p.setNum_cmd(rs.getLong("num_cmd"));
			
		 prods.add(p); 
		 } }catch (SQLException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); 
			 } 
		return prods;
		
	}

	@Override
	public Commande getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCommande(Commande cc) {
		// TODO Auto-generated method stub
		
	}

}
