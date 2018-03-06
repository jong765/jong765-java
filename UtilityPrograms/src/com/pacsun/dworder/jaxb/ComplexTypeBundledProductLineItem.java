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
 * <p>Java class for complexType.BundledProductLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.BundledProductLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product-id" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.NonEmptyString.100"/>
 *         &lt;element name="product-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256"/>
 *         &lt;element name="quantity" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.Quantity"/>
 *         &lt;element name="bundled-product-lineitems" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.BundledProductLineItems" minOccurs="0"/>
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
@XmlType(name = "complexType.BundledProductLineItem", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "productId",
    "productName",
    "quantity",
    "bundledProductLineitems",
    "customAttributes"
})
public class ComplexTypeBundledProductLineItem {

    @XmlElement(name = "product-id", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String productId;
    @XmlElement(name = "product-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String productName;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected ComplexTypeQuantity quantity;
    @XmlElement(name = "bundled-product-lineitems", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected ComplexTypeBundledProductLineItems bundledProductLineitems;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeQuantity }
     *     
     */
    public ComplexTypeQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeQuantity }
     *     
     */
    public void setQuantity(ComplexTypeQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the bundledProductLineitems property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeBundledProductLineItems }
     *     
     */
    public ComplexTypeBundledProductLineItems getBundledProductLineitems() {
        return bundledProductLineitems;
    }

    /**
     * Sets the value of the bundledProductLineitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeBundledProductLineItems }
     *     
     */
    public void setBundledProductLineitems(ComplexTypeBundledProductLineItems value) {
        this.bundledProductLineitems = value;
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
