/**
 * AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean[][] items;

    private java.lang.String type;  // attribute

    private java.lang.String response_cd;  // attribute

    private java.lang.String response_description;  // attribute

    public AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean() {
    }

    public AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean(
           com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean[][] items,
           java.lang.String type,
           java.lang.String response_cd,
           java.lang.String response_description) {
           this.items = items;
           this.type = type;
           this.response_cd = response_cd;
           this.response_description = response_description;
    }


    /**
     * Gets the items value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean[][] getItems() {
        return items;
    }


    /**
     * Sets the items value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean[][] items) {
        this.items = items;
    }


    /**
     * Gets the type value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the response_cd value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @return response_cd
     */
    public java.lang.String getResponse_cd() {
        return response_cd;
    }


    /**
     * Sets the response_cd value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @param response_cd
     */
    public void setResponse_cd(java.lang.String response_cd) {
        this.response_cd = response_cd;
    }


    /**
     * Gets the response_description value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @return response_description
     */
    public java.lang.String getResponse_description() {
        return response_description;
    }


    /**
     * Sets the response_description value for this AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.
     * 
     * @param response_description
     */
    public void setResponse_description(java.lang.String response_description) {
        this.response_description = response_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean)) return false;
        AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean other = (AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.response_cd==null && other.getResponse_cd()==null) || 
             (this.response_cd!=null &&
              this.response_cd.equals(other.getResponse_cd()))) &&
            ((this.response_description==null && other.getResponse_description()==null) || 
             (this.response_description!=null &&
              this.response_description.equals(other.getResponse_description())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getResponse_cd() != null) {
            _hashCode += getResponse_cd().hashCode();
        }
        if (getResponse_description() != null) {
            _hashCode += getResponse_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("response_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "response_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("response_description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "response_description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageItemTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
