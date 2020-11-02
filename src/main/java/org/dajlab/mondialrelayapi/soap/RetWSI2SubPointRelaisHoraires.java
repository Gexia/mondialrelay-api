
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour ret_WSI2_sub_PointRelaisHoraires complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_sub_PointRelaisHoraires">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Horaires_Lundi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Mardi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Mercredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Jeudi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Vendredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Samedi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Dimanche" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_sub_PointRelaisHoraires", propOrder = { "num", "lgAdr1", "lgAdr2", "lgAdr3", "lgAdr4", "cp",
		"ville", "pays", "horairesLundi", "horairesMardi", "horairesMercredi", "horairesJeudi", "horairesVendredi",
		"horairesSamedi", "horairesDimanche" })
public class RetWSI2SubPointRelaisHoraires {

	@XmlElement(name = "Num")
	protected String num;
	@XmlElement(name = "LgAdr1")
	protected String lgAdr1;
	@XmlElement(name = "LgAdr2")
	protected String lgAdr2;
	@XmlElement(name = "LgAdr3")
	protected String lgAdr3;
	@XmlElement(name = "LgAdr4")
	protected String lgAdr4;
	@XmlElement(name = "CP")
	protected String cp;
	@XmlElement(name = "Ville")
	protected String ville;
	@XmlElement(name = "Pays")
	protected String pays;
	@XmlElement(name = "Horaires_Lundi")
	protected ArrayOfString horairesLundi;
	@XmlElement(name = "Horaires_Mardi")
	protected ArrayOfString horairesMardi;
	@XmlElement(name = "Horaires_Mercredi")
	protected ArrayOfString horairesMercredi;
	@XmlElement(name = "Horaires_Jeudi")
	protected ArrayOfString horairesJeudi;
	@XmlElement(name = "Horaires_Vendredi")
	protected ArrayOfString horairesVendredi;
	@XmlElement(name = "Horaires_Samedi")
	protected ArrayOfString horairesSamedi;
	@XmlElement(name = "Horaires_Dimanche")
	protected ArrayOfString horairesDimanche;

	/**
	 * Obtient la valeur de la propriété num.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNum() {
		return num;
	}

	/**
	 * Définit la valeur de la propriété num.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNum(String value) {
		this.num = value;
	}

	/**
	 * Obtient la valeur de la propriété lgAdr1.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLgAdr1() {
		return lgAdr1;
	}

	/**
	 * Définit la valeur de la propriété lgAdr1.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLgAdr1(String value) {
		this.lgAdr1 = value;
	}

	/**
	 * Obtient la valeur de la propriété lgAdr2.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLgAdr2() {
		return lgAdr2;
	}

	/**
	 * Définit la valeur de la propriété lgAdr2.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLgAdr2(String value) {
		this.lgAdr2 = value;
	}

	/**
	 * Obtient la valeur de la propriété lgAdr3.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLgAdr3() {
		return lgAdr3;
	}

	/**
	 * Définit la valeur de la propriété lgAdr3.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLgAdr3(String value) {
		this.lgAdr3 = value;
	}

	/**
	 * Obtient la valeur de la propriété lgAdr4.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLgAdr4() {
		return lgAdr4;
	}

	/**
	 * Définit la valeur de la propriété lgAdr4.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLgAdr4(String value) {
		this.lgAdr4 = value;
	}

	/**
	 * Obtient la valeur de la propriété cp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCP() {
		return cp;
	}

	/**
	 * Définit la valeur de la propriété cp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCP(String value) {
		this.cp = value;
	}

	/**
	 * Obtient la valeur de la propriété ville.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Définit la valeur de la propriété ville.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVille(String value) {
		this.ville = value;
	}

	/**
	 * Obtient la valeur de la propriété pays.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * Définit la valeur de la propriété pays.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPays(String value) {
		this.pays = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesLundi.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesLundi() {
		return horairesLundi;
	}

	/**
	 * Définit la valeur de la propriété horairesLundi.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesLundi(ArrayOfString value) {
		this.horairesLundi = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesMardi.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesMardi() {
		return horairesMardi;
	}

	/**
	 * Définit la valeur de la propriété horairesMardi.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesMardi(ArrayOfString value) {
		this.horairesMardi = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesMercredi.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesMercredi() {
		return horairesMercredi;
	}

	/**
	 * Définit la valeur de la propriété horairesMercredi.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesMercredi(ArrayOfString value) {
		this.horairesMercredi = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesJeudi.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesJeudi() {
		return horairesJeudi;
	}

	/**
	 * Définit la valeur de la propriété horairesJeudi.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesJeudi(ArrayOfString value) {
		this.horairesJeudi = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesVendredi.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesVendredi() {
		return horairesVendredi;
	}

	/**
	 * Définit la valeur de la propriété horairesVendredi.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesVendredi(ArrayOfString value) {
		this.horairesVendredi = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesSamedi.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesSamedi() {
		return horairesSamedi;
	}

	/**
	 * Définit la valeur de la propriété horairesSamedi.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesSamedi(ArrayOfString value) {
		this.horairesSamedi = value;
	}

	/**
	 * Obtient la valeur de la propriété horairesDimanche.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getHorairesDimanche() {
		return horairesDimanche;
	}

	/**
	 * Définit la valeur de la propriété horairesDimanche.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setHorairesDimanche(ArrayOfString value) {
		this.horairesDimanche = value;
	}

}
