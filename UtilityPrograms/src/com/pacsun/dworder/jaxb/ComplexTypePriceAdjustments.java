//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:59:57 PM PDT 
//


package com.pacsun.dworder.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexType.PriceAdjustments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.PriceAdjustments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="price-adjustment" type="{http://www.demandware.com/xml/impex/order/2006-10-31}complexType.PriceAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.PriceAdjustments", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31", propOrder = {
    "priceAdjustment"
})
public class ComplexTypePriceAdjustments {

    @XmlElement(name = "price-adjustment", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
    protected List<ComplexTypePriceAdjustment> priceAdjustment;

    /**
     * Gets the value of the priceAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexTypePriceAdjustment }
     * 
     * 
     */
    public List<ComplexTypePriceAdjustment> getPriceAdjustment() {
        if (priceAdjustment == null) {
            priceAdjustment = new ArrayList<ComplexTypePriceAdjustment>();
        }
        return this.priceAdjustment;
    }

}
