
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_RechercheCP complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RechercheCP">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="Liste" type="{http://www.mondialrelay.fr/webservice/}ArrayOfCommune" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RechercheCP", propOrder = {
    "liste"
})
public class RetWSI2RechercheCP
    extends Ret
{

    @XmlElement(name = "Liste")
    protected ArrayOfCommune liste;

    /**
     * Obtient la valeur de la propri�t� liste.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommune }
     *     
     */
    public ArrayOfCommune getListe() {
        return liste;
    }

    /**
     * D�finit la valeur de la propri�t� liste.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommune }
     *     
     */
    public void setListe(ArrayOfCommune value) {
        this.liste = value;
    }

}
