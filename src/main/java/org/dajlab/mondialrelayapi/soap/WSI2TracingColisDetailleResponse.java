
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
 *         &lt;element name="WSI2_TracingColisDetailleResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_TracingColisDetaille" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "wsi2TracingColisDetailleResult" })
@XmlRootElement(name = "WSI2_TracingColisDetailleResponse")
public class WSI2TracingColisDetailleResponse {

	@XmlElement(name = "WSI2_TracingColisDetailleResult")
	protected RetWSI2TracingColisDetaille wsi2TracingColisDetailleResult;

	/**
	 * Obtient la valeur de la propriété wsi2TracingColisDetailleResult.
	 * 
	 * @return possible object is {@link RetWSI2TracingColisDetaille }
	 * 
	 */
	public RetWSI2TracingColisDetaille getWSI2TracingColisDetailleResult() {
		return wsi2TracingColisDetailleResult;
	}

	/**
	 * Définit la valeur de la propriété wsi2TracingColisDetailleResult.
	 * 
	 * @param value
	 *            allowed object is {@link RetWSI2TracingColisDetaille }
	 * 
	 */
	public void setWSI2TracingColisDetailleResult(RetWSI2TracingColisDetaille value) {
		this.wsi2TracingColisDetailleResult = value;
	}

}
