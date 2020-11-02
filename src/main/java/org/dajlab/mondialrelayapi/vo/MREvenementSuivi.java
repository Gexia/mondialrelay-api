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
package org.dajlab.mondialrelayapi.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Evènement du suivi d'un envoi.
 * 
 * @author Erik Amzallag
 *
 */
public class MREvenementSuivi {

	/**
	 * Parseur de date.
	 */
	private static SimpleDateFormat JJMMAASLASHHHMM = new SimpleDateFormat("dd/MM/yy HH:mm");

	/**
	 * Libellé du tracing.
	 */
	private String libelle;
	/**
	 * Date de l'évènement.
	 */
	private Calendar date;
	/**
	 * Emplacement (Ville) de l'évènement.
	 */
	private String emplacement;
	/**
	 * Numéro du Point Relais de l'évènement (si applicable).
	 */
	private String numeroRelais;
	/**
	 * Pays du Point Relais de l'évènement (si applicable).
	 */
	private String paysRelais;

	/**
	 * Constcuteur.
	 * 
	 * @param dateEvenement  date de l'évènement (format jj/mm/aa)
	 * @param heureEvenement heure de l'évènement (format hh:mm)
	 */
	public MREvenementSuivi(String dateEvenement, String heureEvenement) {

		String dateComplete = dateEvenement + " " + heureEvenement;
		date = new GregorianCalendar();
		try {
			Date dd = JJMMAASLASHHHMM.parse(dateComplete);
			date.setTime(dd);
		} catch (ParseException e) {
			date = null;
		}

	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @return the emplacement
	 */
	public String getEmplacement() {
		return emplacement;
	}

	/**
	 * @param emplacement the emplacement to set
	 */
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	/**
	 * @return the numeroRelais
	 */
	public String getNumeroRelais() {
		return numeroRelais;
	}

	/**
	 * @param numeroRelais the numeroRelais to set
	 */
	public void setNumeroRelais(String numeroRelais) {
		this.numeroRelais = numeroRelais;
	}

	/**
	 * @return the paysRelais
	 */
	public String getPaysRelais() {
		return paysRelais;
	}

	/**
	 * @param paysRelais the paysRelais to set
	 */
	public void setPaysRelais(String paysRelais) {
		this.paysRelais = paysRelais;
	}

}
