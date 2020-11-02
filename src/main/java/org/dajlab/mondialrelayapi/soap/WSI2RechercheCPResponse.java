
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
 *         &lt;element name="WSI2_RechercheCPResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RechercheCP" minOccurs="0"/>
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
    "wsi2RechercheCPResult"
})
@XmlRootElement(name = "WSI2_RechercheCPResponse")
public class WSI2RechercheCPResponse {

    @XmlElement(name = "WSI2_RechercheCPResult")
    protected RetWSI2RechercheCP wsi2RechercheCPResult;

    /**
     * Obtient la valeur de la propriété wsi2RechercheCPResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RechercheCP }
     *     
     */
    public RetWSI2RechercheCP getWSI2RechercheCPResult() {
        return wsi2RechercheCPResult;
    }

    /**
     * Définit la valeur de la propriété wsi2RechercheCPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RechercheCP }
     *     
     */
    public void setWSI2RechercheCPResult(RetWSI2RechercheCP value) {
        this.wsi2RechercheCPResult = value;
    }

}
