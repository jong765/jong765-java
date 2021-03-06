//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:59:57 PM PDT 
//


package com.pacsun.dworder.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleType.ProductShippingCostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="simpleType.ProductShippingCostType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fixed-price"/>
 *     &lt;enumeration value="surcharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "simpleType.ProductShippingCostType", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
@XmlEnum
public enum SimpleTypeProductShippingCostType {

    @XmlEnumValue("fixed-price")
    FIXED_PRICE("fixed-price"),
    @XmlEnumValue("surcharge")
    SURCHARGE("surcharge");
    private final String value;

    SimpleTypeProductShippingCostType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleTypeProductShippingCostType fromValue(String v) {
        for (SimpleTypeProductShippingCostType c: SimpleTypeProductShippingCostType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
