
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSI2_STAT_LabelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wsi2STATLabelResult"
})
@XmlRootElement(name = "WSI2_STAT_LabelResponse")
public class WSI2STATLabelResponse {

    @XmlElement(name = "WSI2_STAT_LabelResult")
    protected String wsi2STATLabelResult;

    /**
     * Obtient la valeur de la propri�t� wsi2STATLabelResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSI2STATLabelResult() {
        return wsi2STATLabelResult;
    }

    /**
     * D�finit la valeur de la propri�t� wsi2STATLabelResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSI2STATLabelResult(String value) {
        this.wsi2STATLabelResult = value;
    }

}
