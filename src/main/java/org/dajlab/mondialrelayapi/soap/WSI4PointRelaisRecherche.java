
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
 *         &lt;element name="Enseigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPointRelais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelaiEnvoi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RayonRecherche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeActivite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreResultats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "enseigne",
    "pays",
    "numPointRelais",
    "ville",
    "cp",
    "latitude",
    "longitude",
    "taille",
    "poids",
    "action",
    "delaiEnvoi",
    "rayonRecherche",
    "typeActivite",
    "nace",
    "nombreResultats",
    "security"
})
@XmlRootElement(name = "WSI4_PointRelais_Recherche")
public class WSI4PointRelaisRecherche {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "NumPointRelais")
    protected String numPointRelais;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Taille")
    protected String taille;
    @XmlElement(name = "Poids")
    protected String poids;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "DelaiEnvoi")
    protected String delaiEnvoi;
    @XmlElement(name = "RayonRecherche")
    protected String rayonRecherche;
    @XmlElement(name = "TypeActivite")
    protected String typeActivite;
    @XmlElement(name = "NACE")
    protected String nace;
    @XmlElement(name = "NombreResultats", required = true, type = Integer.class, nillable = true)
    protected Integer nombreResultats;
    @XmlElement(name = "Security")
    protected String security;

    /**
     * Obtient la valeur de la propri�t� enseigne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnseigne() {
        return enseigne;
    }

    /**
     * D�finit la valeur de la propri�t� enseigne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnseigne(String value) {
        this.enseigne = value;
    }

    /**
     * Obtient la valeur de la propri�t� pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * D�finit la valeur de la propri�t� pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propri�t� numPointRelais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPointRelais() {
        return numPointRelais;
    }

    /**
     * D�finit la valeur de la propri�t� numPointRelais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPointRelais(String value) {
        this.numPointRelais = value;
    }

    /**
     * Obtient la valeur de la propri�t� ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * D�finit la valeur de la propri�t� ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propri�t� cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * D�finit la valeur de la propri�t� cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtient la valeur de la propri�t� latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * D�finit la valeur de la propri�t� latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtient la valeur de la propri�t� longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * D�finit la valeur de la propri�t� longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtient la valeur de la propri�t� taille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaille() {
        return taille;
    }

    /**
     * D�finit la valeur de la propri�t� taille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaille(String value) {
        this.taille = value;
    }

    /**
     * Obtient la valeur de la propri�t� poids.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoids() {
        return poids;
    }

    /**
     * D�finit la valeur de la propri�t� poids.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoids(String value) {
        this.poids = value;
    }

    /**
     * Obtient la valeur de la propri�t� action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * D�finit la valeur de la propri�t� action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtient la valeur de la propri�t� delaiEnvoi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaiEnvoi() {
        return delaiEnvoi;
    }

    /**
     * D�finit la valeur de la propri�t� delaiEnvoi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaiEnvoi(String value) {
        this.delaiEnvoi = value;
    }

    /**
     * Obtient la valeur de la propri�t� rayonRecherche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayonRecherche() {
        return rayonRecherche;
    }

    /**
     * D�finit la valeur de la propri�t� rayonRecherche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayonRecherche(String value) {
        this.rayonRecherche = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeActivite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeActivite() {
        return typeActivite;
    }

    /**
     * D�finit la valeur de la propri�t� typeActivite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeActivite(String value) {
        this.typeActivite = value;
    }

    /**
     * Obtient la valeur de la propri�t� nace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACE() {
        return nace;
    }

    /**
     * D�finit la valeur de la propri�t� nace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACE(String value) {
        this.nace = value;
    }

    /**
     * Obtient la valeur de la propri�t� nombreResultats.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNombreResultats() {
        return nombreResultats;
    }

    /**
     * D�finit la valeur de la propri�t� nombreResultats.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNombreResultats(Integer value) {
        this.nombreResultats = value;
    }

    /**
     * Obtient la valeur de la propri�t� security.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * D�finit la valeur de la propri�t� security.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

}
