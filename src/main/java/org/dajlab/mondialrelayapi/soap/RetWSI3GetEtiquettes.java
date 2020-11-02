
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI3_GetEtiquettes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI3_GetEtiquettes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_WSI2_GetEtiquettes">
 *       &lt;sequence>
 *         &lt;element name="URL_PDF_10x15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI3_GetEtiquettes", propOrder = {
    "urlpdf10X15"
})
public class RetWSI3GetEtiquettes
    extends RetWSI2GetEtiquettes
{

    @XmlElement(name = "URL_PDF_10x15")
    protected String urlpdf10X15;

    /**
     * Obtient la valeur de la propriété urlpdf10X15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPDF10X15() {
        return urlpdf10X15;
    }

    /**
     * Définit la valeur de la propriété urlpdf10X15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPDF10X15(String value) {
        this.urlpdf10X15 = value;
    }

}
