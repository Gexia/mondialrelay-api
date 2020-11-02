
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSI3_PointRelais_RechercheResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI3_PointRelais_Recherche" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wsi3PointRelaisRechercheResult" })
@XmlRootElement(name = "WSI3_PointRelais_RechercheResponse")
public class WSI3PointRelaisRechercheResponse {

	@XmlElement(name = "WSI3_PointRelais_RechercheResult")
	protected RetWSI3PointRelaisRecherche wsi3PointRelaisRechercheResult;

	/**
	 * Obtient la valeur de la propriété wsi3PointRelaisRechercheResult.
	 * 
	 * @return possible object is {@link RetWSI3PointRelaisRecherche }
	 * 
	 */
	public RetWSI3PointRelaisRecherche getWSI3PointRelaisRechercheResult() {
		return wsi3PointRelaisRechercheResult;
	}

	/**
	 * Définit la valeur de la propriété wsi3PointRelaisRechercheResult.
	 * 
	 * @param value
	 *            allowed object is {@link RetWSI3PointRelaisRecherche }
	 * 
	 */
	public void setWSI3PointRelaisRechercheResult(RetWSI3PointRelaisRecherche value) {
		this.wsi3PointRelaisRechercheResult = value;
	}

}
