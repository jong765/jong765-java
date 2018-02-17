/**
 * AvailabilityByOrderTypeResponseMessageLocationTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderTypeResponseMessageLocationTypeBean  implements java.io.Serializable {
    private java.lang.String locationname;

    private com.microsretail.Locate.AddressTypeBean address;

    private java.lang.String location_cd;  // attribute

    private java.lang.String system_cd;  // attribute

    public AvailabilityByOrderTypeResponseMessageLocationTypeBean() {
    }

    public AvailabilityByOrderTypeResponseMessageLocationTypeBean(
           java.lang.String locationname,
           com.microsretail.Locate.AddressTypeBean address,
           java.lang.String location_cd,
           java.lang.String system_cd) {
           this.locationname = locationname;
           this.address = address;
           this.location_cd = location_cd;
           this.system_cd = system_cd;
    }


    /**
     * Gets the locationname value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @return locationname
     */
    public java.lang.String getLocationname() {
        return locationname;
    }


    /**
     * Sets the locationname value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @param locationname
     */
    public void setLocationname(java.lang.String locationname) {
        this.locationname = locationname;
    }


    /**
     * Gets the address value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @return address
     */
    public com.microsretail.Locate.AddressTypeBean getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @param address
     */
    public void setAddress(com.microsretail.Locate.AddressTypeBean address) {
        this.address = address;
    }


    /**
     * Gets the location_cd value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @return location_cd
     */
    public java.lang.String getLocation_cd() {
        return location_cd;
    }


    /**
     * Sets the location_cd value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @param location_cd
     */
    public void setLocation_cd(java.lang.String location_cd) {
        this.location_cd = location_cd;
    }


    /**
     * Gets the system_cd value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @return system_cd
     */
    public java.lang.String getSystem_cd() {
        return system_cd;
    }


    /**
     * Sets the system_cd value for this AvailabilityByOrderTypeResponseMessageLocationTypeBean.
     * 
     * @param system_cd
     */
    public void setSystem_cd(java.lang.String system_cd) {
        this.system_cd = system_cd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderTypeResponseMessageLocationTypeBean)) return false;
        AvailabilityByOrderTypeResponseMessageLocationTypeBean other = (AvailabilityByOrderTypeResponseMessageLocationTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locationname==null && other.getLocationname()==null) || 
             (this.locationname!=null &&
              this.locationname.equals(other.getLocationname()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.location_cd==null && other.getLocation_cd()==null) || 
             (this.location_cd!=null &&
              this.location_cd.equals(other.getLocation_cd()))) &&
            ((this.system_cd==null && other.getSystem_cd()==null) || 
             (this.system_cd!=null &&
              this.system_cd.equals(other.getSystem_cd())));
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
        if (getLocationname() != null) {
            _hashCode += getLocationname().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getLocation_cd() != null) {
            _hashCode += getLocation_cd().hashCode();
        }
        if (getSystem_cd() != null) {
            _hashCode += getSystem_cd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderTypeResponseMessageLocationTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("location_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "location_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("system_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "system_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AddressTypeBean"));
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
