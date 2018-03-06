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
 * <p>Java class for complexType.CreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.CreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="card-type" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="card-number" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.4000" minOccurs="0"/>
 *         &lt;element name="card-holder" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="from-month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="from-year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="issue-number" type="{http://www.demandware.com/xml/impex/order/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
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
@XmlType(name = "complexType.CreditCard", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "cardType",
    "cardNumber",
    "cardHolder",
    "fromMonth",
    "fromYear",
    "expirationMonth",
    "expirationYear",
    "issueNumber",
    "customAttributes"
})
public class ComplexTypeCreditCard {

    @XmlElement(name = "card-type", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String cardType;
    @XmlElement(name = "card-number", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String cardNumber;
    @XmlElement(name = "card-holder", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String cardHolder;
    @XmlElement(name = "from-month", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected Integer fromMonth;
    @XmlElement(name = "from-year", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected Integer fromYear;
    @XmlElement(name = "expiration-month", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected Integer expirationMonth;
    @XmlElement(name = "expiration-year", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected Integer expirationYear;
    @XmlElement(name = "issue-number", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected String issueNumber;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the fromMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromMonth() {
        return fromMonth;
    }

    /**
     * Sets the value of the fromMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromMonth(Integer value) {
        this.fromMonth = value;
    }

    /**
     * Gets the value of the fromYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromYear() {
        return fromYear;
    }

    /**
     * Sets the value of the fromYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromYear(Integer value) {
        this.fromYear = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationMonth(Integer value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationYear(Integer value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
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
