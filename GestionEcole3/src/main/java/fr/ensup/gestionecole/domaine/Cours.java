package fr.ensup.gestionecole.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String theme;
	private int nbHeure;

	public Cours() {
		super();
	}

	public Cours(String theme, int nbHeure) {
		super();
		this.theme = theme;
		this.nbHeure = nbHeure;
	}

	public int getNbHeure() {
		return nbHeure;
	}

	public String getTheme() {
		return theme;
	}

	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Cours [theme=" + theme + ", nbHeure=" + nbHeure + "]";
	}
}
