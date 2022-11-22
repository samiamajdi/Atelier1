package ma.fstt.dao;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.fstt.entities.Client;
import ma.fstt.entities.Personne;
import ma.fstt.services.ClientRepository;

/**
 * Servlet implementation class mm
 */

@WebServlet("/serv/")

public class serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 
    public serv() {
    	
        super();
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
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
	switch(action) {
	case "1":
		System.out.println("1");
		request.getRequestDispatcher("NewFile1.jsp").forward(request, response);
		break;
	case "2":
		System.out.println("2");
		request.getRequestDispatcher("NewFile2.jsp").forward(request, response);
		break;
	case "3":
		System.out.println("3");
		request.getRequestDispatcher("NewFile4.jsp").forward(request, response);
		break;
	case "liste":
		System.out.println("Liste");
		MetierImpl a1=new MetierImpl();
		List <Personne> l=a1.getProduitsParMC("h");
		request.setAttribute("liste",l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getNom());
		}
		String np= request.getParameter("no");
		request.setAttribute("np", np);
		//request.getRequestDispatcher("/NewFile.jsp").forward(request, response);
		
		request.getRequestDispatcher("/Tfo.jsp").forward(request, response); 
		
		break;
	default :
		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
		break;
		
	}
	
	
	
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
	@Inject
	ClientRepository clientt; 

	Client c; 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	}

}