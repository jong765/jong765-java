/**
 * LocateItemsResponseMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class LocateItemsResponseMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean[][] items;

    private com.microsretail.Locate.LocateItemsResponseMessageLocationTypeBean[] locations;

    private java.lang.String split_order;  // attribute

    private java.lang.String request_id;  // attribute

    public LocateItemsResponseMessageBodyTypeBean() {
    }

    public LocateItemsResponseMessageBodyTypeBean(
           com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean[][] items,
           com.microsretail.Locate.LocateItemsResponseMessageLocationTypeBean[] locations,
           java.lang.String split_order,
           java.lang.String request_id) {
           this.items = items;
           this.locations = locations;
           this.split_order = split_order;
           this.request_id = request_id;
    }


    /**
     * Gets the items value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean[][] getItems() {
        return items;
    }


    /**
     * Sets the items value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean[][] items) {
        this.items = items;
    }


    /**
     * Gets the locations value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @return locations
     */
    public com.microsretail.Locate.LocateItemsResponseMessageLocationTypeBean[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @param locations
     */
    public void setLocations(com.microsretail.Locate.LocateItemsResponseMessageLocationTypeBean[] locations) {
        this.locations = locations;
    }


    /**
     * Gets the split_order value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @return split_order
     */
    public java.lang.String getSplit_order() {
        return split_order;
    }


    /**
     * Sets the split_order value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @param split_order
     */
    public void setSplit_order(java.lang.String split_order) {
        this.split_order = split_order;
    }


    /**
     * Gets the request_id value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @return request_id
     */
    public java.lang.String getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this LocateItemsResponseMessageBodyTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(java.lang.String request_id) {
        this.request_id = request_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocateItemsResponseMessageBodyTypeBean)) return false;
        LocateItemsResponseMessageBodyTypeBean other = (LocateItemsResponseMessageBodyTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.split_order==null && other.getSplit_order()==null) || 
             (this.split_order!=null &&
              this.split_order.equals(other.getSplit_order()))) &&
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
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSplit_order() != null) {
            _hashCode += getSplit_order().hashCode();
        }
        if (getRequest_id() != null) {
            _hashCode += getRequest_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocateItemsResponseMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageBodyTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("split_order");
        attrField.setXmlName(new javax.xml.namespace.QName("", "split_order"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageItemTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageLocationTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "location"));
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
