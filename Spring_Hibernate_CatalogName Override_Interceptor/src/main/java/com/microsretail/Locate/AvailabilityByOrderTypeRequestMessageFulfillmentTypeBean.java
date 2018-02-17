/**
 * AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean  implements java.io.Serializable {
    private java.lang.String type;  // attribute

    private java.lang.String range_distance;  // attribute

    private java.lang.String range_unit;  // attribute

    public AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean() {
    }

    public AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean(
           java.lang.String type,
           java.lang.String range_distance,
           java.lang.String range_unit) {
           this.type = type;
           this.range_distance = range_distance;
           this.range_unit = range_unit;
    }


    /**
     * Gets the type value for this AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the range_distance value for this AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.
     * 
     * @return range_distance
     */
    public java.lang.String getRange_distance() {
        return range_distance;
    }


    /**
     * Sets the range_distance value for this AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.
     * 
     * @param range_distance
     */
    public void setRange_distance(java.lang.String range_distance) {
        this.range_distance = range_distance;
    }


    /**
     * Gets the range_unit value for this AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.
     * 
     * @return range_unit
     */
    public java.lang.String getRange_unit() {
        return range_unit;
    }


    /**
     * Sets the range_unit value for this AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.
     * 
     * @param range_unit
     */
    public void setRange_unit(java.lang.String range_unit) {
        this.range_unit = range_unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean)) return false;
        AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean other = (AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.range_distance==null && other.getRange_distance()==null) || 
             (this.range_distance!=null &&
              this.range_distance.equals(other.getRange_distance()))) &&
            ((this.range_unit==null && other.getRange_unit()==null) || 
             (this.range_unit!=null &&
              this.range_unit.equals(other.getRange_unit())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRange_distance() != null) {
            _hashCode += getRange_distance().hashCode();
        }
        if (getRange_unit() != null) {
            _hashCode += getRange_unit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("range_distance");
        attrField.setXmlName(new javax.xml.namespace.QName("", "range_distance"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("range_unit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "range_unit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
