/**
 * SubmitOrderRequestMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SubmitOrderRequestMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean transactions;

    public SubmitOrderRequestMessageBodyTypeBean() {
    }

    public SubmitOrderRequestMessageBodyTypeBean(
           com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean transactions) {
           this.transactions = transactions;
    }


    /**
     * Gets the transactions value for this SubmitOrderRequestMessageBodyTypeBean.
     * 
     * @return transactions
     */
    public com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this SubmitOrderRequestMessageBodyTypeBean.
     * 
     * @param transactions
     */
    public void setTransactions(com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean transactions) {
        this.transactions = transactions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitOrderRequestMessageBodyTypeBean)) return false;
        SubmitOrderRequestMessageBodyTypeBean other = (SubmitOrderRequestMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              this.transactions.equals(other.getTransactions())));
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
        if (getTransactions() != null) {
            _hashCode += getTransactions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitOrderRequestMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTransactionsTypeBean"));
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
