package fr.ensup.gestionecole.service;

import java.util.Scanner;

import fr.ensup.gestionecole.dao.EtudiantDao;
import fr.ensup.gestionecole.domaine.Etudiant;

/**
 * @author David
 *
 */
public class EtudiantService {

	/**
	 * Le but ici est d'ajouter un etudiant a la base de donnees
	 * @param etudiant
	 */
	public void inscription() { // permet d'inscrir un etudiant en indiquant son
								// nom, prenom etc...
		Etudiant etudiant;

		System.out.println("Inscription d'un etudiant\n");

		System.out.println("Entrer le nom de l'etudiant\n");
		Scanner snom = new Scanner(System.in);
		String nom = snom.next();

		System.out.println("Entrer le prenom de l'etudiant\n");
		Scanner sprenom = new Scanner(System.in);
		String prenom = sprenom.next();

		System.out.println("Entrer le numero de telephone de l'etudiant");
		Scanner stel = new Scanner(System.in);
		String tel = stel.next();

		System.out.println("Entrer l'adresse de l'etudiant");
		Scanner sadresse = new Scanner(System.in);
		String adresse = sadresse.next();

		System.out.println("Entrer la date de naissance de l'etudiant\n");
		Scanner sdatenaissance = new Scanner(System.in);
		String datenaissance = sdatenaissance.next();

		System.out.println("Entrer le mail de l'etudiant\n");
		Scanner smail = new Scanner(System.in);
		String mail = smail.next();

		etudiant = new Etudiant(nom, prenom, tel, adresse, datenaissance, mail);

		EtudiantDao.insertEtudiant(etudiant);

		System.out.println("L'etudiant suivant a été créé  : \n" + etudiant);
	}

	/**
	 * Le but ici est de modifier un etudiant present dans la base de donnees
	 * @param etudiant
	 * 
	 */
	public void modification() { // modifier un le mail, l'adresse et le telephone d'un etudiant
		Etudiant etudiant;
		Etudiant etudiantmodifie;

		System.out.println(" Modification d'un etudiant\n Quel est le nom de l'etudiant à modifier?\n");
		Scanner snom = new Scanner(System.in);
		String nom = snom.next();

		System.out.println(" Quel est son prenom de l'etudiant\n");
		Scanner sprenom = new Scanner(System.in);
		String prenom = sprenom.next();

		etudiant = new Etudiant(nom, prenom, null, null, null, null);

		EtudiantDao.selectEtudiant(etudiant);

		System.out.println("Veuillez entrer le nouveau mail de l'etudiant\n");
		Scanner smail = new Scanner(System.in);
		String mail = smail.next();

		System.out.println("Veuillez entrer le nouveau numero de telephone de l'etudiant");
		Scanner stel = new Scanner(System.in);
		String tel = stel.next();

		System.out.println("Veuillez entrer la nouvelle adresse de l'etudiant");
		Scanner sadresse = new Scanner(System.in);
		String adresse = sadresse.next();

		etudiantmodifie = new Etudiant(nom, prenom, tel, adresse, null, mail);
		EtudiantDao.modifierEtudiant(etudiantmodifie);

	}
	/**
	 * Le but ici est de supprimer un etudiant present dans la base de donnees
	 * @param Etudiant
	 */
	public void suppression() { // supprimer un etudiant
		Etudiant etudiant;

		System.out.println(" Suppression d'un etudiant\n Quel est le nom de l'etudiant à supprimer ?\n");

		Scanner snom = new Scanner(System.in);
		String nom = snom.next();

		System.out.println(" Quel est son prenom de l'etudiant\n");
		Scanner sprenom = new Scanner(System.in);
		String prenom = sprenom.next();

		etudiant = new Etudiant(nom, prenom, null, null, null, null);

		EtudiantDao.supprimerEtudiant(etudiant);

	}
	/**
	 * Le but ici est d'afficher un etudiant present dans la base de donnees
	 * @param etudiant
	 */
	public void selection() { //afficher les informations sur un etudiant
		Etudiant etudiant;

		System.out.println(" Selection d'un etudiant\n Quel est le nom de l'etudiant ?\n");
		Scanner snom = new Scanner(System.in);
		String nom = snom.next();

		System.out.println(" Quel est son prenom de l'etudiant\n");
		Scanner sprenom = new Scanner(System.in);
		String prenom = sprenom.next();

		etudiant = new Etudiant(nom, prenom, null, null, null, null);
		EtudiantDao.selectEtudiant(etudiant);
	}
	/**
	 * Cette fonction afficher l'ensemble des etudiants inscrits
	 */
	public void toutAfficher(){
		
		System.out.println(" Affichage de la liste de tous les etudiants \n ");
		EtudiantDao.selectAll();
	}
}
