
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour Commune complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType name="Commune">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commune", propOrder = { "cp", "ville", "pays" })
public class Commune {

	@XmlElement(name = "CP")
	protected String cp;
	@XmlElement(name = "Ville")
	protected String ville;
	@XmlElement(name = "Pays")
	protected String pays;

	/**
	 * Obtient la valeur de la propriété cp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCP() {
		return cp;
	}

	/**
	 * Définit la valeur de la propriété cp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCP(String value) {
		this.cp = value;
	}

	/**
	 * Obtient la valeur de la propriété ville.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Définit la valeur de la propriété ville.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVille(String value) {
		this.ville = value;
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

}
