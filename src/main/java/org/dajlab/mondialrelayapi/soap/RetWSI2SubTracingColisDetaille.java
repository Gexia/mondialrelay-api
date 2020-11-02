
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_sub_TracingColisDetaille complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_sub_TracingColisDetaille">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Heure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emplacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relais_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relais_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_sub_TracingColisDetaille", propOrder = {
    "libelle",
    "date",
    "heure",
    "emplacement",
    "relaisNum",
    "relaisPays"
})
public class RetWSI2SubTracingColisDetaille {

    @XmlElement(name = "Libelle")
    protected String libelle;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Heure")
    protected String heure;
    @XmlElement(name = "Emplacement")
    protected String emplacement;
    @XmlElement(name = "Relais_Num")
    protected String relaisNum;
    @XmlElement(name = "Relais_Pays")
    protected String relaisPays;

    /**
     * Obtient la valeur de la propri�t� libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * D�finit la valeur de la propri�t� libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propri�t� date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * D�finit la valeur de la propri�t� date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propri�t� heure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeure() {
        return heure;
    }

    /**
     * D�finit la valeur de la propri�t� heure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeure(String value) {
        this.heure = value;
    }

    /**
     * Obtient la valeur de la propri�t� emplacement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplacement() {
        return emplacement;
    }

    /**
     * D�finit la valeur de la propri�t� emplacement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplacement(String value) {
        this.emplacement = value;
    }

    /**
     * Obtient la valeur de la propri�t� relaisNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisNum() {
        return relaisNum;
    }

    /**
     * D�finit la valeur de la propri�t� relaisNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisNum(String value) {
        this.relaisNum = value;
    }

    /**
     * Obtient la valeur de la propri�t� relaisPays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisPays() {
        return relaisPays;
    }

    /**
     * D�finit la valeur de la propri�t� relaisPays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisPays(String value) {
        this.relaisPays = value;
    }

}
