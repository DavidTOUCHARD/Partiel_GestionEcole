package fr.ensup.gestionecole.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.ensup.gestionecole.domaine.Etudiant;
import fr.ensup.gestionecole.service.ResponsableService;

/**
 * Servlet implementation class ReadEtudiantServlet
 */
@WebServlet("/ReadEtudiantServlet")
public class ReadEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	ResponsableService respServ = new ResponsableService();
	Etudiant etudiant;

	public ReadEtudiantServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// String recherche = request.getParameter("student-search");
		// System.out.println("recherche : " + recherche);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("button1") != null) {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			System.out.println("recherche dans le doPost : " + nom + " " + prenom);

			etudiant = respServ.lireEtudiant(nom, prenom);
			System.out.println("l'etudiant est : " + etudiant);
		}
		doGet(request, response);
	}

}
