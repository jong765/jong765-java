/**
 * AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean  implements java.io.Serializable {
    private java.lang.String location_cd;  // attribute

    private java.lang.String system_cd;  // attribute

    private java.lang.String distance;  // attribute

    private java.lang.String distance_unit;  // attribute

    private java.lang.String available_qty;  // attribute

    private java.lang.String next_po_qty;  // attribute

    private java.lang.String po_dt;  // attribute

    private java.lang.String satisfied_request;  // attribute

    public AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean() {
    }

    public AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean(
           java.lang.String location_cd,
           java.lang.String system_cd,
           java.lang.String distance,
           java.lang.String distance_unit,
           java.lang.String available_qty,
           java.lang.String next_po_qty,
           java.lang.String po_dt,
           java.lang.String satisfied_request) {
           this.location_cd = location_cd;
           this.system_cd = system_cd;
           this.distance = distance;
           this.distance_unit = distance_unit;
           this.available_qty = available_qty;
           this.next_po_qty = next_po_qty;
           this.po_dt = po_dt;
           this.satisfied_request = satisfied_request;
    }


    /**
     * Gets the location_cd value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return location_cd
     */
    public java.lang.String getLocation_cd() {
        return location_cd;
    }


    /**
     * Sets the location_cd value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param location_cd
     */
    public void setLocation_cd(java.lang.String location_cd) {
        this.location_cd = location_cd;
    }


    /**
     * Gets the system_cd value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return system_cd
     */
    public java.lang.String getSystem_cd() {
        return system_cd;
    }


    /**
     * Sets the system_cd value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param system_cd
     */
    public void setSystem_cd(java.lang.String system_cd) {
        this.system_cd = system_cd;
    }


    /**
     * Gets the distance value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return distance
     */
    public java.lang.String getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param distance
     */
    public void setDistance(java.lang.String distance) {
        this.distance = distance;
    }


    /**
     * Gets the distance_unit value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return distance_unit
     */
    public java.lang.String getDistance_unit() {
        return distance_unit;
    }


    /**
     * Sets the distance_unit value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param distance_unit
     */
    public void setDistance_unit(java.lang.String distance_unit) {
        this.distance_unit = distance_unit;
    }


    /**
     * Gets the available_qty value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return available_qty
     */
    public java.lang.String getAvailable_qty() {
        return available_qty;
    }


    /**
     * Sets the available_qty value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param available_qty
     */
    public void setAvailable_qty(java.lang.String available_qty) {
        this.available_qty = available_qty;
    }


    /**
     * Gets the next_po_qty value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return next_po_qty
     */
    public java.lang.String getNext_po_qty() {
        return next_po_qty;
    }


    /**
     * Sets the next_po_qty value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param next_po_qty
     */
    public void setNext_po_qty(java.lang.String next_po_qty) {
        this.next_po_qty = next_po_qty;
    }


    /**
     * Gets the po_dt value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return po_dt
     */
    public java.lang.String getPo_dt() {
        return po_dt;
    }


    /**
     * Sets the po_dt value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param po_dt
     */
    public void setPo_dt(java.lang.String po_dt) {
        this.po_dt = po_dt;
    }


    /**
     * Gets the satisfied_request value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @return satisfied_request
     */
    public java.lang.String getSatisfied_request() {
        return satisfied_request;
    }


    /**
     * Sets the satisfied_request value for this AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.
     * 
     * @param satisfied_request
     */
    public void setSatisfied_request(java.lang.String satisfied_request) {
        this.satisfied_request = satisfied_request;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean)) return false;
        AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean other = (AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.location_cd==null && other.getLocation_cd()==null) || 
             (this.location_cd!=null &&
              this.location_cd.equals(other.getLocation_cd()))) &&
            ((this.system_cd==null && other.getSystem_cd()==null) || 
             (this.system_cd!=null &&
              this.system_cd.equals(other.getSystem_cd()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
            ((this.distance_unit==null && other.getDistance_unit()==null) || 
             (this.distance_unit!=null &&
              this.distance_unit.equals(other.getDistance_unit()))) &&
            ((this.available_qty==null && other.getAvailable_qty()==null) || 
             (this.available_qty!=null &&
              this.available_qty.equals(other.getAvailable_qty()))) &&
            ((this.next_po_qty==null && other.getNext_po_qty()==null) || 
             (this.next_po_qty!=null &&
              this.next_po_qty.equals(other.getNext_po_qty()))) &&
            ((this.po_dt==null && other.getPo_dt()==null) || 
             (this.po_dt!=null &&
              this.po_dt.equals(other.getPo_dt()))) &&
            ((this.satisfied_request==null && other.getSatisfied_request()==null) || 
             (this.satisfied_request!=null &&
              this.satisfied_request.equals(other.getSatisfied_request())));
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
        if (getLocation_cd() != null) {
            _hashCode += getLocation_cd().hashCode();
        }
        if (getSystem_cd() != null) {
            _hashCode += getSystem_cd().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (getDistance_unit() != null) {
            _hashCode += getDistance_unit().hashCode();
        }
        if (getAvailable_qty() != null) {
            _hashCode += getAvailable_qty().hashCode();
        }
        if (getNext_po_qty() != null) {
            _hashCode += getNext_po_qty().hashCode();
        }
        if (getPo_dt() != null) {
            _hashCode += getPo_dt().hashCode();
        }
        if (getSatisfied_request() != null) {
            _hashCode += getSatisfied_request().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("distance");
        attrField.setXmlName(new javax.xml.namespace.QName("", "distance"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("distance_unit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "distance_unit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("available_qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "available_qty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("next_po_qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "next_po_qty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("po_dt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "po_dt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("satisfied_request");
        attrField.setXmlName(new javax.xml.namespace.QName("", "satisfied_request"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
