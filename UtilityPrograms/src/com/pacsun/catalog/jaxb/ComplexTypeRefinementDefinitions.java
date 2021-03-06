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
 * <p>Java class for complexType.RefinementDefinitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexType.RefinementDefinitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refinement-definition" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}complexType.RefinementDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="blocked-refinement-definition" type="{http://www.demandware.com/xml/impex/catalog/2006-10-31}complexType.BlockedRefinementDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType.RefinementDefinitions", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", propOrder = {
    "refinementDefinition",
    "blockedRefinementDefinition"
})
public class ComplexTypeRefinementDefinitions {

    @XmlElement(name = "refinement-definition", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<ComplexTypeRefinementDefinition> refinementDefinition;
    @XmlElement(name = "blocked-refinement-definition", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<ComplexTypeBlockedRefinementDefinition> blockedRefinementDefinition;

    /**
     * Gets the value of the refinementDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refinementDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefinementDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexTypeRefinementDefinition }
     * 
     * 
     */
    public List<ComplexTypeRefinementDefinition> getRefinementDefinition() {
        if (refinementDefinition == null) {
            refinementDefinition = new ArrayList<ComplexTypeRefinementDefinition>();
        }
        return this.refinementDefinition;
    }

    /**
     * Gets the value of the blockedRefinementDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockedRefinementDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockedRefinementDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexTypeBlockedRefinementDefinition }
     * 
     * 
     */
    public List<ComplexTypeBlockedRefinementDefinition> getBlockedRefinementDefinition() {
        if (blockedRefinementDefinition == null) {
            blockedRefinementDefinition = new ArrayList<ComplexTypeBlockedRefinementDefinition>();
        }
        return this.blockedRefinementDefinition;
    }

}
