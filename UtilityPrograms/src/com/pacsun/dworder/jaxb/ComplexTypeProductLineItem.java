//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:59:57 PM PDT 
//


package com.pacsun.dworder.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.ProductLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.ProductLineItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.LineItemAmounts">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="product-id" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.NonEmptyString.100"/>
 *         &lt;element name="product-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.Quantity"/>
 *         &lt;element name="tax-rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shipment-id" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.NonEmptyString.256"/>
 *         &lt;element name="option-lineitems" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.OptionLineItems" minOccurs="0"/>
 *         &lt;element name="bundled-product-lineitems" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.BundledProductLineItems" minOccurs="0"/>
 *         &lt;element name="shipping-lineitem" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.ProductShippingLineItem" minOccurs="0"/>
 *         &lt;element name="gift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gift-message" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.4000" minOccurs="0"/>
 *         &lt;element name="external-line-item-status" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="external-line-item-text" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String" minOccurs="0"/>
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
@XmlType(name = "complexType.ProductLineItem", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "position",
    "productId",
    "productName",
    "quantity",
    "taxRate",
    "shipmentId",
    "optionLineitems",
    "bundledProductLineitems",
    "shippingLineitem",
    "gift",
    "giftMessage",
    "externalLineItemStatus",
    "externalLineItemText",
    "customAttributes",
    "priceAdjustments"
})
public class ComplexTypeProductLineItem
    extends ComplexTypeLineItemAmounts
{

    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected BigDecimal position;
    @XmlElement(name = "product-id", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String productId;
    @XmlElement(name = "product-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String productName;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected ComplexTypeQuantity quantity;
    @XmlElement(name = "tax-rate", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected double taxRate;
    @XmlElement(name = "shipment-id", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", required = true)
    protected String shipmentId;
    @XmlElement(name = "option-lineitems", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected ComplexTypeOptionLineItems optionLineitems;
    @XmlElement(name = "bundled-product-lineitems", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected ComplexTypeBundledProductLineItems bundledProductLineitems;
    @XmlElement(name = "shipping-lineitem", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected ComplexTypeProductShippingLineItem shippingLineitem;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected Boolean gift;
    @XmlElement(name = "gift-message", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String giftMessage;
    @XmlElement(name = "external-line-item-status", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String externalLineItemStatus;
    @XmlElement(name = "external-line-item-text", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String externalLineItemText;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;
    @XmlElement(name = "price-adjustments", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected ComplexTypePriceAdjustments priceAdjustments;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPosition(BigDecimal value) {
        this.position = value;
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
     * Gets the value of the taxRate property.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the shipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentId(String value) {
        this.shipmentId = value;
    }

    /**
     * Gets the value of the optionLineitems property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeOptionLineItems }
     *     
     */
    public ComplexTypeOptionLineItems getOptionLineitems() {
        return optionLineitems;
    }

    /**
     * Sets the value of the optionLineitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeOptionLineItems }
     *     
     */
    public void setOptionLineitems(ComplexTypeOptionLineItems value) {
        this.optionLineitems = value;
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
     * Gets the value of the shippingLineitem property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeProductShippingLineItem }
     *     
     */
    public ComplexTypeProductShippingLineItem getShippingLineitem() {
        return shippingLineitem;
    }

    /**
     * Sets the value of the shippingLineitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeProductShippingLineItem }
     *     
     */
    public void setShippingLineitem(ComplexTypeProductShippingLineItem value) {
        this.shippingLineitem = value;
    }

    /**
     * Gets the value of the gift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGift() {
        return gift;
    }

    /**
     * Sets the value of the gift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGift(Boolean value) {
        this.gift = value;
    }

    /**
     * Gets the value of the giftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Sets the value of the giftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessage(String value) {
        this.giftMessage = value;
    }

    /**
     * Gets the value of the externalLineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLineItemStatus() {
        return externalLineItemStatus;
    }

    /**
     * Sets the value of the externalLineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLineItemStatus(String value) {
        this.externalLineItemStatus = value;
    }

    /**
     * Gets the value of the externalLineItemText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLineItemText() {
        return externalLineItemText;
    }

    /**
     * Sets the value of the externalLineItemText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLineItemText(String value) {
        this.externalLineItemText = value;
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
