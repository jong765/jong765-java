//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:59:57 PM PDT 
//


package com.pacsun.dworder.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.CustomPaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.CustomPaymentMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="method-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256"/>
 *         &lt;element name="custom-attributes" type="{http://www.demandware.com/xml/impex/order/2006-10-31}sharedType.CustomAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.CustomPaymentMethod", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "methodName",
    "customAttributes"
})
public class ComplexTypeCustomPaymentMethod {

    @XmlElement(name = "method-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String methodName;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SharedTypeCustomAttributes }
     *     
     */
    public SharedTypeCustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedTypeCustomAttributes }
     *     
     */
    public void setCustomAttributes(SharedTypeCustomAttributes value) {
        this.customAttributes = value;
    }

}