//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.14 à 03:01:31 PM WAT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="villeDepart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="villeArrive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heureDepart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbReservations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "villeDepart",
    "villeArrive",
    "heureDepart",
    "nbPlaces",
    "nbReservations"
})
@XmlRootElement(name = "Train")
public class Train {

    @XmlElement(required = true)
    protected String villeDepart;
    @XmlElement(required = true)
    protected String villeArrive;
    protected int heureDepart;
    protected int nbPlaces;
    protected int nbReservations;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Obtient la valeur de la propriété villeDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleDepart() {
        return villeDepart;
    }

    /**
     * Définit la valeur de la propriété villeDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleDepart(String value) {
        this.villeDepart = value;
    }

    /**
     * Obtient la valeur de la propriété villeArrive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleArrive() {
        return villeArrive;
    }

    /**
     * Définit la valeur de la propriété villeArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleArrive(String value) {
        this.villeArrive = value;
    }

    /**
     * Obtient la valeur de la propriété heureDepart.
     * 
     */
    public int getHeureDepart() {
        return heureDepart;
    }

    /**
     * Définit la valeur de la propriété heureDepart.
     * 
     */
    public void setHeureDepart(int value) {
        this.heureDepart = value;
    }

    /**
     * Obtient la valeur de la propriété nbPlaces.
     * 
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * Définit la valeur de la propriété nbPlaces.
     * 
     */
    public void setNbPlaces(int value) {
        this.nbPlaces = value;
    }

    /**
     * Obtient la valeur de la propriété nbReservations.
     * 
     */
    public int getNbReservations() {
        return nbReservations;
    }

    /**
     * Définit la valeur de la propriété nbReservations.
     * 
     */
    public void setNbReservations(int value) {
        this.nbReservations = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
