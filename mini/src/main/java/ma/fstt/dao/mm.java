package ma.fstt.dao;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/mm")
public class mm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 
	  ClientRepository client; 
    public mm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name= request.getParameter("name");
		System.out.println(name);
		request.setAttribute("name", name);
		
		
		MetierImpl a=new MetierImpl();
		List <Personne> l=a.getProduitsParMC("h");
		request.setAttribute("liste",l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getNom());
		}
		String np= request.getParameter("no");
		request.setAttribute("np", np);
		//request.getRequestDispatcher("/NewFile.jsp").forward(request, response);
		
		request.getRequestDispatcher("/Tfo.jsp").forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Inject
	Client c;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String nom_cli=request.getParameter("nom_cli");
	   String pre_cli=request.getParameter("pre_cli");
	   String adr_cli=request.getParameter("adr_cli");
	   String ville_cli=request.getParameter("ville_cli");
	   String tel_cli=request.getParameter("tel_cli");
		c.setNom_cli(nom_cli);
		c.setPre_cli(pre_cli);
		c.setTel_cli(tel_cli);
		c.setVille_cli(ville_cli);
		c.setAdr_cli(adr_cli);
		client.saveClient(c);
		
	}

}
