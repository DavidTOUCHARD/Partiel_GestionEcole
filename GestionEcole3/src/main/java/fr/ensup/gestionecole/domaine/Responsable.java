package fr.ensup.gestionecole.domaine;

public class Responsable {

	public String nom;
	public String prenom;
	public String tel;
	public String adresse;
	public String mail;
	public String password;

	public Responsable() {
		// TODO Auto-generated constructor stub
	}

	public Responsable(String nom, String password) {
		super();
		this.nom = nom;
		this.password = password;
	}

	public Responsable(String nom, String prenom, String tel, String adresse, String mail, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.mail = mail;
		this.password = password;
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
				+ mail + ", password=" + password + "]";
	}

}
