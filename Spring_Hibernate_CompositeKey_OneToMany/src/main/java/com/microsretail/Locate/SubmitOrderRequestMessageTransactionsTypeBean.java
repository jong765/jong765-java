/**
 * SubmitOrderRequestMessageTransactionsTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SubmitOrderRequestMessageTransactionsTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean transaction_header;

    public SubmitOrderRequestMessageTransactionsTypeBean() {
    }

    public SubmitOrderRequestMessageTransactionsTypeBean(
           com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean transaction_header) {
           this.transaction_header = transaction_header;
    }


    /**
     * Gets the transaction_header value for this SubmitOrderRequestMessageTransactionsTypeBean.
     * 
     * @return transaction_header
     */
    public com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean getTransaction_header() {
        return transaction_header;
    }


    /**
     * Sets the transaction_header value for this SubmitOrderRequestMessageTransactionsTypeBean.
     * 
     * @param transaction_header
     */
    public void setTransaction_header(com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean transaction_header) {
        this.transaction_header = transaction_header;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitOrderRequestMessageTransactionsTypeBean)) return false;
        SubmitOrderRequestMessageTransactionsTypeBean other = (SubmitOrderRequestMessageTransactionsTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transaction_header==null && other.getTransaction_header()==null) || 
             (this.transaction_header!=null &&
              this.transaction_header.equals(other.getTransaction_header())));
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
        if (getTransaction_header() != null) {
            _hashCode += getTransaction_header().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitOrderRequestMessageTransactionsTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTransactionsTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTransactionHeaderTypeBean"));
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
