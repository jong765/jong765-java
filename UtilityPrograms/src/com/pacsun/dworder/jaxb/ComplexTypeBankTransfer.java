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
 * <p>Java class for complexType.BankTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.BankTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account-number" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="account-holder" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="routing-number" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="drivers-license" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="drivers-license-state-code" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
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
@XmlType(name = "complexType.BankTransfer", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "accountNumber",
    "accountHolder",
    "routingNumber",
    "driversLicense",
    "driversLicenseStateCode",
    "customAttributes"
})
public class ComplexTypeBankTransfer {

    @XmlElement(name = "account-number", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String accountNumber;
    @XmlElement(name = "account-holder", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String accountHolder;
    @XmlElement(name = "routing-number", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String routingNumber;
    @XmlElement(name = "drivers-license", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String driversLicense;
    @XmlElement(name = "drivers-license-state-code", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String driversLicenseStateCode;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the value of the accountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolder(String value) {
        this.accountHolder = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicense(String value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the driversLicenseStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseStateCode() {
        return driversLicenseStateCode;
    }

    /**
     * Sets the value of the driversLicenseStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseStateCode(String value) {
        this.driversLicenseStateCode = value;
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