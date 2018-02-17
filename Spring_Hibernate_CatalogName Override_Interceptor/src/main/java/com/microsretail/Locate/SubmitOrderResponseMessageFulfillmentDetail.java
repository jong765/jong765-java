/**
 * SubmitOrderResponseMessageFulfillmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SubmitOrderResponseMessageFulfillmentDetail  implements java.io.Serializable {
    private int fulfillment_qty;  // attribute

    private java.lang.String fulfillment_location_cd;  // attribute

    private java.lang.String fulfillment_system_cd;  // attribute

    private java.lang.String item_id;  // attribute

    private int requesting_system_line_no;  // attribute

    private int line_no;  // attribute

    public SubmitOrderResponseMessageFulfillmentDetail() {
    }

    public SubmitOrderResponseMessageFulfillmentDetail(
           int fulfillment_qty,
           java.lang.String fulfillment_location_cd,
           java.lang.String fulfillment_system_cd,
           java.lang.String item_id,
           int requesting_system_line_no,
           int line_no) {
           this.fulfillment_qty = fulfillment_qty;
           this.fulfillment_location_cd = fulfillment_location_cd;
           this.fulfillment_system_cd = fulfillment_system_cd;
           this.item_id = item_id;
           this.requesting_system_line_no = requesting_system_line_no;
           this.line_no = line_no;
    }


    /**
     * Gets the fulfillment_qty value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @return fulfillment_qty
     */
    public int getFulfillment_qty() {
        return fulfillment_qty;
    }


    /**
     * Sets the fulfillment_qty value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @param fulfillment_qty
     */
    public void setFulfillment_qty(int fulfillment_qty) {
        this.fulfillment_qty = fulfillment_qty;
    }


    /**
     * Gets the fulfillment_location_cd value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @return fulfillment_location_cd
     */
    public java.lang.String getFulfillment_location_cd() {
        return fulfillment_location_cd;
    }


    /**
     * Sets the fulfillment_location_cd value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @param fulfillment_location_cd
     */
    public void setFulfillment_location_cd(java.lang.String fulfillment_location_cd) {
        this.fulfillment_location_cd = fulfillment_location_cd;
    }


    /**
     * Gets the fulfillment_system_cd value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @return fulfillment_system_cd
     */
    public java.lang.String getFulfillment_system_cd() {
        return fulfillment_system_cd;
    }


    /**
     * Sets the fulfillment_system_cd value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @param fulfillment_system_cd
     */
    public void setFulfillment_system_cd(java.lang.String fulfillment_system_cd) {
        this.fulfillment_system_cd = fulfillment_system_cd;
    }


    /**
     * Gets the item_id value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the requesting_system_line_no value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @return requesting_system_line_no
     */
    public int getRequesting_system_line_no() {
        return requesting_system_line_no;
    }


    /**
     * Sets the requesting_system_line_no value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @param requesting_system_line_no
     */
    public void setRequesting_system_line_no(int requesting_system_line_no) {
        this.requesting_system_line_no = requesting_system_line_no;
    }


    /**
     * Gets the line_no value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @return line_no
     */
    public int getLine_no() {
        return line_no;
    }


    /**
     * Sets the line_no value for this SubmitOrderResponseMessageFulfillmentDetail.
     * 
     * @param line_no
     */
    public void setLine_no(int line_no) {
        this.line_no = line_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitOrderResponseMessageFulfillmentDetail)) return false;
        SubmitOrderResponseMessageFulfillmentDetail other = (SubmitOrderResponseMessageFulfillmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fulfillment_qty == other.getFulfillment_qty() &&
            ((this.fulfillment_location_cd==null && other.getFulfillment_location_cd()==null) || 
             (this.fulfillment_location_cd!=null &&
              this.fulfillment_location_cd.equals(other.getFulfillment_location_cd()))) &&
            ((this.fulfillment_system_cd==null && other.getFulfillment_system_cd()==null) || 
             (this.fulfillment_system_cd!=null &&
              this.fulfillment_system_cd.equals(other.getFulfillment_system_cd()))) &&
            ((this.item_id==null && other.getItem_id()==null) || 
             (this.item_id!=null &&
              this.item_id.equals(other.getItem_id()))) &&
            this.requesting_system_line_no == other.getRequesting_system_line_no() &&
            this.line_no == other.getLine_no();
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
        _hashCode += getFulfillment_qty();
        if (getFulfillment_location_cd() != null) {
            _hashCode += getFulfillment_location_cd().hashCode();
        }
        if (getFulfillment_system_cd() != null) {
            _hashCode += getFulfillment_system_cd().hashCode();
        }
        if (getItem_id() != null) {
            _hashCode += getItem_id().hashCode();
        }
        _hashCode += getRequesting_system_line_no();
        _hashCode += getLine_no();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitOrderResponseMessageFulfillmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageFulfillmentDetail"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfillment_qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_qty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfillment_location_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_location_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfillment_system_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_system_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requesting_system_line_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "requesting_system_line_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
