//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.23 at 05:18:06 PM PDT 
//


package com.pacsun.dw.store.inventory.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="default-instock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.Generic.String.4000" minOccurs="0"/>
 *         &lt;element name="use-bundle-inventory-only" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="custom-attributes" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}sharedType.CustomAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="list-id" use="required" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.Generic.NonEmptyString.256" />
 *       &lt;attribute name="mode" type="{http://www.demandware.com/xml/impex/inventory/2007-05-31}simpleType.ImportMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.Header", propOrder = {
    "defaultInstock",
    "description",
    "useBundleInventoryOnly",
    "customAttributes"
})
public class ComplexTypeHeader {

    @XmlElement(name = "default-instock")
    protected boolean defaultInstock;
    protected String description;
    @XmlElement(name = "use-bundle-inventory-only")
    protected Boolean useBundleInventoryOnly;
    @XmlElement(name = "custom-attributes")
    protected SharedTypeCustomAttributes customAttributes;
    @XmlAttribute(name = "list-id", required = true)
    protected String listId;
    @XmlAttribute(name = "mode")
    protected SimpleTypeImportMode mode;

    /**
     * Gets the value of the defaultInstock property.
     * 
     */
    public boolean isDefaultInstock() {
        return defaultInstock;
    }

    /**
     * Sets the value of the defaultInstock property.
     * 
     */
    public void setDefaultInstock(boolean value) {
        this.defaultInstock = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the useBundleInventoryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBundleInventoryOnly() {
        return useBundleInventoryOnly;
    }

    /**
     * Sets the value of the useBundleInventoryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBundleInventoryOnly(Boolean value) {
        this.useBundleInventoryOnly = value;
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
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListId(String value) {
        this.listId = value;
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
