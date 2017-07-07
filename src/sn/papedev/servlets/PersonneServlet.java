package sn.papedev.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.papedev.beans.Personne;

/**
 * Servlet implementation class PersonneServlet
 */
@WebServlet("/PersonneServlet")
public class PersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Creation et initialisation
		String paramNom = request.getParameter("nom");
		String paramPrenom = request.getParameter("prenom");
		
		// Creation du bean 
		Personne pers = new Personne();
		//initialisation
		pers.setNom("Gueye");
		pers.setPrenom("Pape");
		
		//Stockage du bean dans l'objet request
		request.setAttribute("personne", pers);
		
		// Transmission de l'objet request/response à notre JSP
		this.getServletContext().getRequestDispatcher("/WEB-INF/personne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
