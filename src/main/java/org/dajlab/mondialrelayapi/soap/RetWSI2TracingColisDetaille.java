
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_TracingColisDetaille complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_TracingColisDetaille">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="Libelle01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relais_Libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relais_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Libelle02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tracing" type="{http://www.mondialrelay.fr/webservice/}ArrayOfRet_WSI2_sub_TracingColisDetaille" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_TracingColisDetaille", propOrder = {
    "libelle01",
    "relaisLibelle",
    "relaisNum",
    "libelle02",
    "tracing"
})
public class RetWSI2TracingColisDetaille
    extends Ret
{

    @XmlElement(name = "Libelle01")
    protected String libelle01;
    @XmlElement(name = "Relais_Libelle")
    protected String relaisLibelle;
    @XmlElement(name = "Relais_Num")
    protected String relaisNum;
    @XmlElement(name = "Libelle02")
    protected String libelle02;
    @XmlElement(name = "Tracing")
    protected ArrayOfRetWSI2SubTracingColisDetaille tracing;

    /**
     * Obtient la valeur de la propri�t� libelle01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle01() {
        return libelle01;
    }

    /**
     * D�finit la valeur de la propri�t� libelle01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle01(String value) {
        this.libelle01 = value;
    }

    /**
     * Obtient la valeur de la propri�t� relaisLibelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisLibelle() {
        return relaisLibelle;
    }

    /**
     * D�finit la valeur de la propri�t� relaisLibelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisLibelle(String value) {
        this.relaisLibelle = value;
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
     * Obtient la valeur de la propri�t� libelle02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle02() {
        return libelle02;
    }

    /**
     * D�finit la valeur de la propri�t� libelle02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle02(String value) {
        this.libelle02 = value;
    }

    /**
     * Obtient la valeur de la propri�t� tracing.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetWSI2SubTracingColisDetaille }
     *     
     */
    public ArrayOfRetWSI2SubTracingColisDetaille getTracing() {
        return tracing;
    }

    /**
     * D�finit la valeur de la propri�t� tracing.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetWSI2SubTracingColisDetaille }
     *     
     */
    public void setTracing(ArrayOfRetWSI2SubTracingColisDetaille value) {
        this.tracing = value;
    }

}
