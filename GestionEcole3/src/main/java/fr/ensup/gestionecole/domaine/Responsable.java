package fr.ensup.gestionecole.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responsable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nom;
	private String prenom;
	private String tel;
	private String adresse;
	private String mail;
	private String password;

	public Responsable() {
		// TODO Auto-generated constructor stub
	}

	public Responsable(String nom, String password) {
		super();
		this.nom = nom;
		this.setPassword(password);
	}

	public Responsable(String nom, String prenom, String tel, String adresse, String mail, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.mail = mail;
		this.setPassword(password);
	}

	public String getAdresse() {
		return adresse;
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
		return "Responsable [nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", adresse=" + adresse + ", mail="
				+ mail + ", password=" + getPassword() + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
