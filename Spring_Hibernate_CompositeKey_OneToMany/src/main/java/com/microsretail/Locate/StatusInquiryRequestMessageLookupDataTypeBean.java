/**
 * StatusInquiryRequestMessageLookupDataTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusInquiryRequestMessageLookupDataTypeBean  implements java.io.Serializable {
    private java.lang.String ref_transaction_no;

    private java.lang.String employee_id;

    private com.microsretail.Locate.StatusInquiryRequestMessageStoreLocationTypeBean store_location;

    private java.lang.String order_id;  // attribute

    private java.lang.String request_id;  // attribute

    public StatusInquiryRequestMessageLookupDataTypeBean() {
    }

    public StatusInquiryRequestMessageLookupDataTypeBean(
           java.lang.String ref_transaction_no,
           java.lang.String employee_id,
           com.microsretail.Locate.StatusInquiryRequestMessageStoreLocationTypeBean store_location,
           java.lang.String order_id,
           java.lang.String request_id) {
           this.ref_transaction_no = ref_transaction_no;
           this.employee_id = employee_id;
           this.store_location = store_location;
           this.order_id = order_id;
           this.request_id = request_id;
    }


    /**
     * Gets the ref_transaction_no value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return ref_transaction_no
     */
    public java.lang.String getRef_transaction_no() {
        return ref_transaction_no;
    }


    /**
     * Sets the ref_transaction_no value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param ref_transaction_no
     */
    public void setRef_transaction_no(java.lang.String ref_transaction_no) {
        this.ref_transaction_no = ref_transaction_no;
    }


    /**
     * Gets the employee_id value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return employee_id
     */
    public java.lang.String getEmployee_id() {
        return employee_id;
    }


    /**
     * Sets the employee_id value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param employee_id
     */
    public void setEmployee_id(java.lang.String employee_id) {
        this.employee_id = employee_id;
    }


    /**
     * Gets the store_location value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.StatusInquiryRequestMessageStoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.StatusInquiryRequestMessageStoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }


    /**
     * Gets the order_id value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the request_id value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return request_id
     */
    public java.lang.String getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this StatusInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(java.lang.String request_id) {
        this.request_id = request_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusInquiryRequestMessageLookupDataTypeBean)) return false;
        StatusInquiryRequestMessageLookupDataTypeBean other = (StatusInquiryRequestMessageLookupDataTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ref_transaction_no==null && other.getRef_transaction_no()==null) || 
             (this.ref_transaction_no!=null &&
              this.ref_transaction_no.equals(other.getRef_transaction_no()))) &&
            ((this.employee_id==null && other.getEmployee_id()==null) || 
             (this.employee_id!=null &&
              this.employee_id.equals(other.getEmployee_id()))) &&
            ((this.store_location==null && other.getStore_location()==null) || 
             (this.store_location!=null &&
              this.store_location.equals(other.getStore_location()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.request_id==null && other.getRequest_id()==null) || 
             (this.request_id!=null &&
              this.request_id.equals(other.getRequest_id())));
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
        if (getRef_transaction_no() != null) {
            _hashCode += getRef_transaction_no().hashCode();
        }
        if (getEmployee_id() != null) {
            _hashCode += getEmployee_id().hashCode();
        }
        if (getStore_location() != null) {
            _hashCode += getStore_location().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getRequest_id() != null) {
            _hashCode += getRequest_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusInquiryRequestMessageLookupDataTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageLookupDataTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_transaction_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_transaction_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employee_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageStoreLocationTypeBean"));
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
