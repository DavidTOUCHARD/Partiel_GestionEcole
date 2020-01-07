package fr.ensup.gestionecole.dao;

import java.util.List;

import fr.ensup.gestionecole.domaine.Cours;
import fr.ensup.gestionecole.domaine.Etudiant;

/**
 * @author David
 *
 */
public interface IResponsableDao {
	public boolean ajouterEtudiant(Etudiant e);

	public boolean associerEtudiantCours(Etudiant e, Cours c);

	public Etudiant lireEtudiant(String nom, String prenom);

	public List<Etudiant> listerEtudiants();

	public Etudiant modifierEtudiant(String nom, String prenom, Etudiant etudiant);

	public boolean supprimerEtudiant(String nom, String prenom);

}
