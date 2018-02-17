/**
 * StatusListInquiryResponseMessageOrderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusListInquiryResponseMessageOrderTypeBean  implements java.io.Serializable {
    private int order_type;

    private com.microsretail.Locate.StatusListInquiryResponseMessageItemTypeBean[] items;

    private java.lang.String order_action_response;  // attribute

    private int request_id;  // attribute

    private java.lang.String order_id;  // attribute

    private java.lang.String order_status;  // attribute

    private java.lang.String originating_system_cd;  // attribute

    private java.lang.String originating_location_cd;  // attribute

    private java.lang.String originating_location_description;  // attribute

    private java.lang.String order_date;  // attribute

    private java.lang.String ref_transaction_no;  // attribute

    private java.lang.String under_review;  // attribute

    private java.math.BigDecimal order_additional_freight_charges;  // attribute

    private java.math.BigDecimal order_additional_charges;  // attribute

    private java.lang.String ship_complete;  // attribute

    private java.math.BigDecimal freight_tax;  // attribute

    private java.lang.String order_message;  // attribute

    private java.lang.String gift_message;  // attribute

    public StatusListInquiryResponseMessageOrderTypeBean() {
    }

    public StatusListInquiryResponseMessageOrderTypeBean(
           int order_type,
           com.microsretail.Locate.StatusListInquiryResponseMessageItemTypeBean[] items,
           java.lang.String order_action_response,
           int request_id,
           java.lang.String order_id,
           java.lang.String order_status,
           java.lang.String originating_system_cd,
           java.lang.String originating_location_cd,
           java.lang.String originating_location_description,
           java.lang.String order_date,
           java.lang.String ref_transaction_no,
           java.lang.String under_review,
           java.math.BigDecimal order_additional_freight_charges,
           java.math.BigDecimal order_additional_charges,
           java.lang.String ship_complete,
           java.math.BigDecimal freight_tax,
           java.lang.String order_message,
           java.lang.String gift_message) {
           this.order_type = order_type;
           this.items = items;
           this.order_action_response = order_action_response;
           this.request_id = request_id;
           this.order_id = order_id;
           this.order_status = order_status;
           this.originating_system_cd = originating_system_cd;
           this.originating_location_cd = originating_location_cd;
           this.originating_location_description = originating_location_description;
           this.order_date = order_date;
           this.ref_transaction_no = ref_transaction_no;
           this.under_review = under_review;
           this.order_additional_freight_charges = order_additional_freight_charges;
           this.order_additional_charges = order_additional_charges;
           this.ship_complete = ship_complete;
           this.freight_tax = freight_tax;
           this.order_message = order_message;
           this.gift_message = gift_message;
    }


    /**
     * Gets the order_type value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_type
     */
    public int getOrder_type() {
        return order_type;
    }


    /**
     * Sets the order_type value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_type
     */
    public void setOrder_type(int order_type) {
        this.order_type = order_type;
    }


    /**
     * Gets the items value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.StatusListInquiryResponseMessageItemTypeBean[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.StatusListInquiryResponseMessageItemTypeBean[] items) {
        this.items = items;
    }


    /**
     * Gets the order_action_response value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_action_response
     */
    public java.lang.String getOrder_action_response() {
        return order_action_response;
    }


    /**
     * Sets the order_action_response value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_action_response
     */
    public void setOrder_action_response(java.lang.String order_action_response) {
        this.order_action_response = order_action_response;
    }


    /**
     * Gets the request_id value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return request_id
     */
    public int getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the order_id value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the order_status value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the originating_system_cd value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return originating_system_cd
     */
    public java.lang.String getOriginating_system_cd() {
        return originating_system_cd;
    }


    /**
     * Sets the originating_system_cd value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param originating_system_cd
     */
    public void setOriginating_system_cd(java.lang.String originating_system_cd) {
        this.originating_system_cd = originating_system_cd;
    }


    /**
     * Gets the originating_location_cd value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return originating_location_cd
     */
    public java.lang.String getOriginating_location_cd() {
        return originating_location_cd;
    }


    /**
     * Sets the originating_location_cd value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param originating_location_cd
     */
    public void setOriginating_location_cd(java.lang.String originating_location_cd) {
        this.originating_location_cd = originating_location_cd;
    }


    /**
     * Gets the originating_location_description value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return originating_location_description
     */
    public java.lang.String getOriginating_location_description() {
        return originating_location_description;
    }


    /**
     * Sets the originating_location_description value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param originating_location_description
     */
    public void setOriginating_location_description(java.lang.String originating_location_description) {
        this.originating_location_description = originating_location_description;
    }


    /**
     * Gets the order_date value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_date
     */
    public java.lang.String getOrder_date() {
        return order_date;
    }


    /**
     * Sets the order_date value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_date
     */
    public void setOrder_date(java.lang.String order_date) {
        this.order_date = order_date;
    }


    /**
     * Gets the ref_transaction_no value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return ref_transaction_no
     */
    public java.lang.String getRef_transaction_no() {
        return ref_transaction_no;
    }


    /**
     * Sets the ref_transaction_no value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param ref_transaction_no
     */
    public void setRef_transaction_no(java.lang.String ref_transaction_no) {
        this.ref_transaction_no = ref_transaction_no;
    }


    /**
     * Gets the under_review value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return under_review
     */
    public java.lang.String getUnder_review() {
        return under_review;
    }


    /**
     * Sets the under_review value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param under_review
     */
    public void setUnder_review(java.lang.String under_review) {
        this.under_review = under_review;
    }


    /**
     * Gets the order_additional_freight_charges value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_additional_freight_charges
     */
    public java.math.BigDecimal getOrder_additional_freight_charges() {
        return order_additional_freight_charges;
    }


    /**
     * Sets the order_additional_freight_charges value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_additional_freight_charges
     */
    public void setOrder_additional_freight_charges(java.math.BigDecimal order_additional_freight_charges) {
        this.order_additional_freight_charges = order_additional_freight_charges;
    }


    /**
     * Gets the order_additional_charges value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_additional_charges
     */
    public java.math.BigDecimal getOrder_additional_charges() {
        return order_additional_charges;
    }


    /**
     * Sets the order_additional_charges value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_additional_charges
     */
    public void setOrder_additional_charges(java.math.BigDecimal order_additional_charges) {
        this.order_additional_charges = order_additional_charges;
    }


    /**
     * Gets the ship_complete value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return ship_complete
     */
    public java.lang.String getShip_complete() {
        return ship_complete;
    }


    /**
     * Sets the ship_complete value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param ship_complete
     */
    public void setShip_complete(java.lang.String ship_complete) {
        this.ship_complete = ship_complete;
    }


    /**
     * Gets the freight_tax value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return freight_tax
     */
    public java.math.BigDecimal getFreight_tax() {
        return freight_tax;
    }


    /**
     * Sets the freight_tax value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param freight_tax
     */
    public void setFreight_tax(java.math.BigDecimal freight_tax) {
        this.freight_tax = freight_tax;
    }


    /**
     * Gets the order_message value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_message
     */
    public java.lang.String getOrder_message() {
        return order_message;
    }


    /**
     * Sets the order_message value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_message
     */
    public void setOrder_message(java.lang.String order_message) {
        this.order_message = order_message;
    }


    /**
     * Gets the gift_message value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @return gift_message
     */
    public java.lang.String getGift_message() {
        return gift_message;
    }


    /**
     * Sets the gift_message value for this StatusListInquiryResponseMessageOrderTypeBean.
     * 
     * @param gift_message
     */
    public void setGift_message(java.lang.String gift_message) {
        this.gift_message = gift_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusListInquiryResponseMessageOrderTypeBean)) return false;
        StatusListInquiryResponseMessageOrderTypeBean other = (StatusListInquiryResponseMessageOrderTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.order_type == other.getOrder_type() &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.order_action_response==null && other.getOrder_action_response()==null) || 
             (this.order_action_response!=null &&
              this.order_action_response.equals(other.getOrder_action_response()))) &&
            this.request_id == other.getRequest_id() &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            ((this.originating_system_cd==null && other.getOriginating_system_cd()==null) || 
             (this.originating_system_cd!=null &&
              this.originating_system_cd.equals(other.getOriginating_system_cd()))) &&
            ((this.originating_location_cd==null && other.getOriginating_location_cd()==null) || 
             (this.originating_location_cd!=null &&
              this.originating_location_cd.equals(other.getOriginating_location_cd()))) &&
            ((this.originating_location_description==null && other.getOriginating_location_description()==null) || 
             (this.originating_location_description!=null &&
              this.originating_location_description.equals(other.getOriginating_location_description()))) &&
            ((this.order_date==null && other.getOrder_date()==null) || 
             (this.order_date!=null &&
              this.order_date.equals(other.getOrder_date()))) &&
            ((this.ref_transaction_no==null && other.getRef_transaction_no()==null) || 
             (this.ref_transaction_no!=null &&
              this.ref_transaction_no.equals(other.getRef_transaction_no()))) &&
            ((this.under_review==null && other.getUnder_review()==null) || 
             (this.under_review!=null &&
              this.under_review.equals(other.getUnder_review()))) &&
            ((this.order_additional_freight_charges==null && other.getOrder_additional_freight_charges()==null) || 
             (this.order_additional_freight_charges!=null &&
              this.order_additional_freight_charges.equals(other.getOrder_additional_freight_charges()))) &&
            ((this.order_additional_charges==null && other.getOrder_additional_charges()==null) || 
             (this.order_additional_charges!=null &&
              this.order_additional_charges.equals(other.getOrder_additional_charges()))) &&
            ((this.ship_complete==null && other.getShip_complete()==null) || 
             (this.ship_complete!=null &&
              this.ship_complete.equals(other.getShip_complete()))) &&
            ((this.freight_tax==null && other.getFreight_tax()==null) || 
             (this.freight_tax!=null &&
              this.freight_tax.equals(other.getFreight_tax()))) &&
            ((this.order_message==null && other.getOrder_message()==null) || 
             (this.order_message!=null &&
              this.order_message.equals(other.getOrder_message()))) &&
            ((this.gift_message==null && other.getGift_message()==null) || 
             (this.gift_message!=null &&
              this.gift_message.equals(other.getGift_message())));
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
        _hashCode += getOrder_type();
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
        if (getOrder_action_response() != null) {
            _hashCode += getOrder_action_response().hashCode();
        }
        _hashCode += getRequest_id();
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        if (getOriginating_system_cd() != null) {
            _hashCode += getOriginating_system_cd().hashCode();
        }
        if (getOriginating_location_cd() != null) {
            _hashCode += getOriginating_location_cd().hashCode();
        }
        if (getOriginating_location_description() != null) {
            _hashCode += getOriginating_location_description().hashCode();
        }
        if (getOrder_date() != null) {
            _hashCode += getOrder_date().hashCode();
        }
        if (getRef_transaction_no() != null) {
            _hashCode += getRef_transaction_no().hashCode();
        }
        if (getUnder_review() != null) {
            _hashCode += getUnder_review().hashCode();
        }
        if (getOrder_additional_freight_charges() != null) {
            _hashCode += getOrder_additional_freight_charges().hashCode();
        }
        if (getOrder_additional_charges() != null) {
            _hashCode += getOrder_additional_charges().hashCode();
        }
        if (getShip_complete() != null) {
            _hashCode += getShip_complete().hashCode();
        }
        if (getFreight_tax() != null) {
            _hashCode += getFreight_tax().hashCode();
        }
        if (getOrder_message() != null) {
            _hashCode += getOrder_message().hashCode();
        }
        if (getGift_message() != null) {
            _hashCode += getGift_message().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusListInquiryResponseMessageOrderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageOrderTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_action_response");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_action_response"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        attrField.setFieldName("originating_system_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "originating_system_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originating_location_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "originating_location_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originating_location_description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "originating_location_description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_date");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_date"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ref_transaction_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ref_transaction_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("under_review");
        attrField.setXmlName(new javax.xml.namespace.QName("", "under_review"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_additional_freight_charges");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_additional_freight_charges"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_additional_charges");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_additional_charges"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ship_complete");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ship_complete"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("freight_tax");
        attrField.setXmlName(new javax.xml.namespace.QName("", "freight_tax"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("gift_message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "gift_message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageItemTypeBean"));
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
