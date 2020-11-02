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

import java.util.Set;
import java.util.TreeSet;

/**
 * Représente le suivi d'un colis.
 * 
 * @author Erik
 *
 */
public class MRSuiviColis {

	/**
	 * Numéro de suivi.
	 */
	private String numeroSuivi;

	/**
	 * Statut.
	 */
	private MRStatut statut;

	/**
	 * Libellé 01.
	 */
	private String libelle01;

	/**
	 * Libellé 02.
	 */
	private String libelle02;

	/**
	 * Libellé du point relais.
	 */
	private String libelleRelais;

	/**
	 * Numéro du point relais.
	 */
	private String numeroRelais;

	/**
	 * Liste d'évènements.
	 */
	private Set<MREvenementSuivi> evenements = new TreeSet<>(new EvenementSuiviComparator());

	/**
	 * @return the numeroSuivi
	 */
	public String getNumeroSuivi() {
		return numeroSuivi;
	}

	/**
	 * @param numeroSuivi the numeroSuivi to set
	 */
	public void setNumeroSuivi(String numeroSuivi) {
		this.numeroSuivi = numeroSuivi;
	}

	/**
	 * @return the statut
	 */
	public MRStatut getStatut() {
		return statut;
	}

	/**
	 * @param statut the statut to set
	 */
	public void setStatut(MRStatut statut) {
		this.statut = statut;
	}

	/**
	 * @return the libelle01
	 */
	public String getLibelle01() {
		return libelle01;
	}

	/**
	 * @param libelle01 the libelle01 to set
	 */
	public void setLibelle01(String libelle01) {
		this.libelle01 = libelle01;
	}

	/**
	 * @return the libelle02
	 */
	public String getLibelle02() {
		return libelle02;
	}

	/**
	 * @param libelle02 the libelle02 to set
	 */
	public void setLibelle02(String libelle02) {
		this.libelle02 = libelle02;
	}

	/**
	 * @return the libelleRelais
	 */
	public String getLibelleRelais() {
		return libelleRelais;
	}

	/**
	 * @param libelleRelais the libelleRelais to set
	 */
	public void setLibelleRelais(String libelleRelais) {
		this.libelleRelais = libelleRelais;
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
	 * @return the evenements
	 */
	public Set<MREvenementSuivi> getEvenements() {
		return evenements;
	}

	/**
	 * @param evenements the evenements to set
	 */
	public void setEvenements(Set<MREvenementSuivi> evenements) {
		this.evenements = evenements;
	}

}
