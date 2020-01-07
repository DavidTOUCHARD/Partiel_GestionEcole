package fr.ensup.gestionecole.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
															// base de données

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "INSERT INTO `etudiant` (`nom`,`prenom`,`mail`,`adresse`,`telephone`,`datenaissance`) VALUES ('"
					+ etudiant.nom + "','" + etudiant.prenom + "','" + etudiant.mail + "','" + etudiant.adresse + "','"
					+ etudiant.tel + "','" + etudiant.datenaissance + "');";
			cd.stat.executeUpdate(sql);
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
															// étudiant
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "SELECT * FROM `etudiant` WHERE nom = '" + etudiant.nom + "';";
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
																// étudiant

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "DELETE `etudiant` WHERE nom = '" + etudiant.nom + "' and prenom = '" + etudiant.prenom + "';";
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
																// étudiant

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "UPDATE `etudiant` set mail = '" + etudiant.mail + "',adresse = '" + etudiant.adresse
					+ "', telephone = '" + etudiant.tel + "';";
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
										// dans la base de données
		// ajouter un clause where afin de retrouver un livre dans la base de
		// données
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

}
