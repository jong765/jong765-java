/**
 * AvailabilityByOrderTypeRequestMessageTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderTypeRequestMessageTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageHeaderTypeBean message_header;

    private com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageBodyTypeBean message_body;

    public AvailabilityByOrderTypeRequestMessageTypeBean() {
    }

    public AvailabilityByOrderTypeRequestMessageTypeBean(
           com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageHeaderTypeBean message_header,
           com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageBodyTypeBean message_body) {
           this.message_header = message_header;
           this.message_body = message_body;
    }


    /**
     * Gets the message_header value for this AvailabilityByOrderTypeRequestMessageTypeBean.
     * 
     * @return message_header
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageHeaderTypeBean getMessage_header() {
        return message_header;
    }


    /**
     * Sets the message_header value for this AvailabilityByOrderTypeRequestMessageTypeBean.
     * 
     * @param message_header
     */
    public void setMessage_header(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageHeaderTypeBean message_header) {
        this.message_header = message_header;
    }


    /**
     * Gets the message_body value for this AvailabilityByOrderTypeRequestMessageTypeBean.
     * 
     * @return message_body
     */
    public com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageBodyTypeBean getMessage_body() {
        return message_body;
    }


    /**
     * Sets the message_body value for this AvailabilityByOrderTypeRequestMessageTypeBean.
     * 
     * @param message_body
     */
    public void setMessage_body(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageBodyTypeBean message_body) {
        this.message_body = message_body;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderTypeRequestMessageTypeBean)) return false;
        AvailabilityByOrderTypeRequestMessageTypeBean other = (AvailabilityByOrderTypeRequestMessageTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message_header==null && other.getMessage_header()==null) || 
             (this.message_header!=null &&
              this.message_header.equals(other.getMessage_header()))) &&
            ((this.message_body==null && other.getMessage_body()==null) || 
             (this.message_body!=null &&
              this.message_body.equals(other.getMessage_body())));
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
        if (getMessage_header() != null) {
            _hashCode += getMessage_header().hashCode();
        }
        if (getMessage_body() != null) {
            _hashCode += getMessage_body().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderTypeRequestMessageTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message_header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message_header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageHeaderTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message_body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message_body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageBodyTypeBean"));
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
