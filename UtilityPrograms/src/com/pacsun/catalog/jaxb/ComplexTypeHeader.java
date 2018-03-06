//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.02 at 10:11:34 AM PST 
//


package com.pacsun.catalog.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="image-settings" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}complexType.Image.Settings" minOccurs="0"/>
 *         &lt;element name="custom-attributes" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}sharedType.CustomAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.Header", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", propOrder = {
    "imageSettings",
    "customAttributes"
})
public class ComplexTypeHeader {

    @XmlElement(name = "image-settings", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected ComplexTypeImageSettings imageSettings;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;

    /**
     * Gets the value of the imageSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeImageSettings }
     *     
     */
    public ComplexTypeImageSettings getImageSettings() {
        return imageSettings;
    }

    /**
     * Sets the value of the imageSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeImageSettings }
     *     
     */
    public void setImageSettings(ComplexTypeImageSettings value) {
        this.imageSettings = value;
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