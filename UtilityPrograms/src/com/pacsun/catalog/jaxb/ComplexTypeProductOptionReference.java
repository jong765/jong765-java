//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.02 at 10:11:34 AM PST 
//


package com.pacsun.catalog.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.Product.Option.Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.Product.Option.Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="option-id" use="required" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.Generic.NonEmptyString.256" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.Product.Option.Reference", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
public class ComplexTypeProductOptionReference {

    @XmlAttribute(name = "option-id", required = true)
    protected String optionId;

    /**
     * Gets the value of the optionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionId() {
        return optionId;
    }

    /**
     * Sets the value of the optionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionId(String value) {
        this.optionId = value;
    }

}