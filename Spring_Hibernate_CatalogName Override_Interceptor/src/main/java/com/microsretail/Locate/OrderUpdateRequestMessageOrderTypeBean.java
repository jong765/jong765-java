/**
 * OrderUpdateRequestMessageOrderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class OrderUpdateRequestMessageOrderTypeBean  implements java.io.Serializable {
    private java.lang.String employee_id;

    private com.microsretail.Locate.OrderUpdateRequestMessageStoreLocationTypeBean store_location;

    private java.lang.String request_id;  // attribute

    private java.lang.String order_id;  // attribute

    private java.lang.String under_review;  // attribute

    public OrderUpdateRequestMessageOrderTypeBean() {
    }

    public OrderUpdateRequestMessageOrderTypeBean(
           java.lang.String employee_id,
           com.microsretail.Locate.OrderUpdateRequestMessageStoreLocationTypeBean store_location,
           java.lang.String request_id,
           java.lang.String order_id,
           java.lang.String under_review) {
           this.employee_id = employee_id;
           this.store_location = store_location;
           this.request_id = request_id;
           this.order_id = order_id;
           this.under_review = under_review;
    }


    /**
     * Gets the employee_id value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @return employee_id
     */
    public java.lang.String getEmployee_id() {
        return employee_id;
    }


    /**
     * Sets the employee_id value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @param employee_id
     */
    public void setEmployee_id(java.lang.String employee_id) {
        this.employee_id = employee_id;
    }


    /**
     * Gets the store_location value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.OrderUpdateRequestMessageStoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.OrderUpdateRequestMessageStoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }


    /**
     * Gets the request_id value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @return request_id
     */
    public java.lang.String getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(java.lang.String request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the order_id value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the under_review value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @return under_review
     */
    public java.lang.String getUnder_review() {
        return under_review;
    }


    /**
     * Sets the under_review value for this OrderUpdateRequestMessageOrderTypeBean.
     * 
     * @param under_review
     */
    public void setUnder_review(java.lang.String under_review) {
        this.under_review = under_review;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderUpdateRequestMessageOrderTypeBean)) return false;
        OrderUpdateRequestMessageOrderTypeBean other = (OrderUpdateRequestMessageOrderTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employee_id==null && other.getEmployee_id()==null) || 
             (this.employee_id!=null &&
              this.employee_id.equals(other.getEmployee_id()))) &&
            ((this.store_location==null && other.getStore_location()==null) || 
             (this.store_location!=null &&
              this.store_location.equals(other.getStore_location()))) &&
            ((this.request_id==null && other.getRequest_id()==null) || 
             (this.request_id!=null &&
              this.request_id.equals(other.getRequest_id()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.under_review==null && other.getUnder_review()==null) || 
             (this.under_review!=null &&
              this.under_review.equals(other.getUnder_review())));
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
        if (getEmployee_id() != null) {
            _hashCode += getEmployee_id().hashCode();
        }
        if (getStore_location() != null) {
            _hashCode += getStore_location().hashCode();
        }
        if (getRequest_id() != null) {
            _hashCode += getRequest_id().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getUnder_review() != null) {
            _hashCode += getUnder_review().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderUpdateRequestMessageOrderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageOrderTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("under_review");
        attrField.setXmlName(new javax.xml.namespace.QName("", "under_review"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employee_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageStoreLocationTypeBean"));
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
