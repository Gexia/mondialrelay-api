
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
 *         &lt;element name="WSI2_STAT_LabelsResult" type="{http://www.mondialrelay.fr/webservice/}ArrayOfArrayOfString" minOccurs="0"/>
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
    "wsi2STATLabelsResult"
})
@XmlRootElement(name = "WSI2_STAT_LabelsResponse")
public class WSI2STATLabelsResponse {

    @XmlElement(name = "WSI2_STAT_LabelsResult")
    protected ArrayOfArrayOfString wsi2STATLabelsResult;

    /**
     * Obtient la valeur de la propriété wsi2STATLabelsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public ArrayOfArrayOfString getWSI2STATLabelsResult() {
        return wsi2STATLabelsResult;
    }

    /**
     * Définit la valeur de la propriété wsi2STATLabelsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public void setWSI2STATLabelsResult(ArrayOfArrayOfString value) {
        this.wsi2STATLabelsResult = value;
    }

}
