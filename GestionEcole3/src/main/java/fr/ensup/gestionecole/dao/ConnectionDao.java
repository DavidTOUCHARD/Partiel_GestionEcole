package fr.ensup.gestionecole.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 * @author David
 * @category Dao
 */
public class ConnectionDao {

	public Connection cnx;
	public Statement stat;

	/**
	 * Connexion a la base de donnees
	 * @return cnx
	 */
	// Connexion a la base de données
	public Connection connection() { // connexion a la bdd
		String url = "jdbc:mysql://localhost/gestionecole";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url, login, password);
			stat = cnx.createStatement();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

		return cnx;
	}

	/**
	 * Deconnexion de la base de donnees
	 * 
	 */
	// Deconnexion de la base de données
	public void deconnection() { // déconnexion de la base
		try {
			cnx.close();
			stat.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
}
