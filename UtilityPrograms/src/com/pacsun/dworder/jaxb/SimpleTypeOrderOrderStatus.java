//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:59:57 PM PDT 
//


package com.pacsun.dworder.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleType.Order.OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="simpleType.Order.OrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="REPLACED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "simpleType.Order.OrderStatus", namespace = "http://www.demandware.com/xml/impex/order/2006-10-31")
@XmlEnum
public enum SimpleTypeOrderOrderStatus {

    NEW,
    OPEN,
    CANCELLED,
    COMPLETED,
    REPLACED;

    public String value() {
        return name();
    }

    public static SimpleTypeOrderOrderStatus fromValue(String v) {
        return valueOf(v);
    }

}
