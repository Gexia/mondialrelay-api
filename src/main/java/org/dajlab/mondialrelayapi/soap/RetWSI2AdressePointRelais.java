
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_AdressePointRelais complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_AdressePointRelais">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="LgAdr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_AdressePointRelais", propOrder = {
    "lgAdr1",
    "lgAdr2",
    "lgAdr3",
    "lgAdr4",
    "cp",
    "ville"
})
public class RetWSI2AdressePointRelais
    extends Ret
{

    @XmlElement(name = "LgAdr1")
    protected String lgAdr1;
    @XmlElement(name = "LgAdr2")
    protected String lgAdr2;
    @XmlElement(name = "LgAdr3")
    protected String lgAdr3;
    @XmlElement(name = "LgAdr4")
    protected String lgAdr4;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Ville")
    protected String ville;

    /**
     * Obtient la valeur de la propri�t� lgAdr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr1() {
        return lgAdr1;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr1(String value) {
        this.lgAdr1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr2() {
        return lgAdr2;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr2(String value) {
        this.lgAdr2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr3() {
        return lgAdr3;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr3(String value) {
        this.lgAdr3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr4() {
        return lgAdr4;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr4(String value) {
        this.lgAdr4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * D�finit la valeur de la propri�t� cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtient la valeur de la propri�t� ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * D�finit la valeur de la propri�t� ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
