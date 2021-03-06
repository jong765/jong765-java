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
 * <p>Java class for complexType.OptionLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.OptionLineItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.LineItemAmounts">
 *       &lt;sequence>
 *         &lt;element name="option-id" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.NonEmptyString.256"/>
 *         &lt;element name="value-id" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.NonEmptyString.256"/>
 *         &lt;element name="product-id" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.NonEmptyString.100"/>
 *         &lt;element name="custom-attributes" type="{http://www.demandware.com/xml/impex/order/2006-10-31}sharedType.CustomAttributes" minOccurs="0"/>
 *         &lt;element name="price-adjustments" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.PriceAdjustments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.OptionLineItem", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "optionId",
    "valueId",
    "productId",
    "customAttributes",
    "priceAdjustments"
})
public class ComplexTypeOptionLineItem
    extends ComplexTypeLineItemAmounts
{

    @XmlElement(name = "option-id", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String optionId;
    @XmlElement(name = "value-id", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String valueId;
    @XmlElement(name = "product-id", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String productId;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;
    @XmlElement(name = "price-adjustments", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected ComplexTypePriceAdjustments priceAdjustments;

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

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueId(String value) {
        this.valueId = value;
    }

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

    /**
     * Gets the value of the priceAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypePriceAdjustments }
     *     
     */
    public ComplexTypePriceAdjustments getPriceAdjustments() {
        return priceAdjustments;
    }

    /**
     * Sets the value of the priceAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypePriceAdjustments }
     *     
     */
    public void setPriceAdjustments(ComplexTypePriceAdjustments value) {
        this.priceAdjustments = value;
    }

}
