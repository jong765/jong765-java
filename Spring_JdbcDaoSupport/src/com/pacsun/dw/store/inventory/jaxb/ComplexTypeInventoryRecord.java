//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.23 at 05:18:06 PM PDT 
//


package com.pacsun.dw.store.inventory.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for complexType.InventoryRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.InventoryRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocation" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.Allocation" minOccurs="0"/>
 *         &lt;element name="allocation-timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="perpetual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preorder-backorder-handling" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.InventoryRecord.PreorderBackorderHandling" minOccurs="0"/>
 *         &lt;element name="preorder-backorder-allocation" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.Allocation" minOccurs="0"/>
 *         &lt;element name="in-stock-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="custom-attributes" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}sharedType.CustomAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="product-id" use="required" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.Generic.NonEmptyString.100" />
 *       &lt;attribute name="mode" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.ImportMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.InventoryRecord", propOrder = {
    "allocation",
    "allocationTimestamp",
    "perpetual",
    "preorderBackorderHandling",
    "preorderBackorderAllocation",
    "inStockDate",
    "customAttributes"
})
public class ComplexTypeInventoryRecord {

    protected BigDecimal allocation;
    @XmlElement(name = "allocation-timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar allocationTimestamp;
    protected Boolean perpetual;
    @XmlElement(name = "preorder-backorder-handling")
    protected SimpleTypeInventoryRecordPreorderBackorderHandling preorderBackorderHandling;
    @XmlElement(name = "preorder-backorder-allocation")
    protected BigDecimal preorderBackorderAllocation;
    @XmlElement(name = "in-stock-date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inStockDate;
    @XmlElement(name = "custom-attributes")
    protected SharedTypeCustomAttributes customAttributes;
    @XmlAttribute(name = "product-id", required = true)
    protected String productId;
    @XmlAttribute(name = "mode")
    protected SimpleTypeImportMode mode;

    /**
     * Gets the value of the allocation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocation(BigDecimal value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the allocationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllocationTimestamp() {
        return allocationTimestamp;
    }

    /**
     * Sets the value of the allocationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllocationTimestamp(XMLGregorianCalendar value) {
        this.allocationTimestamp = value;
    }

    /**
     * Gets the value of the perpetual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerpetual() {
        return perpetual;
    }

    /**
     * Sets the value of the perpetual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerpetual(Boolean value) {
        this.perpetual = value;
    }

    /**
     * Gets the value of the preorderBackorderHandling property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTypeInventoryRecordPreorderBackorderHandling }
     *     
     */
    public SimpleTypeInventoryRecordPreorderBackorderHandling getPreorderBackorderHandling() {
        return preorderBackorderHandling;
    }

    /**
     * Sets the value of the preorderBackorderHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTypeInventoryRecordPreorderBackorderHandling }
     *     
     */
    public void setPreorderBackorderHandling(SimpleTypeInventoryRecordPreorderBackorderHandling value) {
        this.preorderBackorderHandling = value;
    }

    /**
     * Gets the value of the preorderBackorderAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreorderBackorderAllocation() {
        return preorderBackorderAllocation;
    }

    /**
     * Sets the value of the preorderBackorderAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreorderBackorderAllocation(BigDecimal value) {
        this.preorderBackorderAllocation = value;
    }

    /**
     * Gets the value of the inStockDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInStockDate() {
        return inStockDate;
    }

    /**
     * Sets the value of the inStockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInStockDate(XMLGregorianCalendar value) {
        this.inStockDate = value;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTypeImportMode }
     *     
     */
    public SimpleTypeImportMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTypeImportMode }
     *     
     */
    public void setMode(SimpleTypeImportMode value) {
        this.mode = value;
    }

}
