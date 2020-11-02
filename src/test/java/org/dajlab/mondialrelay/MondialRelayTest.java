package org.dajlab.mondialrelay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ResourceBundle;

import org.dajlab.mondialrelayapi.IMondialRelayService;
import org.dajlab.mondialrelayapi.MondialRelayServiceImpl;
import org.dajlab.mondialrelayapi.vo.MREvenementSuivi;
import org.dajlab.mondialrelayapi.vo.MRException;
import org.dajlab.mondialrelayapi.vo.MRStatut;
import org.dajlab.mondialrelayapi.vo.MRSuiviColis;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MondialRelayTest {

	private static IMondialRelayService service;

	@BeforeAll
	public static void before() {
		ResourceBundle rb = ResourceBundle.getBundle("parameters");
		String enseigne = rb.getString("enseigne");
		String cle = rb.getString("cleprivee");
		try {
			service = new MondialRelayServiceImpl(enseigne, cle);
		} catch (MRException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testApp() {
		try {
			MRSuiviColis suivi = service.getSuivi("50241900");
			assertNotNull(suivi, "Aucun suivi trouvé");
			if (suivi.getStatut() != null) {
				System.out.println(suivi.getStatut().getLibelle());
				for (MREvenementSuivi evt : suivi.getEvenements()) {
					System.out.println(evt.getLibelle());
				}
			}

			suivi = service.getSuivi("12345678");
			assertNotNull(suivi, "Aucun suivi trouvé");
			assertEquals(MRStatut.STAT99, suivi.getStatut(), "Statut incorrect");

		} catch (MRException e) {
			fail(e.getMessage());
		}
	}
}
