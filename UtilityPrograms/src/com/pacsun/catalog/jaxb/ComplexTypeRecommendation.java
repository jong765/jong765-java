//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.02 at 10:11:34 AM PST 
//


package com.pacsun.catalog.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.Recommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.Recommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display-name" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}sharedType.LocalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="short-description" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}sharedType.LocalizedText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="long-description" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}sharedType.LocalizedText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="callout-message" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}sharedType.LocalizedText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.Generic.String.256" minOccurs="0"/>
 *         &lt;element name="custom-attributes" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}sharedType.CustomAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source-id" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.Generic.NonEmptyString.256" />
 *       &lt;attribute name="source-type" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.RecommendationSourceType" />
 *       &lt;attribute name="target-id" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.Generic.NonEmptyString.256" />
 *       &lt;attribute name="type" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.RecommendationType" />
 *       &lt;attribute name="mode" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}simpleType.ImportMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.Recommendation", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", propOrder = {
    "displayName",
    "shortDescription",
    "longDescription",
    "calloutMessage",
    "image",
    "customAttributes"
})
public class ComplexTypeRecommendation {

    @XmlElement(name = "display-name", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<SharedTypeLocalizedString> displayName;
    @XmlElement(name = "short-description", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<SharedTypeLocalizedText> shortDescription;
    @XmlElement(name = "long-description", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<SharedTypeLocalizedText> longDescription;
    @XmlElement(name = "callout-message", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<SharedTypeLocalizedText> calloutMessage;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected String image;
    @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected SharedTypeCustomAttributes customAttributes;
    @XmlAttribute(name = "source-id")
    protected String sourceId;
    @XmlAttribute(name = "source-type")
    protected SimpleTypeRecommendationSourceType sourceType;
    @XmlAttribute(name = "target-id")
    protected String targetId;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "mode")
    protected SimpleTypeImportMode mode;

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedTypeLocalizedString }
     * 
     * 
     */
    public List<SharedTypeLocalizedString> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<SharedTypeLocalizedString>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedTypeLocalizedText }
     * 
     * 
     */
    public List<SharedTypeLocalizedText> getShortDescription() {
        if (shortDescription == null) {
            shortDescription = new ArrayList<SharedTypeLocalizedText>();
        }
        return this.shortDescription;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedTypeLocalizedText }
     * 
     * 
     */
    public List<SharedTypeLocalizedText> getLongDescription() {
        if (longDescription == null) {
            longDescription = new ArrayList<SharedTypeLocalizedText>();
        }
        return this.longDescription;
    }

    /**
     * Gets the value of the calloutMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calloutMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalloutMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedTypeLocalizedText }
     * 
     * 
     */
    public List<SharedTypeLocalizedText> getCalloutMessage() {
        if (calloutMessage == null) {
            calloutMessage = new ArrayList<SharedTypeLocalizedText>();
        }
        return this.calloutMessage;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
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
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTypeRecommendationSourceType }
     *     
     */
    public SimpleTypeRecommendationSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTypeRecommendationSourceType }
     *     
     */
    public void setSourceType(SimpleTypeRecommendationSourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the targetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * Sets the value of the targetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetId(String value) {
        this.targetId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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