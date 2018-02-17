/**
 * StatusUpdateRequestMessageItemTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusUpdateRequestMessageItemTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.CustomerTypeBean ship_to;

    private java.lang.String item_id;  // attribute

    private int item_qty;  // attribute

    private java.lang.String shipping_agent;  // attribute

    private java.lang.String tracking_number;  // attribute

    private java.lang.String item_status;  // attribute

    private java.lang.String fulfilling_location_cd;  // attribute

    private java.lang.String fulfilling_system_cd;  // attribute

    private int line_no;  // attribute

    private int requesting_system_line_no;  // attribute

    private java.lang.String status_date;  // attribute

    private java.lang.String item_status_reason_code;  // attribute

    private java.lang.String item_status_reason_note;  // attribute

    public StatusUpdateRequestMessageItemTypeBean() {
    }

    public StatusUpdateRequestMessageItemTypeBean(
           com.microsretail.Locate.CustomerTypeBean ship_to,
           java.lang.String item_id,
           int item_qty,
           java.lang.String shipping_agent,
           java.lang.String tracking_number,
           java.lang.String item_status,
           java.lang.String fulfilling_location_cd,
           java.lang.String fulfilling_system_cd,
           int line_no,
           int requesting_system_line_no,
           java.lang.String status_date,
           java.lang.String item_status_reason_code,
           java.lang.String item_status_reason_note) {
           this.ship_to = ship_to;
           this.item_id = item_id;
           this.item_qty = item_qty;
           this.shipping_agent = shipping_agent;
           this.tracking_number = tracking_number;
           this.item_status = item_status;
           this.fulfilling_location_cd = fulfilling_location_cd;
           this.fulfilling_system_cd = fulfilling_system_cd;
           this.line_no = line_no;
           this.requesting_system_line_no = requesting_system_line_no;
           this.status_date = status_date;
           this.item_status_reason_code = item_status_reason_code;
           this.item_status_reason_note = item_status_reason_note;
    }


    /**
     * Gets the ship_to value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return ship_to
     */
    public com.microsretail.Locate.CustomerTypeBean getShip_to() {
        return ship_to;
    }


    /**
     * Sets the ship_to value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param ship_to
     */
    public void setShip_to(com.microsretail.Locate.CustomerTypeBean ship_to) {
        this.ship_to = ship_to;
    }


    /**
     * Gets the item_id value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the item_qty value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return item_qty
     */
    public int getItem_qty() {
        return item_qty;
    }


    /**
     * Sets the item_qty value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param item_qty
     */
    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }


    /**
     * Gets the shipping_agent value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return shipping_agent
     */
    public java.lang.String getShipping_agent() {
        return shipping_agent;
    }


    /**
     * Sets the shipping_agent value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param shipping_agent
     */
    public void setShipping_agent(java.lang.String shipping_agent) {
        this.shipping_agent = shipping_agent;
    }


    /**
     * Gets the tracking_number value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return tracking_number
     */
    public java.lang.String getTracking_number() {
        return tracking_number;
    }


    /**
     * Sets the tracking_number value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param tracking_number
     */
    public void setTracking_number(java.lang.String tracking_number) {
        this.tracking_number = tracking_number;
    }


    /**
     * Gets the item_status value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return item_status
     */
    public java.lang.String getItem_status() {
        return item_status;
    }


    /**
     * Sets the item_status value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param item_status
     */
    public void setItem_status(java.lang.String item_status) {
        this.item_status = item_status;
    }


    /**
     * Gets the fulfilling_location_cd value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return fulfilling_location_cd
     */
    public java.lang.String getFulfilling_location_cd() {
        return fulfilling_location_cd;
    }


    /**
     * Sets the fulfilling_location_cd value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param fulfilling_location_cd
     */
    public void setFulfilling_location_cd(java.lang.String fulfilling_location_cd) {
        this.fulfilling_location_cd = fulfilling_location_cd;
    }


    /**
     * Gets the fulfilling_system_cd value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return fulfilling_system_cd
     */
    public java.lang.String getFulfilling_system_cd() {
        return fulfilling_system_cd;
    }


    /**
     * Sets the fulfilling_system_cd value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param fulfilling_system_cd
     */
    public void setFulfilling_system_cd(java.lang.String fulfilling_system_cd) {
        this.fulfilling_system_cd = fulfilling_system_cd;
    }


    /**
     * Gets the line_no value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return line_no
     */
    public int getLine_no() {
        return line_no;
    }


    /**
     * Sets the line_no value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param line_no
     */
    public void setLine_no(int line_no) {
        this.line_no = line_no;
    }


    /**
     * Gets the requesting_system_line_no value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return requesting_system_line_no
     */
    public int getRequesting_system_line_no() {
        return requesting_system_line_no;
    }


    /**
     * Sets the requesting_system_line_no value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param requesting_system_line_no
     */
    public void setRequesting_system_line_no(int requesting_system_line_no) {
        this.requesting_system_line_no = requesting_system_line_no;
    }


    /**
     * Gets the status_date value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return status_date
     */
    public java.lang.String getStatus_date() {
        return status_date;
    }


    /**
     * Sets the status_date value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param status_date
     */
    public void setStatus_date(java.lang.String status_date) {
        this.status_date = status_date;
    }


    /**
     * Gets the item_status_reason_code value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return item_status_reason_code
     */
    public java.lang.String getItem_status_reason_code() {
        return item_status_reason_code;
    }


    /**
     * Sets the item_status_reason_code value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param item_status_reason_code
     */
    public void setItem_status_reason_code(java.lang.String item_status_reason_code) {
        this.item_status_reason_code = item_status_reason_code;
    }


    /**
     * Gets the item_status_reason_note value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @return item_status_reason_note
     */
    public java.lang.String getItem_status_reason_note() {
        return item_status_reason_note;
    }


    /**
     * Sets the item_status_reason_note value for this StatusUpdateRequestMessageItemTypeBean.
     * 
     * @param item_status_reason_note
     */
    public void setItem_status_reason_note(java.lang.String item_status_reason_note) {
        this.item_status_reason_note = item_status_reason_note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusUpdateRequestMessageItemTypeBean)) return false;
        StatusUpdateRequestMessageItemTypeBean other = (StatusUpdateRequestMessageItemTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ship_to==null && other.getShip_to()==null) || 
             (this.ship_to!=null &&
              this.ship_to.equals(other.getShip_to()))) &&
            ((this.item_id==null && other.getItem_id()==null) || 
             (this.item_id!=null &&
              this.item_id.equals(other.getItem_id()))) &&
            this.item_qty == other.getItem_qty() &&
            ((this.shipping_agent==null && other.getShipping_agent()==null) || 
             (this.shipping_agent!=null &&
              this.shipping_agent.equals(other.getShipping_agent()))) &&
            ((this.tracking_number==null && other.getTracking_number()==null) || 
             (this.tracking_number!=null &&
              this.tracking_number.equals(other.getTracking_number()))) &&
            ((this.item_status==null && other.getItem_status()==null) || 
             (this.item_status!=null &&
              this.item_status.equals(other.getItem_status()))) &&
            ((this.fulfilling_location_cd==null && other.getFulfilling_location_cd()==null) || 
             (this.fulfilling_location_cd!=null &&
              this.fulfilling_location_cd.equals(other.getFulfilling_location_cd()))) &&
            ((this.fulfilling_system_cd==null && other.getFulfilling_system_cd()==null) || 
             (this.fulfilling_system_cd!=null &&
              this.fulfilling_system_cd.equals(other.getFulfilling_system_cd()))) &&
            this.line_no == other.getLine_no() &&
            this.requesting_system_line_no == other.getRequesting_system_line_no() &&
            ((this.status_date==null && other.getStatus_date()==null) || 
             (this.status_date!=null &&
              this.status_date.equals(other.getStatus_date()))) &&
            ((this.item_status_reason_code==null && other.getItem_status_reason_code()==null) || 
             (this.item_status_reason_code!=null &&
              this.item_status_reason_code.equals(other.getItem_status_reason_code()))) &&
            ((this.item_status_reason_note==null && other.getItem_status_reason_note()==null) || 
             (this.item_status_reason_note!=null &&
              this.item_status_reason_note.equals(other.getItem_status_reason_note())));
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
        if (getShip_to() != null) {
            _hashCode += getShip_to().hashCode();
        }
        if (getItem_id() != null) {
            _hashCode += getItem_id().hashCode();
        }
        _hashCode += getItem_qty();
        if (getShipping_agent() != null) {
            _hashCode += getShipping_agent().hashCode();
        }
        if (getTracking_number() != null) {
            _hashCode += getTracking_number().hashCode();
        }
        if (getItem_status() != null) {
            _hashCode += getItem_status().hashCode();
        }
        if (getFulfilling_location_cd() != null) {
            _hashCode += getFulfilling_location_cd().hashCode();
        }
        if (getFulfilling_system_cd() != null) {
            _hashCode += getFulfilling_system_cd().hashCode();
        }
        _hashCode += getLine_no();
        _hashCode += getRequesting_system_line_no();
        if (getStatus_date() != null) {
            _hashCode += getStatus_date().hashCode();
        }
        if (getItem_status_reason_code() != null) {
            _hashCode += getItem_status_reason_code().hashCode();
        }
        if (getItem_status_reason_note() != null) {
            _hashCode += getItem_status_reason_note().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusUpdateRequestMessageItemTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageItemTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_qty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_qty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shipping_agent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "shipping_agent"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tracking_number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tracking_number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfilling_location_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fulfilling_location_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfilling_system_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fulfilling_system_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requesting_system_line_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "requesting_system_line_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status_date");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status_date"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_status_reason_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_status_reason_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_status_reason_note");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_status_reason_note"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ship_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "customerTypeBean"));
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
