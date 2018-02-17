/**
 * TransactionTenderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class TransactionTenderTypeBean  implements java.io.Serializable {
    private java.lang.String tender_description;

    private java.math.BigDecimal tender_amount;

    private java.lang.String tender_account;

    private java.lang.String line_item_no;  // attribute

    public TransactionTenderTypeBean() {
    }

    public TransactionTenderTypeBean(
           java.lang.String tender_description,
           java.math.BigDecimal tender_amount,
           java.lang.String tender_account,
           java.lang.String line_item_no) {
           this.tender_description = tender_description;
           this.tender_amount = tender_amount;
           this.tender_account = tender_account;
           this.line_item_no = line_item_no;
    }


    /**
     * Gets the tender_description value for this TransactionTenderTypeBean.
     * 
     * @return tender_description
     */
    public java.lang.String getTender_description() {
        return tender_description;
    }


    /**
     * Sets the tender_description value for this TransactionTenderTypeBean.
     * 
     * @param tender_description
     */
    public void setTender_description(java.lang.String tender_description) {
        this.tender_description = tender_description;
    }


    /**
     * Gets the tender_amount value for this TransactionTenderTypeBean.
     * 
     * @return tender_amount
     */
    public java.math.BigDecimal getTender_amount() {
        return tender_amount;
    }


    /**
     * Sets the tender_amount value for this TransactionTenderTypeBean.
     * 
     * @param tender_amount
     */
    public void setTender_amount(java.math.BigDecimal tender_amount) {
        this.tender_amount = tender_amount;
    }


    /**
     * Gets the tender_account value for this TransactionTenderTypeBean.
     * 
     * @return tender_account
     */
    public java.lang.String getTender_account() {
        return tender_account;
    }


    /**
     * Sets the tender_account value for this TransactionTenderTypeBean.
     * 
     * @param tender_account
     */
    public void setTender_account(java.lang.String tender_account) {
        this.tender_account = tender_account;
    }


    /**
     * Gets the line_item_no value for this TransactionTenderTypeBean.
     * 
     * @return line_item_no
     */
    public java.lang.String getLine_item_no() {
        return line_item_no;
    }


    /**
     * Sets the line_item_no value for this TransactionTenderTypeBean.
     * 
     * @param line_item_no
     */
    public void setLine_item_no(java.lang.String line_item_no) {
        this.line_item_no = line_item_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTenderTypeBean)) return false;
        TransactionTenderTypeBean other = (TransactionTenderTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tender_description==null && other.getTender_description()==null) || 
             (this.tender_description!=null &&
              this.tender_description.equals(other.getTender_description()))) &&
            ((this.tender_amount==null && other.getTender_amount()==null) || 
             (this.tender_amount!=null &&
              this.tender_amount.equals(other.getTender_amount()))) &&
            ((this.tender_account==null && other.getTender_account()==null) || 
             (this.tender_account!=null &&
              this.tender_account.equals(other.getTender_account()))) &&
            ((this.line_item_no==null && other.getLine_item_no()==null) || 
             (this.line_item_no!=null &&
              this.line_item_no.equals(other.getLine_item_no())));
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
        if (getTender_description() != null) {
            _hashCode += getTender_description().hashCode();
        }
        if (getTender_amount() != null) {
            _hashCode += getTender_amount().hashCode();
        }
        if (getTender_account() != null) {
            _hashCode += getTender_account().hashCode();
        }
        if (getLine_item_no() != null) {
            _hashCode += getLine_item_no().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTenderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "TransactionTenderTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_item_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_item_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tender_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tender_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tender_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tender_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tender_account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tender_account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
