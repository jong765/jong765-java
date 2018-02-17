/**
 * FulfillmentResponseMessageItemTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class FulfillmentResponseMessageItemTypeBean  implements java.io.Serializable {
    private java.lang.String location_cd;

    private java.lang.String system_cd;

    private java.lang.String item_id;

    private int qty;

    private double unit_price;

    private com.microsretail.Locate.CustomerTypeBean ship_to;

    private com.microsretail.Locate.TaxTypeBean[] taxes;

    private java.lang.String special_instructions;

    private java.lang.String item_upc_cd;

    private java.lang.String item_ean_cd;

    private java.math.BigDecimal order_line_extended_freight;

    private java.math.BigDecimal order_line_customization_charge;

    private java.lang.String order_line_gift_wrap;

    private java.lang.String order_line_ship_alone;

    private java.math.BigDecimal order_line_ship_weight;

    private java.lang.String order_line_message;

    private com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations;

    private java.lang.String requesting_system_line_no;  // attribute

    private java.lang.String line_item_status;  // attribute

    private int line_item_no;  // attribute

    public FulfillmentResponseMessageItemTypeBean() {
    }

    public FulfillmentResponseMessageItemTypeBean(
           java.lang.String location_cd,
           java.lang.String system_cd,
           java.lang.String item_id,
           int qty,
           double unit_price,
           com.microsretail.Locate.CustomerTypeBean ship_to,
           com.microsretail.Locate.TaxTypeBean[] taxes,
           java.lang.String special_instructions,
           java.lang.String item_upc_cd,
           java.lang.String item_ean_cd,
           java.math.BigDecimal order_line_extended_freight,
           java.math.BigDecimal order_line_customization_charge,
           java.lang.String order_line_gift_wrap,
           java.lang.String order_line_ship_alone,
           java.math.BigDecimal order_line_ship_weight,
           java.lang.String order_line_message,
           com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations,
           java.lang.String requesting_system_line_no,
           java.lang.String line_item_status,
           int line_item_no) {
           this.location_cd = location_cd;
           this.system_cd = system_cd;
           this.item_id = item_id;
           this.qty = qty;
           this.unit_price = unit_price;
           this.ship_to = ship_to;
           this.taxes = taxes;
           this.special_instructions = special_instructions;
           this.item_upc_cd = item_upc_cd;
           this.item_ean_cd = item_ean_cd;
           this.order_line_extended_freight = order_line_extended_freight;
           this.order_line_customization_charge = order_line_customization_charge;
           this.order_line_gift_wrap = order_line_gift_wrap;
           this.order_line_ship_alone = order_line_ship_alone;
           this.order_line_ship_weight = order_line_ship_weight;
           this.order_line_message = order_line_message;
           this.customizations = customizations;
           this.requesting_system_line_no = requesting_system_line_no;
           this.line_item_status = line_item_status;
           this.line_item_no = line_item_no;
    }


    /**
     * Gets the location_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return location_cd
     */
    public java.lang.String getLocation_cd() {
        return location_cd;
    }


    /**
     * Sets the location_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param location_cd
     */
    public void setLocation_cd(java.lang.String location_cd) {
        this.location_cd = location_cd;
    }


    /**
     * Gets the system_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return system_cd
     */
    public java.lang.String getSystem_cd() {
        return system_cd;
    }


    /**
     * Sets the system_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param system_cd
     */
    public void setSystem_cd(java.lang.String system_cd) {
        this.system_cd = system_cd;
    }


    /**
     * Gets the item_id value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the qty value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return qty
     */
    public int getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }


    /**
     * Gets the unit_price value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return unit_price
     */
    public double getUnit_price() {
        return unit_price;
    }


    /**
     * Sets the unit_price value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param unit_price
     */
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }


    /**
     * Gets the ship_to value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return ship_to
     */
    public com.microsretail.Locate.CustomerTypeBean getShip_to() {
        return ship_to;
    }


    /**
     * Sets the ship_to value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param ship_to
     */
    public void setShip_to(com.microsretail.Locate.CustomerTypeBean ship_to) {
        this.ship_to = ship_to;
    }


    /**
     * Gets the taxes value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return taxes
     */
    public com.microsretail.Locate.TaxTypeBean[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param taxes
     */
    public void setTaxes(com.microsretail.Locate.TaxTypeBean[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the special_instructions value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return special_instructions
     */
    public java.lang.String getSpecial_instructions() {
        return special_instructions;
    }


    /**
     * Sets the special_instructions value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param special_instructions
     */
    public void setSpecial_instructions(java.lang.String special_instructions) {
        this.special_instructions = special_instructions;
    }


    /**
     * Gets the item_upc_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return item_upc_cd
     */
    public java.lang.String getItem_upc_cd() {
        return item_upc_cd;
    }


    /**
     * Sets the item_upc_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param item_upc_cd
     */
    public void setItem_upc_cd(java.lang.String item_upc_cd) {
        this.item_upc_cd = item_upc_cd;
    }


    /**
     * Gets the item_ean_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return item_ean_cd
     */
    public java.lang.String getItem_ean_cd() {
        return item_ean_cd;
    }


    /**
     * Sets the item_ean_cd value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param item_ean_cd
     */
    public void setItem_ean_cd(java.lang.String item_ean_cd) {
        this.item_ean_cd = item_ean_cd;
    }


    /**
     * Gets the order_line_extended_freight value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return order_line_extended_freight
     */
    public java.math.BigDecimal getOrder_line_extended_freight() {
        return order_line_extended_freight;
    }


    /**
     * Sets the order_line_extended_freight value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param order_line_extended_freight
     */
    public void setOrder_line_extended_freight(java.math.BigDecimal order_line_extended_freight) {
        this.order_line_extended_freight = order_line_extended_freight;
    }


    /**
     * Gets the order_line_customization_charge value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return order_line_customization_charge
     */
    public java.math.BigDecimal getOrder_line_customization_charge() {
        return order_line_customization_charge;
    }


    /**
     * Sets the order_line_customization_charge value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param order_line_customization_charge
     */
    public void setOrder_line_customization_charge(java.math.BigDecimal order_line_customization_charge) {
        this.order_line_customization_charge = order_line_customization_charge;
    }


    /**
     * Gets the order_line_gift_wrap value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return order_line_gift_wrap
     */
    public java.lang.String getOrder_line_gift_wrap() {
        return order_line_gift_wrap;
    }


    /**
     * Sets the order_line_gift_wrap value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param order_line_gift_wrap
     */
    public void setOrder_line_gift_wrap(java.lang.String order_line_gift_wrap) {
        this.order_line_gift_wrap = order_line_gift_wrap;
    }


    /**
     * Gets the order_line_ship_alone value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return order_line_ship_alone
     */
    public java.lang.String getOrder_line_ship_alone() {
        return order_line_ship_alone;
    }


    /**
     * Sets the order_line_ship_alone value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param order_line_ship_alone
     */
    public void setOrder_line_ship_alone(java.lang.String order_line_ship_alone) {
        this.order_line_ship_alone = order_line_ship_alone;
    }


    /**
     * Gets the order_line_ship_weight value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return order_line_ship_weight
     */
    public java.math.BigDecimal getOrder_line_ship_weight() {
        return order_line_ship_weight;
    }


    /**
     * Sets the order_line_ship_weight value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param order_line_ship_weight
     */
    public void setOrder_line_ship_weight(java.math.BigDecimal order_line_ship_weight) {
        this.order_line_ship_weight = order_line_ship_weight;
    }


    /**
     * Gets the order_line_message value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return order_line_message
     */
    public java.lang.String getOrder_line_message() {
        return order_line_message;
    }


    /**
     * Sets the order_line_message value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param order_line_message
     */
    public void setOrder_line_message(java.lang.String order_line_message) {
        this.order_line_message = order_line_message;
    }


    /**
     * Gets the customizations value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return customizations
     */
    public com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] getCustomizations() {
        return customizations;
    }


    /**
     * Sets the customizations value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param customizations
     */
    public void setCustomizations(com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[] customizations) {
        this.customizations = customizations;
    }


    /**
     * Gets the requesting_system_line_no value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return requesting_system_line_no
     */
    public java.lang.String getRequesting_system_line_no() {
        return requesting_system_line_no;
    }


    /**
     * Sets the requesting_system_line_no value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param requesting_system_line_no
     */
    public void setRequesting_system_line_no(java.lang.String requesting_system_line_no) {
        this.requesting_system_line_no = requesting_system_line_no;
    }


    /**
     * Gets the line_item_status value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return line_item_status
     */
    public java.lang.String getLine_item_status() {
        return line_item_status;
    }


    /**
     * Sets the line_item_status value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param line_item_status
     */
    public void setLine_item_status(java.lang.String line_item_status) {
        this.line_item_status = line_item_status;
    }


    /**
     * Gets the line_item_no value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @return line_item_no
     */
    public int getLine_item_no() {
        return line_item_no;
    }


    /**
     * Sets the line_item_no value for this FulfillmentResponseMessageItemTypeBean.
     * 
     * @param line_item_no
     */
    public void setLine_item_no(int line_item_no) {
        this.line_item_no = line_item_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentResponseMessageItemTypeBean)) return false;
        FulfillmentResponseMessageItemTypeBean other = (FulfillmentResponseMessageItemTypeBean) obj;
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
            this.unit_price == other.getUnit_price() &&
            ((this.ship_to==null && other.getShip_to()==null) || 
             (this.ship_to!=null &&
              this.ship_to.equals(other.getShip_to()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.special_instructions==null && other.getSpecial_instructions()==null) || 
             (this.special_instructions!=null &&
              this.special_instructions.equals(other.getSpecial_instructions()))) &&
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
            ((this.requesting_system_line_no==null && other.getRequesting_system_line_no()==null) || 
             (this.requesting_system_line_no!=null &&
              this.requesting_system_line_no.equals(other.getRequesting_system_line_no()))) &&
            ((this.line_item_status==null && other.getLine_item_status()==null) || 
             (this.line_item_status!=null &&
              this.line_item_status.equals(other.getLine_item_status()))) &&
            this.line_item_no == other.getLine_item_no();
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
        _hashCode += new Double(getUnit_price()).hashCode();
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
        if (getSpecial_instructions() != null) {
            _hashCode += getSpecial_instructions().hashCode();
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
        if (getRequesting_system_line_no() != null) {
            _hashCode += getRequesting_system_line_no().hashCode();
        }
        if (getLine_item_status() != null) {
            _hashCode += getLine_item_status().hashCode();
        }
        _hashCode += getLine_item_no();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentResponseMessageItemTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageItemTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requesting_system_line_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "requesting_system_line_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_item_status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_item_status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("line_item_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "line_item_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "system_cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ship_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "customerTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "TaxTypeBean"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "tax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_instructions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "special_instructions"));
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
