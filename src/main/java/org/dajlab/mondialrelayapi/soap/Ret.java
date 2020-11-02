
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_ complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_", propOrder = {
    "stat"
})
@XmlSeeAlso({
    RetWSI2CreationExpedition.class,
    RetWSI2TracingColisDetaille.class,
    RetWSI2RecherchePointRelaisAvancee.class,
    RetWSI3PointRelaisRecherche.class,
    RetWSI2GetEtiquettes.class,
    RetWSI2CreationEtiquette.class,
    RetWSI2DetailPointRelais.class,
    RetWSI2RechercheCP.class,
    RetWSI2RecherchePointRelais.class,
    RetWSI2RecherchePointRelaisHoraires.class,
    RetWSI2AdressePointRelais.class
})
public class Ret {

    @XmlElement(name = "STAT")
    protected String stat;

    /**
     * Obtient la valeur de la propriété stat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAT() {
        return stat;
    }

    /**
     * Définit la valeur de la propriété stat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAT(String value) {
        this.stat = value;
    }

}
