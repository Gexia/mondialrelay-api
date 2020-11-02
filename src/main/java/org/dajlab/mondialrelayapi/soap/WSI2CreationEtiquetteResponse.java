
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
 *         &lt;element name="WSI2_CreationEtiquetteResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_CreationEtiquette" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wsi2CreationEtiquetteResult" })
@XmlRootElement(name = "WSI2_CreationEtiquetteResponse")
public class WSI2CreationEtiquetteResponse {

	@XmlElement(name = "WSI2_CreationEtiquetteResult")
	protected RetWSI2CreationEtiquette wsi2CreationEtiquetteResult;

	/**
	 * Obtient la valeur de la propriété wsi2CreationEtiquetteResult.
	 * 
	 * @return possible object is {@link RetWSI2CreationEtiquette }
	 * 
	 */
	public RetWSI2CreationEtiquette getWSI2CreationEtiquetteResult() {
		return wsi2CreationEtiquetteResult;
	}

	/**
	 * Définit la valeur de la propriété wsi2CreationEtiquetteResult.
	 * 
	 * @param value
	 *            allowed object is {@link RetWSI2CreationEtiquette }
	 * 
	 */
	public void setWSI2CreationEtiquetteResult(RetWSI2CreationEtiquette value) {
		this.wsi2CreationEtiquetteResult = value;
	}

}
