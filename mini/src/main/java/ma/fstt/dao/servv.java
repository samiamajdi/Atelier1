package ma.fstt.dao;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.fstt.entities.Client;
import ma.fstt.entities.Commande;
import ma.fstt.entities.Personne;
import ma.fstt.entities.Produit;
import ma.fstt.entities.ligne_commande;
import ma.fstt.services.ClientRepository;

/**
 * Servlet implementation class mm
 */
@WebServlet("/servv/")
public class servv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitDAO produit ; 
	Produit p; 
	@Inject
	ClientDAO clientt; 
	
	CommandeDAO commande;
	Commande cc;
	Client c; 
	Ligne_cmdDAO lcmd; 
	ligne_commande ligne; 
    /**
     * @see HttpServlet#HttpServlet()
     */
	 
    public servv() {
    	
        super();
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idddd;
		String idc;
		String page="";
		boolean y=false;
		Enumeration a=request.getParameterNames();
		boolean o=false;
		 while(a.hasMoreElements()){
			 
				if(a.nextElement().equals("action"))
				{
					
					o=true; 
				System.out.println("Changed");
				}
		
			}
		 Enumeration c=request.getParameterNames();
			boolean cc=false;
			 while(c.hasMoreElements()){
				 
					if(c.nextElement().equals("idc"))
					{
						
						cc=true; 
					System.out.println("Changed");
					}
			
				}
		 Enumeration b=request.getParameterNames();
		 while(b.hasMoreElements()){
			 if(b.nextElement().equals("idddd"))
				{
					y=true; 
				
				}
			 
		 }
		 if(y) {
			 String action=request.getParameter("action")+"&idddd="+request.getParameter("idddd");
			  
			  String id= request.getParameter("idddd");
				
				System.out.println(id);
				request.setAttribute("pp", id);
				ProduitDAO p=new ProduitDAO();
				Produit pa=p.getById(Long.parseLong(request.getParameter("idddd")));
				request.setAttribute("produit", pa);
				page="Ajouterarticle.jsp"; 
			
			 
		 }
		 if(cc) {
			 System.out.println("ligneee");
			 Ligne_cmdDAO lc=new Ligne_cmdDAO();
			 Long idcc=Long.parseLong(request.getParameter("idc"));
			 List<ligne_commande> lll=lc.listLignecmd(Long.parseLong(request.getParameter("idc")));
			 System.out.println("size");
			 System.out.println(lll.size());
			 request.setAttribute("listecmd", lll);
			 page="ligne_cmd.jsp";
		 }
		 if (o) {
			 
		System.out.println("je suis la");
String action=request.getParameter("action");
System.out.println("Param : ");
System.out.println(action);
try {
	
	switch(action) {
	case "1":
		
		page="NewFile1.jsp";
		break;
	case "2":
		System.out.println("2");
		page="NewFile2.jsp";
		break;
	case "3":
		System.out.println("3");
		page="NewFile3.jsp";
		break;
case "lista":
	System.out.println("entering lista");
		
		CommandeDAO yyy=new CommandeDAO();
		List<Commande> yl=yyy.listCommande();
		System.out.println("length");
		
		request.setAttribute("liste", yl);
		page="listeCommande.jsp";
		break;
	case "liste":
		System.out.println("Liste");
		MetierImpl a2=new MetierImpl();
		List <Personne> l1=a2.getProduitsParMC("h");
		request.setAttribute("liste",l1);
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).getNom());
		}
		String np= request.getParameter("no");
		request.setAttribute("np", np);
		//request.getRequestDispatcher("/NewFile.jsp").forward(request, response);
		page="Tfo.jsp";
		
		break;
	
	
		
		
	
	
		
	}
	
	
	 request.getRequestDispatcher(page).forward(request, response);
}catch(Exception ex){}
		 }
		 else {
			 System.out.println("no action specified");
			 request.getRequestDispatcher("Tfo.jsp").forward(request, response);
			 
		}
}
	
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration a=request.getParameterNames();
		boolean o=false;
		 while(a.hasMoreElements()){
				if(a.nextElement().equals("action"))
				{o=true; 
				System.out.println("Changed");
				}
			}
		 if (o) {
		System.out.println("je suis la");
String action=request.getParameter("action");
System.out.println("Param : ");
System.out.println(action);
try {
	String pagee="";
	switch(action) {
	case "AddingClient":
		System.out.println("Adding a client !");
		clientt=new ClientDAO();
		c=new Client();
		String nom_cli=request.getParameter("nom_cli");
		   String pre_cli=request.getParameter("pre_cli");
		   String adr_cli=request.getParameter("adr_cli");
		   String ville_cli=request.getParameter("ville_cli");
		   String tel_cli=request.getParameter("tel_cli");
		   System.out.println("request debugging");
		   System.out.println(request.getParameter("nom_cli"));
			c.setNom_cli(nom_cli);
			c.setPre_cli(pre_cli);
			c.setTel_cli(tel_cli);
			c.setVille_cli(ville_cli);
			c.setAdr_cli(adr_cli);
			clientt.saveClient(c);
			pagee="NewFile1.jsp";
			break;
	case "addingCommande":
		System.out.println("Adding Commande !");
		commande=new CommandeDAO();
		cc=new Commande();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		cc.setDate_cmd(dtf.format(now));
		boolean b=false;
		clientt=new ClientDAO();
		List<Client> uu=clientt.listClient();
		System.out.println("size");
		System.out.println(uu.size());
		for(int i=0;i<uu.size();i++) {
			System.out.println("clienttttttt");
			System.out.println(uu.get(i).getNom_cli());
			System.out.println(request.getParameter("cod_cli"));
			if(uu.get(i).getCod_cli()==Long.parseLong(request.getParameter("cod_cli"))) {
				System.out.println(uu.get(i).getNom_cli());
				b=true;
				//
			}
		}
		if(b) {
			System.out.println("Client exist");
		cc.setCod_cli(Long.parseLong(request.getParameter("cod_cli")));
		commande.saveCommande(cc);
		produit= new ProduitDAO();
		
		List<Produit> pr= produit.listProduit();
		
		System.out.println(pr.size());
		for(int i=0;i<pr.size();i++) {
			System.out.println(pr.get(i).getPu());
		}
		request.setAttribute("listep",pr);
		pagee="NewFile2.jsp";
	}
		else { 
			System.out.println("Client exist");
			pagee="idwrong.jsp";
			}
		break;
		
	case "LigneComm":
		String cod_prod= request.getParameter("cod_prod");
		String qte= request.getParameter("qte_cmd");
		float q= Float.parseFloat(qte);
		Long cod_produit= Long.parseLong(cod_prod);
		System.out.println(cod_prod);
		Long e=commande.latest();
		System.out.println(e);
		request.setAttribute("id", e);
		lcmd= new Ligne_cmdDAO(); 
		ligne= new ligne_commande();
		ligne.setNum_cmd(e);
		ligne.setQte_cmd(q);
		ligne.setCod_prod(cod_produit);
		ProduitDAO p=new ProduitDAO();
		Produit pa=p.getById(cod_produit);
		System.out.println(pa.getQte_stock());
		float un=pa.getQte_stock(); 
		float qs=un-q;
		System.out.println("New qs :"+qs);
		
		pa.setQte_stock(qs);
		System.out.println("updating product");
		p.update(pa);
		lcmd.saveLignecmd(ligne);
        produit= new ProduitDAO();
		
		List<Produit> pr= produit.listProduit();
		
		System.out.println(pr.size());
		for(int i=0;i<pr.size();i++){
			System.out.println(pr.get(i).getPu());
		}
		request.setAttribute("listep",pr);
		pagee="NewFile2.jsp";
		break;
	
	case "Update": 
		ProduitDAO paa=new ProduitDAO();
		Produit pop= new Produit(); 
		pop.setCod_prod(Long.parseLong(request.getParameter("cod_prod")));
		pop.setNom_prod(request.getParameter("nom_prod"));
		pop.setPu(Float.parseFloat(request.getParameter("pu")));
		pop.setQte_stock(Float.parseFloat(request.getParameter("qte_stock")));
		paa.update(pop);
List<Produit> pr2= produit.listProduit();
		
		System.out.println(pr2.size());
		for(int i=0;i<pr2.size();i++){
			System.out.println(pr2.get(i).getPu());
		}
		request.setAttribute("listep",pr2);
		pagee="NewFile2.jsp";
		break;
		case "delete": 
		Long iddd= Long.parseLong(request.getParameter("cod_prod"));
		produit= new ProduitDAO();
		produit.delete(iddd);
		 
		 List<Produit> para= produit.listProduit();
	   
		request.setAttribute("listep", para);
		pagee="NewFile2.jsp";
			break; 
		case "Addproduct":
			produit=new ProduitDAO();
			Produit p1= new Produit();
			p1.setNom_prod(request.getParameter("nom_prod"));
			p1.setPu(Float.parseFloat(request.getParameter("pu")));
			p1.setQte_stock(Float.parseFloat(request.getParameter("qte_stock")));
			produit.saveProduit(p1);
			List<Produit> pov= produit.listProduit();
			request.setAttribute("listep", pov);
			pagee="NewFile2.jsp";
			break;
		
	}
	
	 request.getRequestDispatcher(pagee).forward(request, response);
} catch(Exception e){}
}}
}