
package istic.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the istic.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MaxResponse_QNAME = new QName("http://ws.istic/", "maxResponse");
    private final static QName _Max_QNAME = new QName("http://ws.istic/", "max");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: istic.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Max }
     * 
     */
    public Max createMax() {
        return new Max();
    }

    /**
     * Create an instance of {@link MaxResponse }
     * 
     */
    public MaxResponse createMaxResponse() {
        return new MaxResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.istic/", name = "maxResponse")
    public JAXBElement<MaxResponse> createMaxResponse(MaxResponse value) {
        return new JAXBElement<MaxResponse>(_MaxResponse_QNAME, MaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Max }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.istic/", name = "max")
    public JAXBElement<Max> createMax(Max value) {
        return new JAXBElement<Max>(_Max_QNAME, Max.class, null, value);
    }

}
