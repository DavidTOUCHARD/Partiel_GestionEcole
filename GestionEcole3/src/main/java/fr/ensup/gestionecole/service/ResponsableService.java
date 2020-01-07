package fr.ensup.gestionecole.service;

import java.util.List;
import java.util.Scanner;

import fr.ensup.gestionecole.dao.IResponsableDao;
import fr.ensup.gestionecole.dao.ResponsableDao;
import fr.ensup.gestionecole.domaine.Cours;
import fr.ensup.gestionecole.domaine.Etudiant;
import fr.ensup.gestionecole.domaine.Responsable;

/**
 * @author David
 * @category Service
 *
 */
public class ResponsableService implements IResponsableService {

	private IResponsableDao irespdao = new ResponsableDao();

	public boolean ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return irespdao.ajouterEtudiant(e);
	}

	public boolean associerEtudiantCours(Etudiant e, Cours c) {
		// TODO Auto-generated method stub
		return irespdao.associerEtudiantCours(e, c);
	}

	/**
	 * Verifie que le responsable est bien inscrit dans la base de donnees et
	 * que son mot de passe correspond a l'identifiant
	 *
	 * @param Responsable
	 *            responsable (String nom, String password)
	 */
	public void connexionResponsable() {// Connexion d'un enseignant ou du
										// directeur

		Responsable responsable;

		System.out.println("Identifiant de connexion : ");
		Scanner sid = new Scanner(System.in);
		String id = sid.next();

		System.out.println("Mot de passe : ");
		Scanner smdp = new Scanner(System.in);
		String mdp = smdp.next();

		responsable = new Responsable(id, mdp);
		ResponsableDao.selectResponsable(responsable);

	}

	public Etudiant lireEtudiant(String nom, String prenom) {
		// TODO Auto-generated method stub
		return irespdao.lireEtudiant(nom, prenom);
	}

	public List<Etudiant> listerEtudiants() {
		// TODO Auto-generated method stub
		return irespdao.listerEtudiants();
	}

	public Etudiant modifierEtudiant(String nom, String prenom, Etudiant etudiant) {
		// TODO Auto-generated method stub
		return irespdao.modifierEtudiant(nom, prenom, etudiant);
	}

	public boolean supprimerEtudiant(String nom, String prenom) {
		// TODO Auto-generated method stub
		return irespdao.supprimerEtudiant(nom, prenom);
	}
}
