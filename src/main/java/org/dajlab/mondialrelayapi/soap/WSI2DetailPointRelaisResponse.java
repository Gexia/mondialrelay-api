
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
 *         &lt;element name="WSI2_DetailPointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_DetailPointRelais" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wsi2DetailPointRelaisResult" })
@XmlRootElement(name = "WSI2_DetailPointRelaisResponse")
public class WSI2DetailPointRelaisResponse {

	@XmlElement(name = "WSI2_DetailPointRelaisResult")
	protected RetWSI2DetailPointRelais wsi2DetailPointRelaisResult;

	/**
	 * Obtient la valeur de la propriété wsi2DetailPointRelaisResult.
	 * 
	 * @return possible object is {@link RetWSI2DetailPointRelais }
	 * 
	 */
	public RetWSI2DetailPointRelais getWSI2DetailPointRelaisResult() {
		return wsi2DetailPointRelaisResult;
	}

	/**
	 * Définit la valeur de la propriété wsi2DetailPointRelaisResult.
	 * 
	 * @param value
	 *            allowed object is {@link RetWSI2DetailPointRelais }
	 * 
	 */
	public void setWSI2DetailPointRelaisResult(RetWSI2DetailPointRelais value) {
		this.wsi2DetailPointRelaisResult = value;
	}

}
