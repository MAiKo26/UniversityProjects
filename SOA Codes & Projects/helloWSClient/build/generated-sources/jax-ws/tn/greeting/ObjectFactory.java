
package tn.greeting;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tn.greeting package. 
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

    private final static QName _GreetingOperation_QNAME = new QName("http://greeting.tn", "greetingOperation");
    private final static QName _GreetingToOperationResponse_QNAME = new QName("http://greeting.tn", "greetingToOperationResponse");
    private final static QName _GreetingOperationResponse_QNAME = new QName("http://greeting.tn", "greetingOperationResponse");
    private final static QName _GreetingToOperation_QNAME = new QName("http://greeting.tn", "greetingToOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tn.greeting
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetingToOperationResponse }
     * 
     */
    public GreetingToOperationResponse createGreetingToOperationResponse() {
        return new GreetingToOperationResponse();
    }

    /**
     * Create an instance of {@link GreetingOperation }
     * 
     */
    public GreetingOperation createGreetingOperation() {
        return new GreetingOperation();
    }

    /**
     * Create an instance of {@link GreetingToOperation }
     * 
     */
    public GreetingToOperation createGreetingToOperation() {
        return new GreetingToOperation();
    }

    /**
     * Create an instance of {@link GreetingOperationResponse }
     * 
     */
    public GreetingOperationResponse createGreetingOperationResponse() {
        return new GreetingOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://greeting.tn", name = "greetingOperation")
    public JAXBElement<GreetingOperation> createGreetingOperation(GreetingOperation value) {
        return new JAXBElement<GreetingOperation>(_GreetingOperation_QNAME, GreetingOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingToOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://greeting.tn", name = "greetingToOperationResponse")
    public JAXBElement<GreetingToOperationResponse> createGreetingToOperationResponse(GreetingToOperationResponse value) {
        return new JAXBElement<GreetingToOperationResponse>(_GreetingToOperationResponse_QNAME, GreetingToOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://greeting.tn", name = "greetingOperationResponse")
    public JAXBElement<GreetingOperationResponse> createGreetingOperationResponse(GreetingOperationResponse value) {
        return new JAXBElement<GreetingOperationResponse>(_GreetingOperationResponse_QNAME, GreetingOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingToOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://greeting.tn", name = "greetingToOperation")
    public JAXBElement<GreetingToOperation> createGreetingToOperation(GreetingToOperation value) {
        return new JAXBElement<GreetingToOperation>(_GreetingToOperation_QNAME, GreetingToOperation.class, null, value);
    }

}
