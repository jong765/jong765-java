/**
 * SubmitOrderResponseMessageResponseTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SubmitOrderResponseMessageResponseTypeBean  implements java.io.Serializable {
    private java.lang.String response_description;

    private java.lang.String response_fulfillment_system_cd;

    private java.lang.String response_fulfillment_location_cd;

    private com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail[] fulfillment_details;

    private java.lang.String order_id;  // attribute

    private int request_id;  // attribute

    private int response_code;  // attribute

    public SubmitOrderResponseMessageResponseTypeBean() {
    }

    public SubmitOrderResponseMessageResponseTypeBean(
           java.lang.String response_description,
           java.lang.String response_fulfillment_system_cd,
           java.lang.String response_fulfillment_location_cd,
           com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail[] fulfillment_details,
           java.lang.String order_id,
           int request_id,
           int response_code) {
           this.response_description = response_description;
           this.response_fulfillment_system_cd = response_fulfillment_system_cd;
           this.response_fulfillment_location_cd = response_fulfillment_location_cd;
           this.fulfillment_details = fulfillment_details;
           this.order_id = order_id;
           this.request_id = request_id;
           this.response_code = response_code;
    }


    /**
     * Gets the response_description value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return response_description
     */
    public java.lang.String getResponse_description() {
        return response_description;
    }


    /**
     * Sets the response_description value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param response_description
     */
    public void setResponse_description(java.lang.String response_description) {
        this.response_description = response_description;
    }


    /**
     * Gets the response_fulfillment_system_cd value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return response_fulfillment_system_cd
     */
    public java.lang.String getResponse_fulfillment_system_cd() {
        return response_fulfillment_system_cd;
    }


    /**
     * Sets the response_fulfillment_system_cd value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param response_fulfillment_system_cd
     */
    public void setResponse_fulfillment_system_cd(java.lang.String response_fulfillment_system_cd) {
        this.response_fulfillment_system_cd = response_fulfillment_system_cd;
    }


    /**
     * Gets the response_fulfillment_location_cd value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return response_fulfillment_location_cd
     */
    public java.lang.String getResponse_fulfillment_location_cd() {
        return response_fulfillment_location_cd;
    }


    /**
     * Sets the response_fulfillment_location_cd value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param response_fulfillment_location_cd
     */
    public void setResponse_fulfillment_location_cd(java.lang.String response_fulfillment_location_cd) {
        this.response_fulfillment_location_cd = response_fulfillment_location_cd;
    }


    /**
     * Gets the fulfillment_details value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return fulfillment_details
     */
    public com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail[] getFulfillment_details() {
        return fulfillment_details;
    }


    /**
     * Sets the fulfillment_details value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param fulfillment_details
     */
    public void setFulfillment_details(com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail[] fulfillment_details) {
        this.fulfillment_details = fulfillment_details;
    }


    /**
     * Gets the order_id value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the request_id value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return request_id
     */
    public int getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the response_code value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @return response_code
     */
    public int getResponse_code() {
        return response_code;
    }


    /**
     * Sets the response_code value for this SubmitOrderResponseMessageResponseTypeBean.
     * 
     * @param response_code
     */
    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitOrderResponseMessageResponseTypeBean)) return false;
        SubmitOrderResponseMessageResponseTypeBean other = (SubmitOrderResponseMessageResponseTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response_description==null && other.getResponse_description()==null) || 
             (this.response_description!=null &&
              this.response_description.equals(other.getResponse_description()))) &&
            ((this.response_fulfillment_system_cd==null && other.getResponse_fulfillment_system_cd()==null) || 
             (this.response_fulfillment_system_cd!=null &&
              this.response_fulfillment_system_cd.equals(other.getResponse_fulfillment_system_cd()))) &&
            ((this.response_fulfillment_location_cd==null && other.getResponse_fulfillment_location_cd()==null) || 
             (this.response_fulfillment_location_cd!=null &&
              this.response_fulfillment_location_cd.equals(other.getResponse_fulfillment_location_cd()))) &&
            ((this.fulfillment_details==null && other.getFulfillment_details()==null) || 
             (this.fulfillment_details!=null &&
              java.util.Arrays.equals(this.fulfillment_details, other.getFulfillment_details()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            this.request_id == other.getRequest_id() &&
            this.response_code == other.getResponse_code();
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
        if (getResponse_description() != null) {
            _hashCode += getResponse_description().hashCode();
        }
        if (getResponse_fulfillment_system_cd() != null) {
            _hashCode += getResponse_fulfillment_system_cd().hashCode();
        }
        if (getResponse_fulfillment_location_cd() != null) {
            _hashCode += getResponse_fulfillment_location_cd().hashCode();
        }
        if (getFulfillment_details() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillment_details());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillment_details(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        _hashCode += getRequest_id();
        _hashCode += getResponse_code();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitOrderResponseMessageResponseTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageResponseTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("response_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "response_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_fulfillment_system_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_fulfillment_system_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_fulfillment_location_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_fulfillment_location_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillment_details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fulfillment_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageFulfillmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fulfillment_detail"));
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
