

package tp.istic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
     * Obtient la valeur de la propri�t� villeDepart.
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
     * D�finit la valeur de la propri�t� villeDepart.
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
     * Obtient la valeur de la propri�t� villeArrive.
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
     * D�finit la valeur de la propri�t� villeArrive.
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
     * Obtient la valeur de la propri�t� heureDepart.
     * 
     */
    public int getHeureDepart() {
        return heureDepart;
    }

    /**
     * D�finit la valeur de la propri�t� heureDepart.
     * 
     */
    public void setHeureDepart(int value) {
        this.heureDepart = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbPlaces.
     * 
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * D�finit la valeur de la propri�t� nbPlaces.
     * 
     */
    public void setNbPlaces(int value) {
        this.nbPlaces = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbReservations.
     * 
     */
    public int getNbReservations() {
        return nbReservations;
    }

    /**
     * D�finit la valeur de la propri�t� nbReservations.
     * 
     */
    public void setNbReservations(int value) {
        this.nbReservations = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
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
     * D�finit la valeur de la propri�t� id.
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
