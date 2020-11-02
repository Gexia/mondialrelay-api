
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
 *         &lt;element name="WSI2_GetEtiquettesResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_GetEtiquettes" minOccurs="0"/>
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
    "wsi2GetEtiquettesResult"
})
@XmlRootElement(name = "WSI2_GetEtiquettesResponse")
public class WSI2GetEtiquettesResponse {

    @XmlElement(name = "WSI2_GetEtiquettesResult")
    protected RetWSI2GetEtiquettes wsi2GetEtiquettesResult;

    /**
     * Obtient la valeur de la propriété wsi2GetEtiquettesResult.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2GetEtiquettes }
     *     
     */
    public RetWSI2GetEtiquettes getWSI2GetEtiquettesResult() {
        return wsi2GetEtiquettesResult;
    }

    /**
     * Définit la valeur de la propriété wsi2GetEtiquettesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2GetEtiquettes }
     *     
     */
    public void setWSI2GetEtiquettesResult(RetWSI2GetEtiquettes value) {
        this.wsi2GetEtiquettesResult = value;
    }

}
