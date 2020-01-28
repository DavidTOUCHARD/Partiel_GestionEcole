package fr.ensup.gestionecole.test;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import fr.ensup.gestionecole.dao.IResponsableDao;
import fr.ensup.gestionecole.dao.ResponsableDao;
import fr.ensup.gestionecole.domaine.Etudiant;
import fr.ensup.gestionecole.service.IResponsableService;
import fr.ensup.gestionecole.service.ResponsableService;
import junit.framework.TestCase;

public class ResponsableServiceTest extends TestCase {

	@Mock
	IResponsableDao dao;

	@Spy
	ResponsableDao responsabledao;

	@InjectMocks
	private ResponsableService service;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEcriture() {
		Etudiant etudiant = new Etudiant("TOUCHARD", "David", null, null, null, null);
		IResponsableService respServ = new ResponsableService();
		respServ.ajouterEtudiant(etudiant);
		TestCase.assertEquals("TOUCHARD", etudiant.getNom());
	}

	@Test
	public void testInsertionEleve() { // Test avec @InjectMocks
		Etudiant etudiant = new Etudiant("TOUCHARD", "David", null, null, null, null);
		responsabledao.ajouterEtudiant(etudiant);
		boolean test = Mockito.verify(responsabledao, Mockito.times(1)).ajouterEtudiant(etudiant);

		Mockito.when(responsabledao.ajouterEtudiant(etudiant));
		Mockito.doReturn(new Etudiant("Docteur", "HOUSE", null, null, null, null));
	}

}
