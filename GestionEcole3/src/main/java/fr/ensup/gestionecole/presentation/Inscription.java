package fr.ensup.gestionecole.presentation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.ensup.gestionecole.domaine.Etudiant;
import fr.ensup.gestionecole.service.IResponsableService;
import fr.ensup.gestionecole.service.ResponsableService;

public class Inscription extends HttpServlet {
	public static final String VUE = "creationEtudiant.jsp";
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_PRENOM = "prenom";
	public static final String CHAMP_ADRESSE = "adresse";
	public static final String CHAMP_TELEPHONE = "telephone";
	public static final String CHAMP_DATENAISS = "datenaissance";
	public static final String CHAMP_NOM = "nom";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Affichage de la page d'inscription */
		getServletContext().getRequestDispatcher(Inscription.VUE).forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resultat;
		Map<String, String> erreurs = new HashMap<String, String>();

		/* Récupération des champs du formulaire. */
		String email = request.getParameter(Inscription.CHAMP_EMAIL);
		String nom = request.getParameter(Inscription.CHAMP_NOM);
		String adresse = request.getParameter(Inscription.CHAMP_ADRESSE);
		String datenaissance = request.getParameter(Inscription.CHAMP_DATENAISS);
		String prenom = request.getParameter(Inscription.CHAMP_PRENOM);
		String tel = request.getParameter(Inscription.CHAMP_TELEPHONE);
		IResponsableService rs = new ResponsableService();
		Etudiant e = new Etudiant(nom, prenom, email, adresse, tel, datenaissance);
		rs.ajouterEtudiant(e);
		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {
			Etudiant etu = new Etudiant(nom, prenom, email, adresse, tel, datenaissance);
			rs.ajouterEtudiant(etu);
			resultat = "Succès de l'ajout.";
		} else {
			resultat = "Échec de l'ajout.";
		}

		/* Stockage du résultat et des messages d'erreur dans l'objet request */
		request.setAttribute(Inscription.ATT_ERREURS, erreurs);
		request.setAttribute(Inscription.ATT_RESULTAT, resultat);

		/* Transmission de la paire d'objets request/response à notre JSP */
		getServletContext().getRequestDispatcher(Inscription.VUE).forward(request, response);
	}

}