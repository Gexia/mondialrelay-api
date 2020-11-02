
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_CreationExpedition complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_CreationExpedition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="ExpeditionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_AgenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_Groupe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_Navette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_Agence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_TourneeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_LivraisonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodesBarres" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_CreationExpedition", propOrder = {
    "expeditionNum",
    "triAgenceCode",
    "triGroupe",
    "triNavette",
    "triAgence",
    "triTourneeCode",
    "triLivraisonMode",
    "codesBarres"
})
public class RetWSI2CreationExpedition
    extends Ret
{

    @XmlElement(name = "ExpeditionNum")
    protected String expeditionNum;
    @XmlElement(name = "TRI_AgenceCode")
    protected String triAgenceCode;
    @XmlElement(name = "TRI_Groupe")
    protected String triGroupe;
    @XmlElement(name = "TRI_Navette")
    protected String triNavette;
    @XmlElement(name = "TRI_Agence")
    protected String triAgence;
    @XmlElement(name = "TRI_TourneeCode")
    protected String triTourneeCode;
    @XmlElement(name = "TRI_LivraisonMode")
    protected String triLivraisonMode;
    @XmlElement(name = "CodesBarres")
    protected ArrayOfString codesBarres;

    /**
     * Obtient la valeur de la propri�t� expeditionNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditionNum() {
        return expeditionNum;
    }

    /**
     * D�finit la valeur de la propri�t� expeditionNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditionNum(String value) {
        this.expeditionNum = value;
    }

    /**
     * Obtient la valeur de la propri�t� triAgenceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIAgenceCode() {
        return triAgenceCode;
    }

    /**
     * D�finit la valeur de la propri�t� triAgenceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIAgenceCode(String value) {
        this.triAgenceCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� triGroupe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIGroupe() {
        return triGroupe;
    }

    /**
     * D�finit la valeur de la propri�t� triGroupe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIGroupe(String value) {
        this.triGroupe = value;
    }

    /**
     * Obtient la valeur de la propri�t� triNavette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRINavette() {
        return triNavette;
    }

    /**
     * D�finit la valeur de la propri�t� triNavette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRINavette(String value) {
        this.triNavette = value;
    }

    /**
     * Obtient la valeur de la propri�t� triAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIAgence() {
        return triAgence;
    }

    /**
     * D�finit la valeur de la propri�t� triAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIAgence(String value) {
        this.triAgence = value;
    }

    /**
     * Obtient la valeur de la propri�t� triTourneeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRITourneeCode() {
        return triTourneeCode;
    }

    /**
     * D�finit la valeur de la propri�t� triTourneeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRITourneeCode(String value) {
        this.triTourneeCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� triLivraisonMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRILivraisonMode() {
        return triLivraisonMode;
    }

    /**
     * D�finit la valeur de la propri�t� triLivraisonMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRILivraisonMode(String value) {
        this.triLivraisonMode = value;
    }

    /**
     * Obtient la valeur de la propri�t� codesBarres.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCodesBarres() {
        return codesBarres;
    }

    /**
     * D�finit la valeur de la propri�t� codesBarres.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCodesBarres(ArrayOfString value) {
        this.codesBarres = value;
    }

}
