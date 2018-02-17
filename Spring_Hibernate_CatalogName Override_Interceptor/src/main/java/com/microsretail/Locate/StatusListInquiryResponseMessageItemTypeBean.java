/**
 * StatusListInquiryResponseMessageItemTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusListInquiryResponseMessageItemTypeBean  implements java.io.Serializable {
    private com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations;

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

    private java.lang.String item_upc_cd;  // attribute

    private java.lang.String item_ean_cd;  // attribute

    private java.math.BigDecimal order_line_extended_freight;  // attribute

    private java.math.BigDecimal order_line_customization_charge;  // attribute

    private java.lang.String order_line_gift_wrap;  // attribute

    private java.lang.String order_line_ship_alone;  // attribute

    private java.math.BigDecimal order_line_ship_weight;  // attribute

    private java.lang.String order_line_message;  // attribute

    public StatusListInquiryResponseMessageItemTypeBean() {
    }

    public StatusListInquiryResponseMessageItemTypeBean(
           com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations,
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
           java.lang.String item_upc_cd,
           java.lang.String item_ean_cd,
           java.math.BigDecimal order_line_extended_freight,
           java.math.BigDecimal order_line_customization_charge,
           java.lang.String order_line_gift_wrap,
           java.lang.String order_line_ship_alone,
           java.math.BigDecimal order_line_ship_weight,
           java.lang.String order_line_message) {
           this.customizations = customizations;
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
           this.item_upc_cd = item_upc_cd;
           this.item_ean_cd = item_ean_cd;
           this.order_line_extended_freight = order_line_extended_freight;
           this.order_line_customization_charge = order_line_customization_charge;
           this.order_line_gift_wrap = order_line_gift_wrap;
           this.order_line_ship_alone = order_line_ship_alone;
           this.order_line_ship_weight = order_line_ship_weight;
           this.order_line_message = order_line_message;
    }


    /**
     * Gets the customizations value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return customizations
     */
    public com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] getCustomizations() {
        return customizations;
    }


    /**
     * Sets the customizations value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param customizations
     */
    public void setCustomizations(com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations) {
        this.customizations = customizations;
    }


    /**
     * Gets the item_id value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the item_qty value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return item_qty
     */
    public int getItem_qty() {
        return item_qty;
    }


    /**
     * Sets the item_qty value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param item_qty
     */
    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }


    /**
     * Gets the shipping_agent value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return shipping_agent
     */
    public java.lang.String getShipping_agent() {
        return shipping_agent;
    }


    /**
     * Sets the shipping_agent value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param shipping_agent
     */
    public void setShipping_agent(java.lang.String shipping_agent) {
        this.shipping_agent = shipping_agent;
    }


    /**
     * Gets the tracking_number value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return tracking_number
     */
    public java.lang.String getTracking_number() {
        return tracking_number;
    }


    /**
     * Sets the tracking_number value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param tracking_number
     */
    public void setTracking_number(java.lang.String tracking_number) {
        this.tracking_number = tracking_number;
    }


    /**
     * Gets the item_status value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return item_status
     */
    public java.lang.String getItem_status() {
        return item_status;
    }


    /**
     * Sets the item_status value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param item_status
     */
    public void setItem_status(java.lang.String item_status) {
        this.item_status = item_status;
    }


    /**
     * Gets the fulfilling_location_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return fulfilling_location_cd
     */
    public java.lang.String getFulfilling_location_cd() {
        return fulfilling_location_cd;
    }


    /**
     * Sets the fulfilling_location_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param fulfilling_location_cd
     */
    public void setFulfilling_location_cd(java.lang.String fulfilling_location_cd) {
        this.fulfilling_location_cd = fulfilling_location_cd;
    }


    /**
     * Gets the fulfilling_system_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return fulfilling_system_cd
     */
    public java.lang.String getFulfilling_system_cd() {
        return fulfilling_system_cd;
    }


    /**
     * Sets the fulfilling_system_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param fulfilling_system_cd
     */
    public void setFulfilling_system_cd(java.lang.String fulfilling_system_cd) {
        this.fulfilling_system_cd = fulfilling_system_cd;
    }


    /**
     * Gets the line_no value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return line_no
     */
    public int getLine_no() {
        return line_no;
    }


    /**
     * Sets the line_no value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param line_no
     */
    public void setLine_no(int line_no) {
        this.line_no = line_no;
    }


    /**
     * Gets the requesting_system_line_no value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return requesting_system_line_no
     */
    public int getRequesting_system_line_no() {
        return requesting_system_line_no;
    }


    /**
     * Sets the requesting_system_line_no value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param requesting_system_line_no
     */
    public void setRequesting_system_line_no(int requesting_system_line_no) {
        this.requesting_system_line_no = requesting_system_line_no;
    }


    /**
     * Gets the status_date value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return status_date
     */
    public java.lang.String getStatus_date() {
        return status_date;
    }


    /**
     * Sets the status_date value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param status_date
     */
    public void setStatus_date(java.lang.String status_date) {
        this.status_date = status_date;
    }


    /**
     * Gets the item_upc_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return item_upc_cd
     */
    public java.lang.String getItem_upc_cd() {
        return item_upc_cd;
    }


    /**
     * Sets the item_upc_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param item_upc_cd
     */
    public void setItem_upc_cd(java.lang.String item_upc_cd) {
        this.item_upc_cd = item_upc_cd;
    }


    /**
     * Gets the item_ean_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return item_ean_cd
     */
    public java.lang.String getItem_ean_cd() {
        return item_ean_cd;
    }


    /**
     * Sets the item_ean_cd value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param item_ean_cd
     */
    public void setItem_ean_cd(java.lang.String item_ean_cd) {
        this.item_ean_cd = item_ean_cd;
    }


    /**
     * Gets the order_line_extended_freight value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return order_line_extended_freight
     */
    public java.math.BigDecimal getOrder_line_extended_freight() {
        return order_line_extended_freight;
    }


    /**
     * Sets the order_line_extended_freight value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param order_line_extended_freight
     */
    public void setOrder_line_extended_freight(java.math.BigDecimal order_line_extended_freight) {
        this.order_line_extended_freight = order_line_extended_freight;
    }


    /**
     * Gets the order_line_customization_charge value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return order_line_customization_charge
     */
    public java.math.BigDecimal getOrder_line_customization_charge() {
        return order_line_customization_charge;
    }


    /**
     * Sets the order_line_customization_charge value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param order_line_customization_charge
     */
    public void setOrder_line_customization_charge(java.math.BigDecimal order_line_customization_charge) {
        this.order_line_customization_charge = order_line_customization_charge;
    }


    /**
     * Gets the order_line_gift_wrap value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return order_line_gift_wrap
     */
    public java.lang.String getOrder_line_gift_wrap() {
        return order_line_gift_wrap;
    }


    /**
     * Sets the order_line_gift_wrap value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param order_line_gift_wrap
     */
    public void setOrder_line_gift_wrap(java.lang.String order_line_gift_wrap) {
        this.order_line_gift_wrap = order_line_gift_wrap;
    }


    /**
     * Gets the order_line_ship_alone value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return order_line_ship_alone
     */
    public java.lang.String getOrder_line_ship_alone() {
        return order_line_ship_alone;
    }


    /**
     * Sets the order_line_ship_alone value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param order_line_ship_alone
     */
    public void setOrder_line_ship_alone(java.lang.String order_line_ship_alone) {
        this.order_line_ship_alone = order_line_ship_alone;
    }


    /**
     * Gets the order_line_ship_weight value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return order_line_ship_weight
     */
    public java.math.BigDecimal getOrder_line_ship_weight() {
        return order_line_ship_weight;
    }


    /**
     * Sets the order_line_ship_weight value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param order_line_ship_weight
     */
    public void setOrder_line_ship_weight(java.math.BigDecimal order_line_ship_weight) {
        this.order_line_ship_weight = order_line_ship_weight;
    }


    /**
     * Gets the order_line_message value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @return order_line_message
     */
    public java.lang.String getOrder_line_message() {
        return order_line_message;
    }


    /**
     * Sets the order_line_message value for this StatusListInquiryResponseMessageItemTypeBean.
     * 
     * @param order_line_message
     */
    public void setOrder_line_message(java.lang.String order_line_message) {
        this.order_line_message = order_line_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusListInquiryResponseMessageItemTypeBean)) return false;
        StatusListInquiryResponseMessageItemTypeBean other = (StatusListInquiryResponseMessageItemTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customizations==null && other.getCustomizations()==null) || 
             (this.customizations!=null &&
              java.util.Arrays.equals(this.customizations, other.getCustomizations()))) &&
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
            ((this.item_upc_cd==null && other.getItem_upc_cd()==null) || 
             (this.item_upc_cd!=null &&
              this.item_upc_cd.equals(other.getItem_upc_cd()))) &&
            ((this.item_ean_cd==null && other.getItem_ean_cd()==null) || 
             (this.item_ean_cd!=null &&
              this.item_ean_cd.equals(other.getItem_ean_cd()))) &&
            ((this.order_line_extended_freight==null && other.getOrder_line_extended_freight()==null) || 
             (this.order_line_extended_freight!=null &&
              this.order_line_extended_freight.equals(other.getOrder_line_extended_freight()))) &&
            ((this.order_line_customization_charge==null && other.getOrder_line_customization_charge()==null) || 
             (this.order_line_customization_charge!=null &&
              this.order_line_customization_charge.equals(other.getOrder_line_customization_charge()))) &&
            ((this.order_line_gift_wrap==null && other.getOrder_line_gift_wrap()==null) || 
             (this.order_line_gift_wrap!=null &&
              this.order_line_gift_wrap.equals(other.getOrder_line_gift_wrap()))) &&
            ((this.order_line_ship_alone==null && other.getOrder_line_ship_alone()==null) || 
             (this.order_line_ship_alone!=null &&
              this.order_line_ship_alone.equals(other.getOrder_line_ship_alone()))) &&
            ((this.order_line_ship_weight==null && other.getOrder_line_ship_weight()==null) || 
             (this.order_line_ship_weight!=null &&
              this.order_line_ship_weight.equals(other.getOrder_line_ship_weight()))) &&
            ((this.order_line_message==null && other.getOrder_line_message()==null) || 
             (this.order_line_message!=null &&
              this.order_line_message.equals(other.getOrder_line_message())));
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
        if (getCustomizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getItem_upc_cd() != null) {
            _hashCode += getItem_upc_cd().hashCode();
        }
        if (getItem_ean_cd() != null) {
            _hashCode += getItem_ean_cd().hashCode();
        }
        if (getOrder_line_extended_freight() != null) {
            _hashCode += getOrder_line_extended_freight().hashCode();
        }
        if (getOrder_line_customization_charge() != null) {
            _hashCode += getOrder_line_customization_charge().hashCode();
        }
        if (getOrder_line_gift_wrap() != null) {
            _hashCode += getOrder_line_gift_wrap().hashCode();
        }
        if (getOrder_line_ship_alone() != null) {
            _hashCode += getOrder_line_ship_alone().hashCode();
        }
        if (getOrder_line_ship_weight() != null) {
            _hashCode += getOrder_line_ship_weight().hashCode();
        }
        if (getOrder_line_message() != null) {
            _hashCode += getOrder_line_message().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusListInquiryResponseMessageItemTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageItemTypeBean"));
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
        attrField.setFieldName("item_upc_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_upc_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("item_ean_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "item_ean_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_line_extended_freight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_line_extended_freight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_line_customization_charge");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_line_customization_charge"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_line_gift_wrap");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_line_gift_wrap"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_line_ship_alone");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_line_ship_alone"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_line_ship_weight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_line_ship_weight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_line_message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_line_message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "DSSalesOrderCustomizationTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "customization"));
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
