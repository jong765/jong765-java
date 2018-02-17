/**
 * ProductUpdateRequestMessageProductLocationTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class ProductUpdateRequestMessageProductLocationTypeBean  implements java.io.Serializable {
    private java.lang.String available_qty;

    private java.lang.String next_po_qty;

    private java.lang.String next_po_date;

    private java.lang.String location_code;  // attribute

    public ProductUpdateRequestMessageProductLocationTypeBean() {
    }

    public ProductUpdateRequestMessageProductLocationTypeBean(
           java.lang.String available_qty,
           java.lang.String next_po_qty,
           java.lang.String next_po_date,
           java.lang.String location_code) {
           this.available_qty = available_qty;
           this.next_po_qty = next_po_qty;
           this.next_po_date = next_po_date;
           this.location_code = location_code;
    }


    /**
     * Gets the available_qty value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @return available_qty
     */
    public java.lang.String getAvailable_qty() {
        return available_qty;
    }


    /**
     * Sets the available_qty value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @param available_qty
     */
    public void setAvailable_qty(java.lang.String available_qty) {
        this.available_qty = available_qty;
    }


    /**
     * Gets the next_po_qty value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @return next_po_qty
     */
    public java.lang.String getNext_po_qty() {
        return next_po_qty;
    }


    /**
     * Sets the next_po_qty value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @param next_po_qty
     */
    public void setNext_po_qty(java.lang.String next_po_qty) {
        this.next_po_qty = next_po_qty;
    }


    /**
     * Gets the next_po_date value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @return next_po_date
     */
    public java.lang.String getNext_po_date() {
        return next_po_date;
    }


    /**
     * Sets the next_po_date value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @param next_po_date
     */
    public void setNext_po_date(java.lang.String next_po_date) {
        this.next_po_date = next_po_date;
    }


    /**
     * Gets the location_code value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @return location_code
     */
    public java.lang.String getLocation_code() {
        return location_code;
    }


    /**
     * Sets the location_code value for this ProductUpdateRequestMessageProductLocationTypeBean.
     * 
     * @param location_code
     */
    public void setLocation_code(java.lang.String location_code) {
        this.location_code = location_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductUpdateRequestMessageProductLocationTypeBean)) return false;
        ProductUpdateRequestMessageProductLocationTypeBean other = (ProductUpdateRequestMessageProductLocationTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.available_qty==null && other.getAvailable_qty()==null) || 
             (this.available_qty!=null &&
              this.available_qty.equals(other.getAvailable_qty()))) &&
            ((this.next_po_qty==null && other.getNext_po_qty()==null) || 
             (this.next_po_qty!=null &&
              this.next_po_qty.equals(other.getNext_po_qty()))) &&
            ((this.next_po_date==null && other.getNext_po_date()==null) || 
             (this.next_po_date!=null &&
              this.next_po_date.equals(other.getNext_po_date()))) &&
            ((this.location_code==null && other.getLocation_code()==null) || 
             (this.location_code!=null &&
              this.location_code.equals(other.getLocation_code())));
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
        if (getAvailable_qty() != null) {
            _hashCode += getAvailable_qty().hashCode();
        }
        if (getNext_po_qty() != null) {
            _hashCode += getNext_po_qty().hashCode();
        }
        if (getNext_po_date() != null) {
            _hashCode += getNext_po_date().hashCode();
        }
        if (getLocation_code() != null) {
            _hashCode += getLocation_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductUpdateRequestMessageProductLocationTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageProductLocationTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("location_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "location_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_qty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_qty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_po_qty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "next_po_qty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_po_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "next_po_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
