//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.31 at 10:04:57 AM PDT 
//


package com.pacsun.store.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pacsun.store.jaxb package. 
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

    private final static QName _Store_QNAME = new QName("http://www.demandware.com/xml/impex/store/2007-04-30", "store");
    private final static QName _SharedTypeCustomAttributeValue_QNAME = new QName("http://www.demandware.com/xml/impex/store/2007-04-30", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pacsun.store.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplexTypeStore }
     * 
     */
    public ComplexTypeStore createComplexTypeStore() {
        return new ComplexTypeStore();
    }

    /**
     * Create an instance of {@link Stores }
     * 
     */
    public Stores createStores() {
        return new Stores();
    }

    /**
     * Create an instance of {@link SharedTypeCustomAttribute }
     * 
     */
    public SharedTypeCustomAttribute createSharedTypeCustomAttribute() {
        return new SharedTypeCustomAttribute();
    }

    /**
     * Create an instance of {@link SharedTypeCustomAttributes }
     * 
     */
    public SharedTypeCustomAttributes createSharedTypeCustomAttributes() {
        return new SharedTypeCustomAttributes();
    }

    /**
     * Create an instance of {@link SharedTypeLocalizedText }
     * 
     */
    public SharedTypeLocalizedText createSharedTypeLocalizedText() {
        return new SharedTypeLocalizedText();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexTypeStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.demandware.com/xml/impex/store/2007-04-30", name = "store")
    public JAXBElement<ComplexTypeStore> createStore(ComplexTypeStore value) {
        return new JAXBElement<ComplexTypeStore>(_Store_QNAME, ComplexTypeStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.demandware.com/xml/impex/store/2007-04-30", name = "value", scope = SharedTypeCustomAttribute.class)
    public JAXBElement<String> createSharedTypeCustomAttributeValue(String value) {
        return new JAXBElement<String>(_SharedTypeCustomAttributeValue_QNAME, String.class, SharedTypeCustomAttribute.class, value);
    }

}
