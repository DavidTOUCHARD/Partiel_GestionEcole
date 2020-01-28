package fr.ensup.gestionecole.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author David
 * @category Domaine
 *
 */
@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nom;

	private String prenom;
	private String tel;
	private String adresse;
	private String datenaissance;
	private String mail;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String tel, String adresse, String datenaissance, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.datenaissance = datenaissance;
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getDatenaissance() {
		return datenaissance;
	}

	public String getMail() {
		return mail;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", adresse=" + adresse
				+ ", datenaissance=" + datenaissance + ", mail=" + mail + "]";
	}

}
