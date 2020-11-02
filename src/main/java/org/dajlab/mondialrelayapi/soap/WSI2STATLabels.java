
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enseigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Langue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "enseigne",
    "langue",
    "security"
})
@XmlRootElement(name = "WSI2_STAT_Labels")
public class WSI2STATLabels {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "Langue")
    protected String langue;
    @XmlElement(name = "Security")
    protected String security;

    /**
     * Obtient la valeur de la propriété enseigne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnseigne() {
        return enseigne;
    }

    /**
     * Définit la valeur de la propriété enseigne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnseigne(String value) {
        this.enseigne = value;
    }

    /**
     * Obtient la valeur de la propriété langue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangue() {
        return langue;
    }

    /**
     * Définit la valeur de la propriété langue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangue(String value) {
        this.langue = value;
    }

    /**
     * Obtient la valeur de la propriété security.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Définit la valeur de la propriété security.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

}
