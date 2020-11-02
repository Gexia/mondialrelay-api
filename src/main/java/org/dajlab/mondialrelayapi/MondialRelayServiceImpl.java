/*
 * Copyright 2020 Erik Amzallag
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dajlab.mondialrelayapi;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.commons.codec.digest.DigestUtils;
import org.dajlab.mondialrelayapi.soap.RetWSI2SubTracingColisDetaille;
import org.dajlab.mondialrelayapi.soap.RetWSI2TracingColisDetaille;
import org.dajlab.mondialrelayapi.soap.WebServicesSoap;
import org.dajlab.mondialrelayapi.vo.MREvenementSuivi;
import org.dajlab.mondialrelayapi.vo.MRException;
import org.dajlab.mondialrelayapi.vo.MRStatut;
import org.dajlab.mondialrelayapi.vo.MRSuiviColis;

/**
 * Implémentation du service.<br>
 * Le package soap a été généré automatiquement (JAX-WS).
 * 
 * @author Erik
 *
 */
public class MondialRelayServiceImpl implements IMondialRelayService {

	/**
	 * URL du webservice.
	 */
	private static final String URL = "https://api.mondialrelay.com/Web_Services.asmx?WSDL";

	/**
	 * Web service.
	 */
	private WebServicesSoap mrService;

	/**
	 * Code enseigne.
	 */
	private String enseigne;

	/**
	 * Clé privée.
	 */
	private String cle;

	/**
	 * Langue. Français par défaut.
	 */
	private String langue = "FR";

	/**
	 * Constructeur.
	 * 
	 * @param enseigne enseigne
	 * @param cle      clé privée
	 * @throws MRException en cas d'erreur.
	 */
	public MondialRelayServiceImpl(String enseigne, String cle) throws MRException {

		this.enseigne = enseigne;
		this.cle = cle;

		try {
			URL url = new URL(URL);

			QName qname = new QName("http://www.mondialrelay.fr/webservice/", "Web_Services");

			Service service = Service.create(url, qname);

			mrService = service.getPort(WebServicesSoap.class);
			String endpointURL = "https://api.mondialrelay.com/Web_Services.asmx";
			BindingProvider bp = (BindingProvider) mrService;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
		} catch (Exception e) {
			throw new MRException(e.getMessage());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MRSuiviColis getSuivi(String numeroSuivi) throws MRException {

		return getSuivi(numeroSuivi, langue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public MRSuiviColis getSuivi(String numeroSuivi, String langue) throws MRException {

		MRSuiviColis suivi = null;

		try {
			RetWSI2TracingColisDetaille retour = mrService.wsi2TracingColisDetaille(enseigne, numeroSuivi, langue,
					genererCleSecurite(enseigne, numeroSuivi, langue));

			if (retour != null) {
				MRStatut stat = MRStatut.fromCode(retour.getSTAT());
				if (stat != null) {
					switch (stat) {
					case STAT0:
					case STAT80:
					case STAT81:
					case STAT82:
					case STAT83:
						suivi = creerSuivi(retour, stat);
						break;
					default:
						suivi = new MRSuiviColis();
						suivi.setStatut(stat);
						break;
					}
					suivi.setNumeroSuivi(numeroSuivi);
				}
			}
		} catch (Exception e) {
			throw new MRException(e.getMessage());
		}
		return suivi;
	}

	/**
	 * Instancie un suivi à partir du retour du webservice.
	 * 
	 * @param retour
	 * @param stat
	 * @return
	 */
	private MRSuiviColis creerSuivi(RetWSI2TracingColisDetaille retour, MRStatut stat) {

		MRSuiviColis suivi = new MRSuiviColis();
		suivi.setStatut(stat);
		suivi.setLibelle01(retour.getLibelle01());
		suivi.setLibelle02(retour.getLibelle02());
		suivi.setLibelleRelais(retour.getRelaisLibelle());
		suivi.setNumeroRelais(retour.getRelaisNum());
		if (retour.getTracing() != null && retour.getTracing().getRetWSI2SubTracingColisDetaille() != null) {
			for (RetWSI2SubTracingColisDetaille subTracing : retour.getTracing().getRetWSI2SubTracingColisDetaille()) {
				if (subTracing.getDate() != null && subTracing.getDate().length() > 0) {
					MREvenementSuivi evenement = new MREvenementSuivi(subTracing.getDate(), subTracing.getHeure());
					evenement.setEmplacement(subTracing.getEmplacement());
					evenement.setLibelle(subTracing.getLibelle());
					evenement.setNumeroRelais(subTracing.getRelaisNum());
					evenement.setPaysRelais(subTracing.getRelaisPays());
					suivi.getEvenements().add(evenement);
				}
			}
		}
		return suivi;
	}

	/**
	 * Génère la clé de sécurité à partir des paramètres de la méthode du webservice
	 * et de la clé privée.
	 * 
	 * @param parametres liste des parametres dans l'ordre de ceux de la méthode
	 *                   appelée.
	 * @return la clé de sécurité calculée.
	 */
	private String genererCleSecurite(String... parametres) {

		StringBuilder sb = new StringBuilder();

		for (String parametre : parametres) {
			sb.append(parametre);
		}
		sb.append(cle);

		String cleSecurite = DigestUtils.md5Hex(sb.toString()).toUpperCase();
		return cleSecurite;

	}
}
