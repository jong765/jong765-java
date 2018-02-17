/**
 * StatusUpdateRequestMessageOrderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusUpdateRequestMessageOrderTypeBean  implements java.io.Serializable {
    private java.lang.String employee_id;

    private com.microsretail.Locate.StatusUpdateRequestMessageStoreLocationTypeBean store_location;

    private com.microsretail.Locate.StatusUpdateRequestMessageItemTypeBean[] items;

    private java.lang.String request_id;  // attribute

    private java.lang.String order_id;  // attribute

    private java.lang.String order_status;  // attribute

    private java.lang.String order_status_reason_code;  // attribute

    private java.lang.String order_status_reason_note;  // attribute

    public StatusUpdateRequestMessageOrderTypeBean() {
    }

    public StatusUpdateRequestMessageOrderTypeBean(
           java.lang.String employee_id,
           com.microsretail.Locate.StatusUpdateRequestMessageStoreLocationTypeBean store_location,
           com.microsretail.Locate.StatusUpdateRequestMessageItemTypeBean[] items,
           java.lang.String request_id,
           java.lang.String order_id,
           java.lang.String order_status,
           java.lang.String order_status_reason_code,
           java.lang.String order_status_reason_note) {
           this.employee_id = employee_id;
           this.store_location = store_location;
           this.items = items;
           this.request_id = request_id;
           this.order_id = order_id;
           this.order_status = order_status;
           this.order_status_reason_code = order_status_reason_code;
           this.order_status_reason_note = order_status_reason_note;
    }


    /**
     * Gets the employee_id value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return employee_id
     */
    public java.lang.String getEmployee_id() {
        return employee_id;
    }


    /**
     * Sets the employee_id value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param employee_id
     */
    public void setEmployee_id(java.lang.String employee_id) {
        this.employee_id = employee_id;
    }


    /**
     * Gets the store_location value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.StatusUpdateRequestMessageStoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.StatusUpdateRequestMessageStoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }


    /**
     * Gets the items value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.StatusUpdateRequestMessageItemTypeBean[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.StatusUpdateRequestMessageItemTypeBean[] items) {
        this.items = items;
    }


    /**
     * Gets the request_id value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return request_id
     */
    public java.lang.String getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(java.lang.String request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the order_id value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the order_status value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the order_status_reason_code value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return order_status_reason_code
     */
    public java.lang.String getOrder_status_reason_code() {
        return order_status_reason_code;
    }


    /**
     * Sets the order_status_reason_code value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param order_status_reason_code
     */
    public void setOrder_status_reason_code(java.lang.String order_status_reason_code) {
        this.order_status_reason_code = order_status_reason_code;
    }


    /**
     * Gets the order_status_reason_note value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @return order_status_reason_note
     */
    public java.lang.String getOrder_status_reason_note() {
        return order_status_reason_note;
    }


    /**
     * Sets the order_status_reason_note value for this StatusUpdateRequestMessageOrderTypeBean.
     * 
     * @param order_status_reason_note
     */
    public void setOrder_status_reason_note(java.lang.String order_status_reason_note) {
        this.order_status_reason_note = order_status_reason_note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusUpdateRequestMessageOrderTypeBean)) return false;
        StatusUpdateRequestMessageOrderTypeBean other = (StatusUpdateRequestMessageOrderTypeBean) obj;
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
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.request_id==null && other.getRequest_id()==null) || 
             (this.request_id!=null &&
              this.request_id.equals(other.getRequest_id()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            ((this.order_status_reason_code==null && other.getOrder_status_reason_code()==null) || 
             (this.order_status_reason_code!=null &&
              this.order_status_reason_code.equals(other.getOrder_status_reason_code()))) &&
            ((this.order_status_reason_note==null && other.getOrder_status_reason_note()==null) || 
             (this.order_status_reason_note!=null &&
              this.order_status_reason_note.equals(other.getOrder_status_reason_note())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequest_id() != null) {
            _hashCode += getRequest_id().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        if (getOrder_status_reason_code() != null) {
            _hashCode += getOrder_status_reason_code().hashCode();
        }
        if (getOrder_status_reason_note() != null) {
            _hashCode += getOrder_status_reason_note().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusUpdateRequestMessageOrderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageOrderTypeBean"));
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
        attrField.setFieldName("order_status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_status_reason_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_status_reason_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_status_reason_note");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_status_reason_note"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageStoreLocationTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageItemTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
