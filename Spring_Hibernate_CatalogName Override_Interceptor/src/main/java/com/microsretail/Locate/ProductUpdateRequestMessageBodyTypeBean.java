/**
 * ProductUpdateRequestMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class ProductUpdateRequestMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.ProductUpdateRequestMessageSystemProductTypeBean system_product;

    public ProductUpdateRequestMessageBodyTypeBean() {
    }

    public ProductUpdateRequestMessageBodyTypeBean(
           com.microsretail.Locate.ProductUpdateRequestMessageSystemProductTypeBean system_product) {
           this.system_product = system_product;
    }


    /**
     * Gets the system_product value for this ProductUpdateRequestMessageBodyTypeBean.
     * 
     * @return system_product
     */
    public com.microsretail.Locate.ProductUpdateRequestMessageSystemProductTypeBean getSystem_product() {
        return system_product;
    }


    /**
     * Sets the system_product value for this ProductUpdateRequestMessageBodyTypeBean.
     * 
     * @param system_product
     */
    public void setSystem_product(com.microsretail.Locate.ProductUpdateRequestMessageSystemProductTypeBean system_product) {
        this.system_product = system_product;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductUpdateRequestMessageBodyTypeBean)) return false;
        ProductUpdateRequestMessageBodyTypeBean other = (ProductUpdateRequestMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.system_product==null && other.getSystem_product()==null) || 
             (this.system_product!=null &&
              this.system_product.equals(other.getSystem_product())));
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
        if (getSystem_product() != null) {
            _hashCode += getSystem_product().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductUpdateRequestMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "system_product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageSystemProductTypeBean"));
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
