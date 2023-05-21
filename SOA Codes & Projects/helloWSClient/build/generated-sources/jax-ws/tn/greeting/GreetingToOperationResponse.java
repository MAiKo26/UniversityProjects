
package tn.greeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour greetingToOperationResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="greetingToOperationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="greetingTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "greetingToOperationResponse", propOrder = {
    "greetingTo"
})
public class GreetingToOperationResponse {

    protected String greetingTo;

    /**
     * Obtient la valeur de la propriété greetingTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreetingTo() {
        return greetingTo;
    }

    /**
     * Définit la valeur de la propriété greetingTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreetingTo(String value) {
        this.greetingTo = value;
    }

}
