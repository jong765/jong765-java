/**
 * DSSalesOrderCustomizationTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class DSSalesOrderCustomizationTypeBean  implements java.io.Serializable {
    private java.lang.String customization_code;

    private java.lang.String customization_message;

    public DSSalesOrderCustomizationTypeBean() {
    }

    public DSSalesOrderCustomizationTypeBean(
           java.lang.String customization_code,
           java.lang.String customization_message) {
           this.customization_code = customization_code;
           this.customization_message = customization_message;
    }


    /**
     * Gets the customization_code value for this DSSalesOrderCustomizationTypeBean.
     * 
     * @return customization_code
     */
    public java.lang.String getCustomization_code() {
        return customization_code;
    }


    /**
     * Sets the customization_code value for this DSSalesOrderCustomizationTypeBean.
     * 
     * @param customization_code
     */
    public void setCustomization_code(java.lang.String customization_code) {
        this.customization_code = customization_code;
    }


    /**
     * Gets the customization_message value for this DSSalesOrderCustomizationTypeBean.
     * 
     * @return customization_message
     */
    public java.lang.String getCustomization_message() {
        return customization_message;
    }


    /**
     * Sets the customization_message value for this DSSalesOrderCustomizationTypeBean.
     * 
     * @param customization_message
     */
    public void setCustomization_message(java.lang.String customization_message) {
        this.customization_message = customization_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSSalesOrderCustomizationTypeBean)) return false;
        DSSalesOrderCustomizationTypeBean other = (DSSalesOrderCustomizationTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customization_code==null && other.getCustomization_code()==null) || 
             (this.customization_code!=null &&
              this.customization_code.equals(other.getCustomization_code()))) &&
            ((this.customization_message==null && other.getCustomization_message()==null) || 
             (this.customization_message!=null &&
              this.customization_message.equals(other.getCustomization_message())));
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
        if (getCustomization_code() != null) {
            _hashCode += getCustomization_code().hashCode();
        }
        if (getCustomization_message() != null) {
            _hashCode += getCustomization_message().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DSSalesOrderCustomizationTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "DSSalesOrderCustomizationTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customization_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customization_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customization_message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customization_message"));
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
