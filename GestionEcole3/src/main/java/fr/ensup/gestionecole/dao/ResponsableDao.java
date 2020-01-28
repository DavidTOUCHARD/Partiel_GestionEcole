package fr.ensup.gestionecole.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.ensup.gestionecole.domaine.Cours;
import fr.ensup.gestionecole.domaine.Etudiant;
import fr.ensup.gestionecole.domaine.Responsable;

/**
 * @author David
 *
 */
public class ResponsableDao implements IResponsableDao {

	public static void selectResponsable(Responsable responsable) { // verifier
																	// que
		// l'identifiant et
		// le mot de passe
		// sont corrects
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "SELECT `nom`, `password` FROM `directeur` WHERE nom = '" + responsable.getNom()
					+ "' and password = '" + responsable.getPassword() + "';";
			ResultSet rs = cd.stat.executeQuery(sql);
			while (rs.next()) {
				String resp = rs.getString("nom") + rs.getString("password");
				if (resp == null) {
					System.out.println("Mauvais identifiant ou mot de passe");
					System.exit(0);
				} else {
					System.out.println("connexion reussie");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
	}

	public boolean ajouterEtudiant(Etudiant etudiant) {
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

		return true;
	}

	public boolean associerEtudiantCours(Etudiant e, Cours c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Etudiant lireEtudiant(String nom, String prenom) {
		// TODO Auto-generated method stub
		ConnectionDao cd = new ConnectionDao();
		Etudiant etudiant = null;
		ResultSet rs;
		cd.connection();
		try {
			String sql = "SELECT * FROM `etudiant` WHERE nom = '" + nom + "' and prenom = '" + prenom + "';";
			rs = cd.stat.executeQuery(sql);
			String id = rs.getString("idEtudiant");
			String Nom = rs.getString("nom");
			String Prenom = rs.getString("prenom");
			String email = rs.getString("email");
			String tel = rs.getString("telephone");
			String datenaissance = rs.getString("datenaissance");
			etudiant = new Etudiant(id, Nom, Prenom, email, tel, datenaissance);
			// System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
		return etudiant;
	}

	public List<Etudiant> listerEtudiants() {
		ConnectionDao cd = new ConnectionDao();
		Etudiant etudiant = null;
		ResultSet rs;
		List<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
		cd.connection();
		try {
			String sql = "SELECT * FROM `etudiant`;";
			rs = cd.stat.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("idEtudiant");
				String Nom = rs.getString("nom");
				String Prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String tel = rs.getString("telephone");
				String datenaissance = rs.getString("datenaissance");
				etudiant = new Etudiant(id, Nom, Prenom, email, tel, datenaissance);
				listeEtudiants.add(etudiant);
			}
			// System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
		return listeEtudiants;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * fr.ensup.gestionecole.dao.IResponsableDao#modifierEtudiant(java.lang.
	 * String, java.lang.String, fr.ensup.gestionecole.domaine.Etudiant)
	 */
	public Etudiant modifierEtudiant(String nom, String prenom, Etudiant etudiant) {
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "UPDATE `etudiant` set mail = '" + etudiant.getMail() + "',adresse = '" + etudiant.getAdresse()
					+ "', telephone = '" + etudiant.getTel() + "' WHERE nom = '" + nom + "' and prenom = '" + prenom
					+ "' ;";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

		return etudiant;
	}

	public boolean supprimerEtudiant(String nom, String prenom) {
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "DELETE `etudiant` WHERE nom = '" + nom + "' and prenom = '" + prenom + "';";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

		return true;
	}
}
