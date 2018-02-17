/**
 * ProductUpdateResponseMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class ProductUpdateResponseMessageBodyTypeBean  implements java.io.Serializable {
    private java.lang.String response_cd;

    private java.lang.String response_description;

    public ProductUpdateResponseMessageBodyTypeBean() {
    }

    public ProductUpdateResponseMessageBodyTypeBean(
           java.lang.String response_cd,
           java.lang.String response_description) {
           this.response_cd = response_cd;
           this.response_description = response_description;
    }


    /**
     * Gets the response_cd value for this ProductUpdateResponseMessageBodyTypeBean.
     * 
     * @return response_cd
     */
    public java.lang.String getResponse_cd() {
        return response_cd;
    }


    /**
     * Sets the response_cd value for this ProductUpdateResponseMessageBodyTypeBean.
     * 
     * @param response_cd
     */
    public void setResponse_cd(java.lang.String response_cd) {
        this.response_cd = response_cd;
    }


    /**
     * Gets the response_description value for this ProductUpdateResponseMessageBodyTypeBean.
     * 
     * @return response_description
     */
    public java.lang.String getResponse_description() {
        return response_description;
    }


    /**
     * Sets the response_description value for this ProductUpdateResponseMessageBodyTypeBean.
     * 
     * @param response_description
     */
    public void setResponse_description(java.lang.String response_description) {
        this.response_description = response_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductUpdateResponseMessageBodyTypeBean)) return false;
        ProductUpdateResponseMessageBodyTypeBean other = (ProductUpdateResponseMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(ProductUpdateResponseMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateResponseMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_description"));
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
