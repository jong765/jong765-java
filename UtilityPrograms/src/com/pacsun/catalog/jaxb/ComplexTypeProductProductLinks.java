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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.Product.ProductLinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.Product.ProductLinks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product-link" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}complexType.Product.ProductLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.Product.ProductLinks", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", propOrder = {
    "productLink"
})
public class ComplexTypeProductProductLinks {

    @XmlElement(name = "product-link", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<ComplexTypeProductProductLink> productLink;

    /**
     * Gets the value of the productLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexTypeProductProductLink }
     * 
     * 
     */
    public List<ComplexTypeProductProductLink> getProductLink() {
        if (productLink == null) {
            productLink = new ArrayList<ComplexTypeProductProductLink>();
        }
        return this.productLink;
    }

}
