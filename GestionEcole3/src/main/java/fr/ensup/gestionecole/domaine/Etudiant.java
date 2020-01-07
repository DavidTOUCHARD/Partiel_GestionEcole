package fr.ensup.gestionecole.domaine;

/**
 * @author David
 * @category Domaine
 *
 */
public class Etudiant {
	
	public String nom;
	public String prenom;
	public String tel;
	public String adresse;
	public String datenaissance;
	public String mail;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", adresse=" + adresse
				+ ", datenaissance=" + datenaissance + ", mail=" + mail + "]";
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

}
