/**
 * StatusInquiryRequestMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusInquiryRequestMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.StatusInquiryRequestMessageLookupDataTypeBean lookup_data;

    public StatusInquiryRequestMessageBodyTypeBean() {
    }

    public StatusInquiryRequestMessageBodyTypeBean(
           com.microsretail.Locate.StatusInquiryRequestMessageLookupDataTypeBean lookup_data) {
           this.lookup_data = lookup_data;
    }


    /**
     * Gets the lookup_data value for this StatusInquiryRequestMessageBodyTypeBean.
     * 
     * @return lookup_data
     */
    public com.microsretail.Locate.StatusInquiryRequestMessageLookupDataTypeBean getLookup_data() {
        return lookup_data;
    }


    /**
     * Sets the lookup_data value for this StatusInquiryRequestMessageBodyTypeBean.
     * 
     * @param lookup_data
     */
    public void setLookup_data(com.microsretail.Locate.StatusInquiryRequestMessageLookupDataTypeBean lookup_data) {
        this.lookup_data = lookup_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusInquiryRequestMessageBodyTypeBean)) return false;
        StatusInquiryRequestMessageBodyTypeBean other = (StatusInquiryRequestMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lookup_data==null && other.getLookup_data()==null) || 
             (this.lookup_data!=null &&
              this.lookup_data.equals(other.getLookup_data())));
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
        if (getLookup_data() != null) {
            _hashCode += getLookup_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusInquiryRequestMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookup_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookup_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageLookupDataTypeBean"));
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
