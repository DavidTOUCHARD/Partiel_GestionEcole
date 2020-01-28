package fr.ensup.gestionecole.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ecole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nom;
	private String tel;
	private String adresse;
	private String mail;
	private String directeur;
}
