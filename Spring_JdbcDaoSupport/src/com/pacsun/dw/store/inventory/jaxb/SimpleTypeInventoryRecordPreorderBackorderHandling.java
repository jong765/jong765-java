//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.23 at 05:18:06 PM PDT 
//


package com.pacsun.dw.store.inventory.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleType.InventoryRecord.PreorderBackorderHandling.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="simpleType.InventoryRecord.PreorderBackorderHandling">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="preorder"/>
 *     &lt;enumeration value="backorder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "simpleType.InventoryRecord.PreorderBackorderHandling")
@XmlEnum
public enum SimpleTypeInventoryRecordPreorderBackorderHandling {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("preorder")
    PREORDER("preorder"),
    @XmlEnumValue("backorder")
    BACKORDER("backorder");
    private final String value;

    SimpleTypeInventoryRecordPreorderBackorderHandling(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleTypeInventoryRecordPreorderBackorderHandling fromValue(String v) {
        for (SimpleTypeInventoryRecordPreorderBackorderHandling c: SimpleTypeInventoryRecordPreorderBackorderHandling.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
