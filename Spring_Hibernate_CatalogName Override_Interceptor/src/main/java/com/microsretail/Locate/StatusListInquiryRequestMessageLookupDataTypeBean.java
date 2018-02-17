/**
 * StatusListInquiryRequestMessageLookupDataTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusListInquiryRequestMessageLookupDataTypeBean  implements java.io.Serializable {
    private java.lang.String ref_transaction_no;

    private java.lang.String employee_id;

    private com.microsretail.Locate.StatusListInquiryRequestMessageStoreLocationTypeBean store_location;

    private com.microsretail.Locate.StatusListInquiryRequestMessageRequestIdBean[] request_ids;

    private com.microsretail.Locate.StatusListInquiryRequestMessageStatusBean[] statuses;

    private java.lang.String response_type;  // attribute

    private java.lang.String status_condition;  // attribute

    public StatusListInquiryRequestMessageLookupDataTypeBean() {
    }

    public StatusListInquiryRequestMessageLookupDataTypeBean(
           java.lang.String ref_transaction_no,
           java.lang.String employee_id,
           com.microsretail.Locate.StatusListInquiryRequestMessageStoreLocationTypeBean store_location,
           com.microsretail.Locate.StatusListInquiryRequestMessageRequestIdBean[] request_ids,
           com.microsretail.Locate.StatusListInquiryRequestMessageStatusBean[] statuses,
           java.lang.String response_type,
           java.lang.String status_condition) {
           this.ref_transaction_no = ref_transaction_no;
           this.employee_id = employee_id;
           this.store_location = store_location;
           this.request_ids = request_ids;
           this.statuses = statuses;
           this.response_type = response_type;
           this.status_condition = status_condition;
    }


    /**
     * Gets the ref_transaction_no value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return ref_transaction_no
     */
    public java.lang.String getRef_transaction_no() {
        return ref_transaction_no;
    }


    /**
     * Sets the ref_transaction_no value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param ref_transaction_no
     */
    public void setRef_transaction_no(java.lang.String ref_transaction_no) {
        this.ref_transaction_no = ref_transaction_no;
    }


    /**
     * Gets the employee_id value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return employee_id
     */
    public java.lang.String getEmployee_id() {
        return employee_id;
    }


    /**
     * Sets the employee_id value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param employee_id
     */
    public void setEmployee_id(java.lang.String employee_id) {
        this.employee_id = employee_id;
    }


    /**
     * Gets the store_location value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.StatusListInquiryRequestMessageStoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.StatusListInquiryRequestMessageStoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }


    /**
     * Gets the request_ids value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return request_ids
     */
    public com.microsretail.Locate.StatusListInquiryRequestMessageRequestIdBean[] getRequest_ids() {
        return request_ids;
    }


    /**
     * Sets the request_ids value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param request_ids
     */
    public void setRequest_ids(com.microsretail.Locate.StatusListInquiryRequestMessageRequestIdBean[] request_ids) {
        this.request_ids = request_ids;
    }


    /**
     * Gets the statuses value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return statuses
     */
    public com.microsretail.Locate.StatusListInquiryRequestMessageStatusBean[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param statuses
     */
    public void setStatuses(com.microsretail.Locate.StatusListInquiryRequestMessageStatusBean[] statuses) {
        this.statuses = statuses;
    }


    /**
     * Gets the response_type value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return response_type
     */
    public java.lang.String getResponse_type() {
        return response_type;
    }


    /**
     * Sets the response_type value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param response_type
     */
    public void setResponse_type(java.lang.String response_type) {
        this.response_type = response_type;
    }


    /**
     * Gets the status_condition value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @return status_condition
     */
    public java.lang.String getStatus_condition() {
        return status_condition;
    }


    /**
     * Sets the status_condition value for this StatusListInquiryRequestMessageLookupDataTypeBean.
     * 
     * @param status_condition
     */
    public void setStatus_condition(java.lang.String status_condition) {
        this.status_condition = status_condition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusListInquiryRequestMessageLookupDataTypeBean)) return false;
        StatusListInquiryRequestMessageLookupDataTypeBean other = (StatusListInquiryRequestMessageLookupDataTypeBean) obj;
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
            ((this.request_ids==null && other.getRequest_ids()==null) || 
             (this.request_ids!=null &&
              java.util.Arrays.equals(this.request_ids, other.getRequest_ids()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses()))) &&
            ((this.response_type==null && other.getResponse_type()==null) || 
             (this.response_type!=null &&
              this.response_type.equals(other.getResponse_type()))) &&
            ((this.status_condition==null && other.getStatus_condition()==null) || 
             (this.status_condition!=null &&
              this.status_condition.equals(other.getStatus_condition())));
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
        if (getRequest_ids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequest_ids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequest_ids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse_type() != null) {
            _hashCode += getResponse_type().hashCode();
        }
        if (getStatus_condition() != null) {
            _hashCode += getStatus_condition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusListInquiryRequestMessageLookupDataTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageLookupDataTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("response_type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "response_type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status_condition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status_condition"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageStoreLocationTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageRequestIdBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "request_ids"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageStatusBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "statuses"));
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
