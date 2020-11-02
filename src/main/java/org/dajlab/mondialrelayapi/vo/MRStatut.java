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

/**
 * Statut du retour du webservice.
 * 
 * @author Erik
 *
 */
public enum MRStatut {

	STAT0(0, "Opération effectuée avec succès"), STAT80(80, "Code tracing : Colis enregistré"),
	STAT81(81, "Code tracing : Colis en traitement chez Mondial Relay"), STAT82(82, "Code tracing : Colis livré"),
	STAT83(83, "Code tracing : Anomalie"), STAT94(94, "Colis Inexistant"), STAT95(95, "Compte Enseigne non activé"),
	STAT96(96, "Type d'enseigne incorrect en Base"), STAT97(97, "Clé de sécurité invalide"),
	STAT98(98, "Erreur générique (Paramètres invalides)"), STAT99(99, "Erreur générique du service");

	/**
	 * Code.
	 */
	private int code;

	/**
	 * Libellé.
	 */
	private String libelle;

	/**
	 * Constructeur.
	 * 
	 * @param code    code
	 * @param libelle libelle
	 */
	private MRStatut(int code, String libelle) {

		this.code = code;
		this.libelle = libelle;
	}

	/**
	 * Recherche l'enum à partir du code.
	 * 
	 * @param code code
	 * @return l'enum, ou null si non trouvé.
	 */
	public static MRStatut fromCode(int code) {

		for (MRStatut codeType : MRStatut.values()) {
			if (codeType.getCode() == code) {
				return codeType;
			}
		}
		return null;
	}

	/**
	 * Recherche l'enum à partir du code.
	 * 
	 * @param code code
	 * @return l'enum, ou null si non trouvé.
	 */
	public static MRStatut fromCode(String code) {

		int codeInt = -1;
		try {
			codeInt = Integer.parseInt(code);
		} catch (NumberFormatException e) {

		}

		for (MRStatut codeType : MRStatut.values()) {
			if (codeType.getCode() == codeInt) {
				return codeType;
			}
		}
		return null;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

}
