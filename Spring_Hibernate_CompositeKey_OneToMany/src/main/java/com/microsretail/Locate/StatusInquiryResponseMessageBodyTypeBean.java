/**
 * StatusInquiryResponseMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusInquiryResponseMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.StatusInquiryResponseMessageOrderTypeBean[] orders;

    public StatusInquiryResponseMessageBodyTypeBean() {
    }

    public StatusInquiryResponseMessageBodyTypeBean(
           com.microsretail.Locate.StatusInquiryResponseMessageOrderTypeBean[] orders) {
           this.orders = orders;
    }


    /**
     * Gets the orders value for this StatusInquiryResponseMessageBodyTypeBean.
     * 
     * @return orders
     */
    public com.microsretail.Locate.StatusInquiryResponseMessageOrderTypeBean[] getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this StatusInquiryResponseMessageBodyTypeBean.
     * 
     * @param orders
     */
    public void setOrders(com.microsretail.Locate.StatusInquiryResponseMessageOrderTypeBean[] orders) {
        this.orders = orders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusInquiryResponseMessageBodyTypeBean)) return false;
        StatusInquiryResponseMessageBodyTypeBean other = (StatusInquiryResponseMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              java.util.Arrays.equals(this.orders, other.getOrders())));
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
        if (getOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrders(), i);
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
        new org.apache.axis.description.TypeDesc(StatusInquiryResponseMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageOrderTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "order"));
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
