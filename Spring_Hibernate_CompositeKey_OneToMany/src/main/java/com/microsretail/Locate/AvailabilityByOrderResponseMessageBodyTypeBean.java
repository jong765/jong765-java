/**
 * AvailabilityByOrderResponseMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderResponseMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean[] fulfillment_types;

    private com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationTypeBean[] locations;

    public AvailabilityByOrderResponseMessageBodyTypeBean() {
    }

    public AvailabilityByOrderResponseMessageBodyTypeBean(
           com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean[] fulfillment_types,
           com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationTypeBean[] locations) {
           this.fulfillment_types = fulfillment_types;
           this.locations = locations;
    }


    /**
     * Gets the fulfillment_types value for this AvailabilityByOrderResponseMessageBodyTypeBean.
     * 
     * @return fulfillment_types
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean[] getFulfillment_types() {
        return fulfillment_types;
    }


    /**
     * Sets the fulfillment_types value for this AvailabilityByOrderResponseMessageBodyTypeBean.
     * 
     * @param fulfillment_types
     */
    public void setFulfillment_types(com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean[] fulfillment_types) {
        this.fulfillment_types = fulfillment_types;
    }


    /**
     * Gets the locations value for this AvailabilityByOrderResponseMessageBodyTypeBean.
     * 
     * @return locations
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationTypeBean[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this AvailabilityByOrderResponseMessageBodyTypeBean.
     * 
     * @param locations
     */
    public void setLocations(com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationTypeBean[] locations) {
        this.locations = locations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderResponseMessageBodyTypeBean)) return false;
        AvailabilityByOrderResponseMessageBodyTypeBean other = (AvailabilityByOrderResponseMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fulfillment_types==null && other.getFulfillment_types()==null) || 
             (this.fulfillment_types!=null &&
              java.util.Arrays.equals(this.fulfillment_types, other.getFulfillment_types()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations())));
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
        if (getFulfillment_types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillment_types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillment_types(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderResponseMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderResponseMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillment_types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fulfillment_type"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "location"));
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
