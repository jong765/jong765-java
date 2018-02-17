/**
 * LocateItemsRequestMessageItemTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class LocateItemsRequestMessageItemTypeBean  implements java.io.Serializable {
    private java.lang.String item_id;  // attribute

    private java.lang.String qty;  // attribute

    private java.lang.String fulfillment_type;  // attribute

    public LocateItemsRequestMessageItemTypeBean() {
    }

    public LocateItemsRequestMessageItemTypeBean(
           java.lang.String item_id,
           java.lang.String qty,
           java.lang.String fulfillment_type) {
           this.item_id = item_id;
           this.qty = qty;
           this.fulfillment_type = fulfillment_type;
    }


    /**
     * Gets the item_id value for this LocateItemsRequestMessageItemTypeBean.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this LocateItemsRequestMessageItemTypeBean.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the qty value for this LocateItemsRequestMessageItemTypeBean.
     * 
     * @return qty
     */
    public java.lang.String getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this LocateItemsRequestMessageItemTypeBean.
     * 
     * @param qty
     */
    public void setQty(java.lang.String qty) {
        this.qty = qty;
    }


    /**
     * Gets the fulfillment_type value for this LocateItemsRequestMessageItemTypeBean.
     * 
     * @return fulfillment_type
     */
    public java.lang.String getFulfillment_type() {
        return fulfillment_type;
    }


    /**
     * Sets the fulfillment_type value for this LocateItemsRequestMessageItemTypeBean.
     * 
     * @param fulfillment_type
     */
    public void setFulfillment_type(java.lang.String fulfillment_type) {
        this.fulfillment_type = fulfillment_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocateItemsRequestMessageItemTypeBean)) return false;
        LocateItemsRequestMessageItemTypeBean other = (LocateItemsRequestMessageItemTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item_id==null && other.getItem_id()==null) || 
             (this.item_id!=null &&
              this.item_id.equals(other.getItem_id()))) &&
            ((this.qty==null && other.getQty()==null) || 
             (this.qty!=null &&
              this.qty.equals(other.getQty()))) &&
            ((this.fulfillment_type==null && other.getFulfillment_type()==null) || 
             (this.fulfillment_type!=null &&
              this.fulfillment_type.equals(other.getFulfillment_type())));
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
        if (getItem_id() != null) {
            _hashCode += getItem_id().hashCode();
        }
        if (getQty() != null) {
            _hashCode += getQty().hashCode();
        }
        if (getFulfillment_type() != null) {
            _hashCode += getFulfillment_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocateItemsRequestMessageItemTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageItemTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "qty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfillment_type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_type"));
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
