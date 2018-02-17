/**
 * StatusUpdateResponseMessageResponseTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusUpdateResponseMessageResponseTypeBean  implements java.io.Serializable {
    private java.lang.String response_description;

    private java.lang.String order_id;  // attribute

    private int request_id;  // attribute

    private int response_code;  // attribute

    private int line_no;  // attribute

    public StatusUpdateResponseMessageResponseTypeBean() {
    }

    public StatusUpdateResponseMessageResponseTypeBean(
           java.lang.String response_description,
           java.lang.String order_id,
           int request_id,
           int response_code,
           int line_no) {
           this.response_description = response_description;
           this.order_id = order_id;
           this.request_id = request_id;
           this.response_code = response_code;
           this.line_no = line_no;
    }


    /**
     * Gets the response_description value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @return response_description
     */
    public java.lang.String getResponse_description() {
        return response_description;
    }


    /**
     * Sets the response_description value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @param response_description
     */
    public void setResponse_description(java.lang.String response_description) {
        this.response_description = response_description;
    }


    /**
     * Gets the order_id value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the request_id value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @return request_id
     */
    public int getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the response_code value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @return response_code
     */
    public int getResponse_code() {
        return response_code;
    }


    /**
     * Sets the response_code value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @param response_code
     */
    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }


    /**
     * Gets the line_no value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @return line_no
     */
    public int getLine_no() {
        return line_no;
    }


    /**
     * Sets the line_no value for this StatusUpdateResponseMessageResponseTypeBean.
     * 
     * @param line_no
     */
    public void setLine_no(int line_no) {
        this.line_no = line_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusUpdateResponseMessageResponseTypeBean)) return false;
        StatusUpdateResponseMessageResponseTypeBean other = (StatusUpdateResponseMessageResponseTypeBean) obj;
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
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            this.request_id == other.getRequest_id() &&
            this.response_code == other.getResponse_code() &&
            this.line_no == other.getLine_no();
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
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        _hashCode += getRequest_id();
        _hashCode += getResponse_code();
        _hashCode += getLine_no();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusUpdateResponseMessageResponseTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateResponseMessageResponseTypeBean"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
