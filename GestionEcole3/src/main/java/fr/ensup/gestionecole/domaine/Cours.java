package fr.ensup.gestionecole.domaine;

public class Cours {

	public String theme;
	public int nbHeure;

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
