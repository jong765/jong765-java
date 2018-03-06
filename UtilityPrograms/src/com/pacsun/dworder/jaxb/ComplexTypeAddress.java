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
 * <p>Java class for complexType.Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salutation" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="first-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="second-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="last-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="company-name" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="job-title" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="suite" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.32" minOccurs="0"/>
 *         &lt;element name="postbox" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="postal-code" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="state-code" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="country-code" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.CountryCode" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.PhoneNumber" minOccurs="0"/>
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
@XmlType(name = "complexType.Address", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "salutation",
    "title",
    "firstName",
    "secondName",
    "lastName",
    "suffix",
    "companyName",
    "jobTitle",
    "address1",
    "address2",
    "suite",
    "postbox",
    "city",
    "postalCode",
    "stateCode",
    "countryCode",
    "phone",
    "customAttributes"
})
public class ComplexTypeAddress {

    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String salutation;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String title;
    @XmlElement(name = "first-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String firstName;
    @XmlElement(name = "second-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String secondName;
    @XmlElement(name = "last-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String lastName;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String suffix;
    @XmlElement(name = "company-name", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String companyName;
    @XmlElement(name = "job-title", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String jobTitle;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String address1;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String address2;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String suite;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String postbox;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String city;
    @XmlElement(name = "postal-code", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String postalCode;
    @XmlElement(name = "state-code", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String stateCode;
    @XmlElement(name = "country-code", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String countryCode;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String phone;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the suite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuite() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuite(String value) {
        this.suite = value;
    }

    /**
     * Gets the value of the postbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostbox() {
        return postbox;
    }

    /**
     * Sets the value of the postbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostbox(String value) {
        this.postbox = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
