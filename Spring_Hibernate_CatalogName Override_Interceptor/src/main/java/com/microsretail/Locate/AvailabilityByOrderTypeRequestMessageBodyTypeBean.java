/**
 * AvailabilityByOrderTypeRequestMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderTypeRequestMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.StoreLocationTypeBean requesting_location;

    private com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean[] fulfillment_types;

    private com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageItemTypeBean[] items;

    private com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageAddressTypeBean address;

    public AvailabilityByOrderTypeRequestMessageBodyTypeBean() {
    }

    public AvailabilityByOrderTypeRequestMessageBodyTypeBean(
           com.microsretail.Locate.StoreLocationTypeBean requesting_location,
           com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean[] fulfillment_types,
           com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageItemTypeBean[] items,
           com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageAddressTypeBean address) {
           this.requesting_location = requesting_location;
           this.fulfillment_types = fulfillment_types;
           this.items = items;
           this.address = address;
    }


    /**
     * Gets the requesting_location value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @return requesting_location
     */
    public com.microsretail.Locate.StoreLocationTypeBean getRequesting_location() {
        return requesting_location;
    }


    /**
     * Sets the requesting_location value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @param requesting_location
     */
    public void setRequesting_location(com.microsretail.Locate.StoreLocationTypeBean requesting_location) {
        this.requesting_location = requesting_location;
    }


    /**
     * Gets the fulfillment_types value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @return fulfillment_types
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean[] getFulfillment_types() {
        return fulfillment_types;
    }


    /**
     * Sets the fulfillment_types value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @param fulfillment_types
     */
    public void setFulfillment_types(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean[] fulfillment_types) {
        this.fulfillment_types = fulfillment_types;
    }


    /**
     * Gets the items value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageItemTypeBean[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageItemTypeBean[] items) {
        this.items = items;
    }


    /**
     * Gets the address value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @return address
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageAddressTypeBean getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AvailabilityByOrderTypeRequestMessageBodyTypeBean.
     * 
     * @param address
     */
    public void setAddress(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageAddressTypeBean address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderTypeRequestMessageBodyTypeBean)) return false;
        AvailabilityByOrderTypeRequestMessageBodyTypeBean other = (AvailabilityByOrderTypeRequestMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requesting_location==null && other.getRequesting_location()==null) || 
             (this.requesting_location!=null &&
              this.requesting_location.equals(other.getRequesting_location()))) &&
            ((this.fulfillment_types==null && other.getFulfillment_types()==null) || 
             (this.fulfillment_types!=null &&
              java.util.Arrays.equals(this.fulfillment_types, other.getFulfillment_types()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getRequesting_location() != null) {
            _hashCode += getRequesting_location().hashCode();
        }
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderTypeRequestMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesting_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requesting_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StoreLocationTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillment_types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fulfillment_type"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageItemTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageAddressTypeBean"));
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
