//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.02 at 10:11:34 AM PST 
//


package com.pacsun.catalog.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleType.Bucket.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="simpleType.Bucket.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="values"/>
 *     &lt;enumeration value="thresholds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "simpleType.Bucket.Type", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
@XmlEnum
public enum SimpleTypeBucketType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("values")
    VALUES("values"),
    @XmlEnumValue("thresholds")
    THRESHOLDS("thresholds");
    private final String value;

    SimpleTypeBucketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleTypeBucketType fromValue(String v) {
        for (SimpleTypeBucketType c: SimpleTypeBucketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}