package fr.ensup.gestionecole.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.ensup.gestionecole.domaine.Responsable;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Connection() {
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

		String idConseiller = request.getParameter("id");

		if (!idConseiller.isEmpty()) {
			// request.setAttribute("id", idConseiller);
			// request.setAttribute("listePersonne", new
			// ConseillerDao().listeDesClients());
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
		} else {

			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");

		Responsable responsable = new Responsable();
		Responsable r = new Responsable("nom", "prenom", null, null, null, null);

		List<Responsable> responsableList = new ArrayList<Responsable>();

		// conseillerList = Login.loginConseiller(login, pwd);
		responsableList.add(r);
		if (!responsableList.isEmpty()) {
			// request.setAttribute("id", responsableList.get(0).getId());
			// request.setAttribute("listePersonne", new
			// ConseillerDao().listeDesClients());
			RequestDispatcher rs = request.getRequestDispatcher("accueil.jsp");
			rs.forward(request, response);
		} else {

			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}
	}

}
