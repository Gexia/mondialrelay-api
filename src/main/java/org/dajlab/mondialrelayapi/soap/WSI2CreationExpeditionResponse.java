
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
 *         &lt;element name="WSI2_CreationExpeditionResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_CreationExpedition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wsi2CreationExpeditionResult" })
@XmlRootElement(name = "WSI2_CreationExpeditionResponse")
public class WSI2CreationExpeditionResponse {

	@XmlElement(name = "WSI2_CreationExpeditionResult")
	protected RetWSI2CreationExpedition wsi2CreationExpeditionResult;

	/**
	 * Obtient la valeur de la propriété wsi2CreationExpeditionResult.
	 * 
	 * @return possible object is {@link RetWSI2CreationExpedition }
	 * 
	 */
	public RetWSI2CreationExpedition getWSI2CreationExpeditionResult() {
		return wsi2CreationExpeditionResult;
	}

	/**
	 * Définit la valeur de la propriété wsi2CreationExpeditionResult.
	 * 
	 * @param value
	 *            allowed object is {@link RetWSI2CreationExpedition }
	 * 
	 */
	public void setWSI2CreationExpeditionResult(RetWSI2CreationExpedition value) {
		this.wsi2CreationExpeditionResult = value;
	}

}
