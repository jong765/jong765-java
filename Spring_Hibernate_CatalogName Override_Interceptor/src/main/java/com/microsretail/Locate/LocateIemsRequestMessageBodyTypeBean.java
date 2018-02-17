/**
 * LocateIemsRequestMessageBodyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class LocateIemsRequestMessageBodyTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.LocateItemsRequestMessageItemTypeBean[] items;

    private com.microsretail.Locate.LocateItemsRequestMessageStoreLocationTypeBean store_location;

    private com.microsretail.Locate.LocateItemsRequestMessageAddressTypeBean address;

    private com.microsretail.Locate.LocateItemsRequestMessageRangeTypeBean range;

    private com.microsretail.Locate.LocateItemsRequestMessageRequestedLocationTypeBean requested_location;

    public LocateIemsRequestMessageBodyTypeBean() {
    }

    public LocateIemsRequestMessageBodyTypeBean(
           com.microsretail.Locate.LocateItemsRequestMessageItemTypeBean[] items,
           com.microsretail.Locate.LocateItemsRequestMessageStoreLocationTypeBean store_location,
           com.microsretail.Locate.LocateItemsRequestMessageAddressTypeBean address,
           com.microsretail.Locate.LocateItemsRequestMessageRangeTypeBean range,
           com.microsretail.Locate.LocateItemsRequestMessageRequestedLocationTypeBean requested_location) {
           this.items = items;
           this.store_location = store_location;
           this.address = address;
           this.range = range;
           this.requested_location = requested_location;
    }


    /**
     * Gets the items value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.LocateItemsRequestMessageItemTypeBean[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.LocateItemsRequestMessageItemTypeBean[] items) {
        this.items = items;
    }


    /**
     * Gets the store_location value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.LocateItemsRequestMessageStoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.LocateItemsRequestMessageStoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }


    /**
     * Gets the address value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @return address
     */
    public com.microsretail.Locate.LocateItemsRequestMessageAddressTypeBean getAddress() {
        return address;
    }


    /**
     * Sets the address value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @param address
     */
    public void setAddress(com.microsretail.Locate.LocateItemsRequestMessageAddressTypeBean address) {
        this.address = address;
    }


    /**
     * Gets the range value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @return range
     */
    public com.microsretail.Locate.LocateItemsRequestMessageRangeTypeBean getRange() {
        return range;
    }


    /**
     * Sets the range value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @param range
     */
    public void setRange(com.microsretail.Locate.LocateItemsRequestMessageRangeTypeBean range) {
        this.range = range;
    }


    /**
     * Gets the requested_location value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @return requested_location
     */
    public com.microsretail.Locate.LocateItemsRequestMessageRequestedLocationTypeBean getRequested_location() {
        return requested_location;
    }


    /**
     * Sets the requested_location value for this LocateIemsRequestMessageBodyTypeBean.
     * 
     * @param requested_location
     */
    public void setRequested_location(com.microsretail.Locate.LocateItemsRequestMessageRequestedLocationTypeBean requested_location) {
        this.requested_location = requested_location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocateIemsRequestMessageBodyTypeBean)) return false;
        LocateIemsRequestMessageBodyTypeBean other = (LocateIemsRequestMessageBodyTypeBean) obj;
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
            ((this.store_location==null && other.getStore_location()==null) || 
             (this.store_location!=null &&
              this.store_location.equals(other.getStore_location()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.requested_location==null && other.getRequested_location()==null) || 
             (this.requested_location!=null &&
              this.requested_location.equals(other.getRequested_location())));
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
        if (getStore_location() != null) {
            _hashCode += getStore_location().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getRequested_location() != null) {
            _hashCode += getRequested_location().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocateIemsRequestMessageBodyTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateIemsRequestMessageBodyTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageItemTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageStoreLocationTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageAddressTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageRangeTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requested_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageRequestedLocationTypeBean"));
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
