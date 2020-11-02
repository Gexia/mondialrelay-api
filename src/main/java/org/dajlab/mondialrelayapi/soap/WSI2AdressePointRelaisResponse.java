
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
 *         &lt;element name="WSI2_AdressePointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_AdressePointRelais" minOccurs="0"/>
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
    "wsi2AdressePointRelaisResult"
})
@XmlRootElement(name = "WSI2_AdressePointRelaisResponse")
public class WSI2AdressePointRelaisResponse {

    @XmlElement(name = "WSI2_AdressePointRelaisResult")
    protected RetWSI2AdressePointRelais wsi2AdressePointRelaisResult;

    /**
     * Obtient la valeur de la propriété wsi2AdressePointRelaisResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2AdressePointRelais }
     *     
     */
    public RetWSI2AdressePointRelais getWSI2AdressePointRelaisResult() {
        return wsi2AdressePointRelaisResult;
    }

    /**
     * Définit la valeur de la propriété wsi2AdressePointRelaisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2AdressePointRelais }
     *     
     */
    public void setWSI2AdressePointRelaisResult(RetWSI2AdressePointRelais value) {
        this.wsi2AdressePointRelaisResult = value;
    }

}
