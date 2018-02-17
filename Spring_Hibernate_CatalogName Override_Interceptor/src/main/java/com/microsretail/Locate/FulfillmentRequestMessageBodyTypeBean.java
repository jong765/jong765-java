/**
 * FulfillmentRequestMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class FulfillmentRequestMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.FulfillmentRequestMessageStoreLocationTypeBean store_location;

    public FulfillmentRequestMessageBodyTypeBean() {
    }

    public FulfillmentRequestMessageBodyTypeBean(
           com.microsretail.Locate.FulfillmentRequestMessageStoreLocationTypeBean store_location) {
           this.store_location = store_location;
    }


    /**
     * Gets the store_location value for this FulfillmentRequestMessageBodyTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.FulfillmentRequestMessageStoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this FulfillmentRequestMessageBodyTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.FulfillmentRequestMessageStoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentRequestMessageBodyTypeBean)) return false;
        FulfillmentRequestMessageBodyTypeBean other = (FulfillmentRequestMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.store_location==null && other.getStore_location()==null) || 
             (this.store_location!=null &&
              this.store_location.equals(other.getStore_location())));
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
        if (getStore_location() != null) {
            _hashCode += getStore_location().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentRequestMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageStoreLocationTypeBean"));
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
