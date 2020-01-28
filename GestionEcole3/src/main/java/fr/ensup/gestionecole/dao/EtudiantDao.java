package fr.ensup.gestionecole.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.ensup.gestionecole.domaine.Etudiant;

/**
 * @author David
 * @category Dao
 *
 */
public class EtudiantDao {

	/**
	 * Insertion d'un etudiant dans la base de donnees
	 *
	 * @param etudiant
	 */
	public static void insertEtudiant(Etudiant etudiant) { // Inserer un nouvel
															// etudiant dans la
															// base de donn�es

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "INSERT INTO `etudiant` (`nom`,`prenom`,`mail`,`adresse`,`telephone`,`datenaissance`) VALUES ('"
					+ etudiant.getNom() + "','" + etudiant.getPrenom() + "','" + etudiant.getMail() + "','"
					+ etudiant.getAdresse() + "','" + etudiant.getTel() + "','" + etudiant.getDatenaissance() + "');";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

	/**
	 * Modification d'un etudiant dans la base de donnees
	 *
	 * @param etudiant
	 */
	public static void modifierEtudiant(Etudiant etudiant) { // modifier un
																// �tudiant

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "UPDATE `etudiant` set mail = '" + etudiant.getMail() + "',adresse = '" + etudiant.getAdresse()
					+ "', telephone = '" + etudiant.getTel() + "';";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

	/**
	 * Selection de tous les etudiants de la base de donnees
	 *
	 * @param etudiant
	 */
	public static void selectAll() { // Afficher l'ensemble des livres present
										// dans la base de donn�es
		// ajouter un clause where afin de retrouver un livre dans la base de
		// donn�es
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {

			String sql = "SELECT * FROM `etudiant`;";
			ResultSet rs = cd.stat.executeQuery(sql);
			System.out.println("Id\tNom\tPrenom");
			System.out.println("-----\t------\t------");
			while (rs.next()) {
				String books = rs.getInt("identifiant") + "\t" + rs.getString("nom") + "\t\t" + rs.getString("prenom");
				System.out.println(books);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

	/**
	 * Selection d'un etudiant dans la base de donnees
	 *
	 * @param etudiant
	 */
	public static void selectEtudiant(Etudiant etudiant) { // lire les
															// informations d'un
															// �tudiant
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "SELECT * FROM `etudiant` WHERE nom = '" + etudiant.getNom() + "';";
			ResultSet rs = cd.stat.executeQuery(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
	}

	/**
	 * Suppression d'un etudiant dans la base de donnees
	 *
	 * @param etudiant
	 */
	public static void supprimerEtudiant(Etudiant etudiant) { // supprimer un
																// �tudiant

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "DELETE `etudiant` WHERE nom = '" + etudiant.getNom() + "' and prenom = '"
					+ etudiant.getPrenom() + "';";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

}
