
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
 *         &lt;element name="WSI3_GetEtiquettesResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI3_GetEtiquettes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wsi3GetEtiquettesResult" })
@XmlRootElement(name = "WSI3_GetEtiquettesResponse")
public class WSI3GetEtiquettesResponse {

	@XmlElement(name = "WSI3_GetEtiquettesResult")
	protected RetWSI3GetEtiquettes wsi3GetEtiquettesResult;

	/**
	 * Obtient la valeur de la propriété wsi3GetEtiquettesResult.
	 * 
	 * @return possible object is {@link RetWSI3GetEtiquettes }
	 * 
	 */
	public RetWSI3GetEtiquettes getWSI3GetEtiquettesResult() {
		return wsi3GetEtiquettesResult;
	}

	/**
	 * Définit la valeur de la propriété wsi3GetEtiquettesResult.
	 * 
	 * @param value
	 *            allowed object is {@link RetWSI3GetEtiquettes }
	 * 
	 */
	public void setWSI3GetEtiquettesResult(RetWSI3GetEtiquettes value) {
		this.wsi3GetEtiquettesResult = value;
	}

}
