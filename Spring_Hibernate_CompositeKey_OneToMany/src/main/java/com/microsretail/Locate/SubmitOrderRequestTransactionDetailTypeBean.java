/**
 * SubmitOrderRequestTransactionDetailTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SubmitOrderRequestTransactionDetailTypeBean  implements java.io.Serializable {
    private java.lang.String location_cd;

    private java.lang.String system_cd;

    private java.lang.String item_id;

    private int qty;

    private java.lang.String unit_price;

    private com.microsretail.Locate.CustomerTypeBean ship_to;

    private com.microsretail.Locate.TaxTypeBean[] taxes;

    private java.lang.String line_item_status;

    private java.lang.String special_instructions;

    private java.lang.String shipping_agent;

    private java.lang.String tracking_number;

    private java.lang.String item_upc_cd;

    private java.lang.String item_ean_cd;

    private java.math.BigDecimal order_line_extended_freight;

    private java.math.BigDecimal order_line_customization_charge;

    private java.lang.String order_line_gift_wrap;

    private java.lang.String order_line_ship_alone;

    private java.math.BigDecimal order_line_ship_weight;

    private java.lang.String order_line_message;

    private com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations;

    private java.lang.String line_item_no;  // attribute

    public SubmitOrderRequestTransactionDetailTypeBean() {
    }

    public SubmitOrderRequestTransactionDetailTypeBean(
           java.lang.String location_cd,
           java.lang.String system_cd,
           java.lang.String item_id,
           int qty,
           java.lang.String unit_price,
           com.microsretail.Locate.CustomerTypeBean ship_to,
           com.microsretail.Locate.TaxTypeBean[] taxes,
           java.lang.String line_item_status,
           java.lang.String special_instructions,
           java.lang.String shipping_agent,
           java.lang.String tracking_number,
           java.lang.String item_upc_cd,
           java.lang.String item_ean_cd,
           java.math.BigDecimal order_line_extended_freight,
           java.math.BigDecimal order_line_customization_charge,
           java.lang.String order_line_gift_wrap,
           java.lang.String order_line_ship_alone,
           java.math.BigDecimal order_line_ship_weight,
           java.lang.String order_line_message,
           com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations,
           java.lang.String line_item_no) {
           this.location_cd = location_cd;
           this.system_cd = system_cd;
           this.item_id = item_id;
           this.qty = qty;
           this.unit_price = unit_price;
           this.ship_to = ship_to;
           this.taxes = taxes;
           this.line_item_status = line_item_status;
           this.special_instructions = special_instructions;
           this.shipping_agent = shipping_agent;
           this.tracking_number = tracking_number;
           this.item_upc_cd = item_upc_cd;
           this.item_ean_cd = item_ean_cd;
           this.order_line_extended_freight = order_line_extended_freight;
           this.order_line_customization_charge = order_line_customization_charge;
           this.order_line_gift_wrap = order_line_gift_wrap;
           this.order_line_ship_alone = order_line_ship_alone;
           this.order_line_ship_weight = order_line_ship_weight;
           this.order_line_message = order_line_message;
           this.customizations = customizations;
           this.line_item_no = line_item_no;
    }


    /**
     * Gets the location_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return location_cd
     */
    public java.lang.String getLocation_cd() {
        return location_cd;
    }


    /**
     * Sets the location_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param location_cd
     */
    public void setLocation_cd(java.lang.String location_cd) {
        this.location_cd = location_cd;
    }


    /**
     * Gets the system_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return system_cd
     */
    public java.lang.String getSystem_cd() {
        return system_cd;
    }


    /**
     * Sets the system_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param system_cd
     */
    public void setSystem_cd(java.lang.String system_cd) {
        this.system_cd = system_cd;
    }


    /**
     * Gets the item_id value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the qty value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return qty
     */
    public int getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }


    /**
     * Gets the unit_price value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return unit_price
     */
    public java.lang.String getUnit_price() {
        return unit_price;
    }


    /**
     * Sets the unit_price value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param unit_price
     */
    public void setUnit_price(java.lang.String unit_price) {
        this.unit_price = unit_price;
    }


    /**
     * Gets the ship_to value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return ship_to
     */
    public com.microsretail.Locate.CustomerTypeBean getShip_to() {
        return ship_to;
    }


    /**
     * Sets the ship_to value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param ship_to
     */
    public void setShip_to(com.microsretail.Locate.CustomerTypeBean ship_to) {
        this.ship_to = ship_to;
    }


    /**
     * Gets the taxes value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return taxes
     */
    public com.microsretail.Locate.TaxTypeBean[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param taxes
     */
    public void setTaxes(com.microsretail.Locate.TaxTypeBean[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the line_item_status value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return line_item_status
     */
    public java.lang.String getLine_item_status() {
        return line_item_status;
    }


    /**
     * Sets the line_item_status value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param line_item_status
     */
    public void setLine_item_status(java.lang.String line_item_status) {
        this.line_item_status = line_item_status;
    }


    /**
     * Gets the special_instructions value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return special_instructions
     */
    public java.lang.String getSpecial_instructions() {
        return special_instructions;
    }


    /**
     * Sets the special_instructions value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param special_instructions
     */
    public void setSpecial_instructions(java.lang.String special_instructions) {
        this.special_instructions = special_instructions;
    }


    /**
     * Gets the shipping_agent value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return shipping_agent
     */
    public java.lang.String getShipping_agent() {
        return shipping_agent;
    }


    /**
     * Sets the shipping_agent value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param shipping_agent
     */
    public void setShipping_agent(java.lang.String shipping_agent) {
        this.shipping_agent = shipping_agent;
    }


    /**
     * Gets the tracking_number value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return tracking_number
     */
    public java.lang.String getTracking_number() {
        return tracking_number;
    }


    /**
     * Sets the tracking_number value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param tracking_number
     */
    public void setTracking_number(java.lang.String tracking_number) {
        this.tracking_number = tracking_number;
    }


    /**
     * Gets the item_upc_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return item_upc_cd
     */
    public java.lang.String getItem_upc_cd() {
        return item_upc_cd;
    }


    /**
     * Sets the item_upc_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param item_upc_cd
     */
    public void setItem_upc_cd(java.lang.String item_upc_cd) {
        this.item_upc_cd = item_upc_cd;
    }


    /**
     * Gets the item_ean_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return item_ean_cd
     */
    public java.lang.String getItem_ean_cd() {
        return item_ean_cd;
    }


    /**
     * Sets the item_ean_cd value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param item_ean_cd
     */
    public void setItem_ean_cd(java.lang.String item_ean_cd) {
        this.item_ean_cd = item_ean_cd;
    }


    /**
     * Gets the order_line_extended_freight value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return order_line_extended_freight
     */
    public java.math.BigDecimal getOrder_line_extended_freight() {
        return order_line_extended_freight;
    }


    /**
     * Sets the order_line_extended_freight value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param order_line_extended_freight
     */
    public void setOrder_line_extended_freight(java.math.BigDecimal order_line_extended_freight) {
        this.order_line_extended_freight = order_line_extended_freight;
    }


    /**
     * Gets the order_line_customization_charge value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return order_line_customization_charge
     */
    public java.math.BigDecimal getOrder_line_customization_charge() {
        return order_line_customization_charge;
    }


    /**
     * Sets the order_line_customization_charge value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param order_line_customization_charge
     */
    public void setOrder_line_customization_charge(java.math.BigDecimal order_line_customization_charge) {
        this.order_line_customization_charge = order_line_customization_charge;
    }


    /**
     * Gets the order_line_gift_wrap value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return order_line_gift_wrap
     */
    public java.lang.String getOrder_line_gift_wrap() {
        return order_line_gift_wrap;
    }


    /**
     * Sets the order_line_gift_wrap value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param order_line_gift_wrap
     */
    public void setOrder_line_gift_wrap(java.lang.String order_line_gift_wrap) {
        this.order_line_gift_wrap = order_line_gift_wrap;
    }


    /**
     * Gets the order_line_ship_alone value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return order_line_ship_alone
     */
    public java.lang.String getOrder_line_ship_alone() {
        return order_line_ship_alone;
    }


    /**
     * Sets the order_line_ship_alone value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param order_line_ship_alone
     */
    public void setOrder_line_ship_alone(java.lang.String order_line_ship_alone) {
        this.order_line_ship_alone = order_line_ship_alone;
    }


    /**
     * Gets the order_line_ship_weight value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return order_line_ship_weight
     */
    public java.math.BigDecimal getOrder_line_ship_weight() {
        return order_line_ship_weight;
    }


    /**
     * Sets the order_line_ship_weight value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param order_line_ship_weight
     */
    public void setOrder_line_ship_weight(java.math.BigDecimal order_line_ship_weight) {
        this.order_line_ship_weight = order_line_ship_weight;
    }


    /**
     * Gets the order_line_message value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return order_line_message
     */
    public java.lang.String getOrder_line_message() {
        return order_line_message;
    }


    /**
     * Sets the order_line_message value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param order_line_message
     */
    public void setOrder_line_message(java.lang.String order_line_message) {
        this.order_line_message = order_line_message;
    }


    /**
     * Gets the customizations value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return customizations
     */
    public com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] getCustomizations() {
        return customizations;
    }


    /**
     * Sets the customizations value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param customizations
     */
    public void setCustomizations(com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations) {
        this.customizations = customizations;
    }


    /**
     * Gets the line_item_no value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @return line_item_no
     */
    public java.lang.String getLine_item_no() {
        return line_item_no;
    }


    /**
     * Sets the line_item_no value for this SubmitOrderRequestTransactionDetailTypeBean.
     * 
     * @param line_item_no
     */
    public void setLine_item_no(java.lang.String line_item_no) {
        this.line_item_no = line_item_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitOrderRequestTransactionDetailTypeBean)) return false;
        SubmitOrderRequestTransactionDetailTypeBean other = (SubmitOrderRequestTransactionDetailTypeBean) obj;
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
            ((this.item_id==null && other.getItem_id()==null) || 
             (this.item_id!=null &&
              this.item_id.equals(other.getItem_id()))) &&
            this.qty == other.getQty() &&
            ((this.unit_price==null && other.getUnit_price()==null) || 
             (this.unit_price!=null &&
              this.unit_price.equals(other.getUnit_price()))) &&
            ((this.ship_to==null && other.getShip_to()==null) || 
             (this.ship_to!=null &&
              this.ship_to.equals(other.getShip_to()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.line_item_status==null && other.getLine_item_status()==null) || 
             (this.line_item_status!=null &&
              this.line_item_status.equals(other.getLine_item_status()))) &&
            ((this.special_instructions==null && other.getSpecial_instructions()==null) || 
             (this.special_instructions!=null &&
              this.special_instructions.equals(other.getSpecial_instructions()))) &&
            ((this.shipping_agent==null && other.getShipping_agent()==null) || 
             (this.shipping_agent!=null &&
              this.shipping_agent.equals(other.getShipping_agent()))) &&
            ((this.tracking_number==null && other.getTracking_number()==null) || 
             (this.tracking_number!=null &&
              this.tracking_number.equals(other.getTracking_number()))) &&
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
              this.order_line_message.equals(other.getOrder_line_message()))) &&
            ((this.customizations==null && other.getCustomizations()==null) || 
             (this.customizations!=null &&
              java.util.Arrays.equals(this.customizations, other.getCustomizations()))) &&
            ((this.line_item_no==null && other.getLine_item_no()==null) || 
             (this.line_item_no!=null &&
              this.line_item_no.equals(other.getLine_item_no())));
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
        if (getItem_id() != null) {
            _hashCode += getItem_id().hashCode();
        }
        _hashCode += getQty();
        if (getUnit_price() != null) {
            _hashCode += getUnit_price().hashCode();
        }
        if (getShip_to() != null) {
            _hashCode += getShip_to().hashCode();
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLine_item_status() != null) {
            _hashCode += getLine_item_status().hashCode();
        }
        if (getSpecial_instructions() != null) {
            _hashCode += getSpecial_instructions().hashCode();
        }
        if (getShipping_agent() != null) {
            _hashCode += getShipping_agent().hashCode();
        }
        if (getTracking_number() != null) {
            _hashCode += getTracking_number().hashCode();
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
        if (getLine_item_no() != null) {
            _hashCode += getLine_item_no().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitOrderRequestTransactionDetailTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestTransactionDetailTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_item_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_item_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "system_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit_price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ship_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "customerTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "TaxTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "tax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line_item_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line_item_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_instructions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "special_instructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_agent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_agent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tracking_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_upc_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_upc_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_ean_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_ean_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_line_extended_freight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_line_extended_freight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_line_customization_charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_line_customization_charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_line_gift_wrap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_line_gift_wrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_line_ship_alone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_line_ship_alone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_line_ship_weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_line_ship_weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_line_message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_line_message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
