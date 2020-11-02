
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
 *         &lt;element name="Enseigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "enseigne", "num", "pays", "security" })
@XmlRootElement(name = "WSI2_AdressePointRelais")
public class WSI2AdressePointRelais {

	@XmlElement(name = "Enseigne")
	protected String enseigne;
	@XmlElement(name = "Num")
	protected String num;
	@XmlElement(name = "Pays")
	protected String pays;
	@XmlElement(name = "Security")
	protected String security;

	/**
	 * Obtient la valeur de la propriété enseigne.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnseigne() {
		return enseigne;
	}

	/**
	 * Définit la valeur de la propriété enseigne.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnseigne(String value) {
		this.enseigne = value;
	}

	/**
	 * Obtient la valeur de la propriété num.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNum() {
		return num;
	}

	/**
	 * Définit la valeur de la propriété num.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNum(String value) {
		this.num = value;
	}

	/**
	 * Obtient la valeur de la propriété pays.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * Définit la valeur de la propriété pays.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPays(String value) {
		this.pays = value;
	}

	/**
	 * Obtient la valeur de la propriété security.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSecurity() {
		return security;
	}

	/**
	 * Définit la valeur de la propriété security.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSecurity(String value) {
		this.security = value;
	}

}
