/**
 * SoldToCustomerTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SoldToCustomerTypeBean  extends com.microsretail.Locate.CustomerTypeBean  implements java.io.Serializable {
    private java.lang.String customer_no;  // attribute

    public SoldToCustomerTypeBean() {
    }

    public SoldToCustomerTypeBean(
           com.microsretail.Locate.NameTypeBean name,
           com.microsretail.Locate.AddressTypeBean address,
           java.lang.String customer_no) {
        super(
            name,
            address);
        this.customer_no = customer_no;
    }


    /**
     * Gets the customer_no value for this SoldToCustomerTypeBean.
     * 
     * @return customer_no
     */
    public java.lang.String getCustomer_no() {
        return customer_no;
    }


    /**
     * Sets the customer_no value for this SoldToCustomerTypeBean.
     * 
     * @param customer_no
     */
    public void setCustomer_no(java.lang.String customer_no) {
        this.customer_no = customer_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoldToCustomerTypeBean)) return false;
        SoldToCustomerTypeBean other = (SoldToCustomerTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customer_no==null && other.getCustomer_no()==null) || 
             (this.customer_no!=null &&
              this.customer_no.equals(other.getCustomer_no())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomer_no() != null) {
            _hashCode += getCustomer_no().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoldToCustomerTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SoldToCustomerTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("customer_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "customer_no"));
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
