/**
 * StatusInquiryResponseMessageOrderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusInquiryResponseMessageOrderTypeBean  implements java.io.Serializable {
    private int order_type;

    private com.microsretail.Locate.StatusInquiryResponseMessageItemTypeBean[] items;

    private com.microsretail.Locate.SoldToCustomerTypeBean sold_to_customer;

    private com.microsretail.Locate.TransactionTenderTypeBean[] transaction_tenders;

    private java.lang.String currency;  // attribute

    private java.lang.String ref_transaction_no;  // attribute

    private double balance_due;  // attribute

    private double freight;  // attribute

    private java.lang.String source_code;  // attribute

    private java.lang.String gift;  // attribute

    private java.lang.String ship_via_description;  // attribute

    private java.lang.String ship_via;  // attribute

    private java.lang.String special_instructions;  // attribute

    private double transaction_total;  // attribute

    private double transaction_tax;  // attribute

    private double transaction_subtotal;  // attribute

    private java.lang.String order_date;  // attribute

    private java.lang.String originating_location_description;  // attribute

    private java.lang.String originating_location_cd;  // attribute

    private java.lang.String originating_system_cd;  // attribute

    private java.lang.String order_status;  // attribute

    private java.lang.String order_id;  // attribute

    private int request_id;  // attribute

    private java.lang.String under_review;  // attribute

    private java.math.BigDecimal order_additional_freight_charges;  // attribute

    private java.math.BigDecimal order_additional_charges;  // attribute

    private java.lang.String ship_complete;  // attribute

    private java.math.BigDecimal freight_tax;  // attribute

    private java.lang.String order_message;  // attribute

    private java.lang.String gift_message;  // attribute

    public StatusInquiryResponseMessageOrderTypeBean() {
    }

    public StatusInquiryResponseMessageOrderTypeBean(
           int order_type,
           com.microsretail.Locate.StatusInquiryResponseMessageItemTypeBean[] items,
           com.microsretail.Locate.SoldToCustomerTypeBean sold_to_customer,
           com.microsretail.Locate.TransactionTenderTypeBean[] transaction_tenders,
           java.lang.String currency,
           java.lang.String ref_transaction_no,
           double balance_due,
           double freight,
           java.lang.String source_code,
           java.lang.String gift,
           java.lang.String ship_via_description,
           java.lang.String ship_via,
           java.lang.String special_instructions,
           double transaction_total,
           double transaction_tax,
           double transaction_subtotal,
           java.lang.String order_date,
           java.lang.String originating_location_description,
           java.lang.String originating_location_cd,
           java.lang.String originating_system_cd,
           java.lang.String order_status,
           java.lang.String order_id,
           int request_id,
           java.lang.String under_review,
           java.math.BigDecimal order_additional_freight_charges,
           java.math.BigDecimal order_additional_charges,
           java.lang.String ship_complete,
           java.math.BigDecimal freight_tax,
           java.lang.String order_message,
           java.lang.String gift_message) {
           this.order_type = order_type;
           this.items = items;
           this.sold_to_customer = sold_to_customer;
           this.transaction_tenders = transaction_tenders;
           this.currency = currency;
           this.ref_transaction_no = ref_transaction_no;
           this.balance_due = balance_due;
           this.freight = freight;
           this.source_code = source_code;
           this.gift = gift;
           this.ship_via_description = ship_via_description;
           this.ship_via = ship_via;
           this.special_instructions = special_instructions;
           this.transaction_total = transaction_total;
           this.transaction_tax = transaction_tax;
           this.transaction_subtotal = transaction_subtotal;
           this.order_date = order_date;
           this.originating_location_description = originating_location_description;
           this.originating_location_cd = originating_location_cd;
           this.originating_system_cd = originating_system_cd;
           this.order_status = order_status;
           this.order_id = order_id;
           this.request_id = request_id;
           this.under_review = under_review;
           this.order_additional_freight_charges = order_additional_freight_charges;
           this.order_additional_charges = order_additional_charges;
           this.ship_complete = ship_complete;
           this.freight_tax = freight_tax;
           this.order_message = order_message;
           this.gift_message = gift_message;
    }


    /**
     * Gets the order_type value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_type
     */
    public int getOrder_type() {
        return order_type;
    }


    /**
     * Sets the order_type value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_type
     */
    public void setOrder_type(int order_type) {
        this.order_type = order_type;
    }


    /**
     * Gets the items value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return items
     */
    public com.microsretail.Locate.StatusInquiryResponseMessageItemTypeBean[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param items
     */
    public void setItems(com.microsretail.Locate.StatusInquiryResponseMessageItemTypeBean[] items) {
        this.items = items;
    }


    /**
     * Gets the sold_to_customer value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return sold_to_customer
     */
    public com.microsretail.Locate.SoldToCustomerTypeBean getSold_to_customer() {
        return sold_to_customer;
    }


    /**
     * Sets the sold_to_customer value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param sold_to_customer
     */
    public void setSold_to_customer(com.microsretail.Locate.SoldToCustomerTypeBean sold_to_customer) {
        this.sold_to_customer = sold_to_customer;
    }


    /**
     * Gets the transaction_tenders value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return transaction_tenders
     */
    public com.microsretail.Locate.TransactionTenderTypeBean[] getTransaction_tenders() {
        return transaction_tenders;
    }


    /**
     * Sets the transaction_tenders value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param transaction_tenders
     */
    public void setTransaction_tenders(com.microsretail.Locate.TransactionTenderTypeBean[] transaction_tenders) {
        this.transaction_tenders = transaction_tenders;
    }


    /**
     * Gets the currency value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the ref_transaction_no value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return ref_transaction_no
     */
    public java.lang.String getRef_transaction_no() {
        return ref_transaction_no;
    }


    /**
     * Sets the ref_transaction_no value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param ref_transaction_no
     */
    public void setRef_transaction_no(java.lang.String ref_transaction_no) {
        this.ref_transaction_no = ref_transaction_no;
    }


    /**
     * Gets the balance_due value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return balance_due
     */
    public double getBalance_due() {
        return balance_due;
    }


    /**
     * Sets the balance_due value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param balance_due
     */
    public void setBalance_due(double balance_due) {
        this.balance_due = balance_due;
    }


    /**
     * Gets the freight value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return freight
     */
    public double getFreight() {
        return freight;
    }


    /**
     * Sets the freight value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param freight
     */
    public void setFreight(double freight) {
        this.freight = freight;
    }


    /**
     * Gets the source_code value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return source_code
     */
    public java.lang.String getSource_code() {
        return source_code;
    }


    /**
     * Sets the source_code value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param source_code
     */
    public void setSource_code(java.lang.String source_code) {
        this.source_code = source_code;
    }


    /**
     * Gets the gift value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return gift
     */
    public java.lang.String getGift() {
        return gift;
    }


    /**
     * Sets the gift value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param gift
     */
    public void setGift(java.lang.String gift) {
        this.gift = gift;
    }


    /**
     * Gets the ship_via_description value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return ship_via_description
     */
    public java.lang.String getShip_via_description() {
        return ship_via_description;
    }


    /**
     * Sets the ship_via_description value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param ship_via_description
     */
    public void setShip_via_description(java.lang.String ship_via_description) {
        this.ship_via_description = ship_via_description;
    }


    /**
     * Gets the ship_via value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return ship_via
     */
    public java.lang.String getShip_via() {
        return ship_via;
    }


    /**
     * Sets the ship_via value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param ship_via
     */
    public void setShip_via(java.lang.String ship_via) {
        this.ship_via = ship_via;
    }


    /**
     * Gets the special_instructions value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return special_instructions
     */
    public java.lang.String getSpecial_instructions() {
        return special_instructions;
    }


    /**
     * Sets the special_instructions value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param special_instructions
     */
    public void setSpecial_instructions(java.lang.String special_instructions) {
        this.special_instructions = special_instructions;
    }


    /**
     * Gets the transaction_total value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return transaction_total
     */
    public double getTransaction_total() {
        return transaction_total;
    }


    /**
     * Sets the transaction_total value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param transaction_total
     */
    public void setTransaction_total(double transaction_total) {
        this.transaction_total = transaction_total;
    }


    /**
     * Gets the transaction_tax value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return transaction_tax
     */
    public double getTransaction_tax() {
        return transaction_tax;
    }


    /**
     * Sets the transaction_tax value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param transaction_tax
     */
    public void setTransaction_tax(double transaction_tax) {
        this.transaction_tax = transaction_tax;
    }


    /**
     * Gets the transaction_subtotal value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return transaction_subtotal
     */
    public double getTransaction_subtotal() {
        return transaction_subtotal;
    }


    /**
     * Sets the transaction_subtotal value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param transaction_subtotal
     */
    public void setTransaction_subtotal(double transaction_subtotal) {
        this.transaction_subtotal = transaction_subtotal;
    }


    /**
     * Gets the order_date value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_date
     */
    public java.lang.String getOrder_date() {
        return order_date;
    }


    /**
     * Sets the order_date value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_date
     */
    public void setOrder_date(java.lang.String order_date) {
        this.order_date = order_date;
    }


    /**
     * Gets the originating_location_description value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return originating_location_description
     */
    public java.lang.String getOriginating_location_description() {
        return originating_location_description;
    }


    /**
     * Sets the originating_location_description value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param originating_location_description
     */
    public void setOriginating_location_description(java.lang.String originating_location_description) {
        this.originating_location_description = originating_location_description;
    }


    /**
     * Gets the originating_location_cd value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return originating_location_cd
     */
    public java.lang.String getOriginating_location_cd() {
        return originating_location_cd;
    }


    /**
     * Sets the originating_location_cd value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param originating_location_cd
     */
    public void setOriginating_location_cd(java.lang.String originating_location_cd) {
        this.originating_location_cd = originating_location_cd;
    }


    /**
     * Gets the originating_system_cd value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return originating_system_cd
     */
    public java.lang.String getOriginating_system_cd() {
        return originating_system_cd;
    }


    /**
     * Sets the originating_system_cd value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param originating_system_cd
     */
    public void setOriginating_system_cd(java.lang.String originating_system_cd) {
        this.originating_system_cd = originating_system_cd;
    }


    /**
     * Gets the order_status value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the order_id value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the request_id value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return request_id
     */
    public int getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the under_review value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return under_review
     */
    public java.lang.String getUnder_review() {
        return under_review;
    }


    /**
     * Sets the under_review value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param under_review
     */
    public void setUnder_review(java.lang.String under_review) {
        this.under_review = under_review;
    }


    /**
     * Gets the order_additional_freight_charges value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_additional_freight_charges
     */
    public java.math.BigDecimal getOrder_additional_freight_charges() {
        return order_additional_freight_charges;
    }


    /**
     * Sets the order_additional_freight_charges value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_additional_freight_charges
     */
    public void setOrder_additional_freight_charges(java.math.BigDecimal order_additional_freight_charges) {
        this.order_additional_freight_charges = order_additional_freight_charges;
    }


    /**
     * Gets the order_additional_charges value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_additional_charges
     */
    public java.math.BigDecimal getOrder_additional_charges() {
        return order_additional_charges;
    }


    /**
     * Sets the order_additional_charges value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_additional_charges
     */
    public void setOrder_additional_charges(java.math.BigDecimal order_additional_charges) {
        this.order_additional_charges = order_additional_charges;
    }


    /**
     * Gets the ship_complete value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return ship_complete
     */
    public java.lang.String getShip_complete() {
        return ship_complete;
    }


    /**
     * Sets the ship_complete value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param ship_complete
     */
    public void setShip_complete(java.lang.String ship_complete) {
        this.ship_complete = ship_complete;
    }


    /**
     * Gets the freight_tax value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return freight_tax
     */
    public java.math.BigDecimal getFreight_tax() {
        return freight_tax;
    }


    /**
     * Sets the freight_tax value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param freight_tax
     */
    public void setFreight_tax(java.math.BigDecimal freight_tax) {
        this.freight_tax = freight_tax;
    }


    /**
     * Gets the order_message value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return order_message
     */
    public java.lang.String getOrder_message() {
        return order_message;
    }


    /**
     * Sets the order_message value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param order_message
     */
    public void setOrder_message(java.lang.String order_message) {
        this.order_message = order_message;
    }


    /**
     * Gets the gift_message value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @return gift_message
     */
    public java.lang.String getGift_message() {
        return gift_message;
    }


    /**
     * Sets the gift_message value for this StatusInquiryResponseMessageOrderTypeBean.
     * 
     * @param gift_message
     */
    public void setGift_message(java.lang.String gift_message) {
        this.gift_message = gift_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusInquiryResponseMessageOrderTypeBean)) return false;
        StatusInquiryResponseMessageOrderTypeBean other = (StatusInquiryResponseMessageOrderTypeBean) obj;
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
            ((this.sold_to_customer==null && other.getSold_to_customer()==null) || 
             (this.sold_to_customer!=null &&
              this.sold_to_customer.equals(other.getSold_to_customer()))) &&
            ((this.transaction_tenders==null && other.getTransaction_tenders()==null) || 
             (this.transaction_tenders!=null &&
              java.util.Arrays.equals(this.transaction_tenders, other.getTransaction_tenders()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.ref_transaction_no==null && other.getRef_transaction_no()==null) || 
             (this.ref_transaction_no!=null &&
              this.ref_transaction_no.equals(other.getRef_transaction_no()))) &&
            this.balance_due == other.getBalance_due() &&
            this.freight == other.getFreight() &&
            ((this.source_code==null && other.getSource_code()==null) || 
             (this.source_code!=null &&
              this.source_code.equals(other.getSource_code()))) &&
            ((this.gift==null && other.getGift()==null) || 
             (this.gift!=null &&
              this.gift.equals(other.getGift()))) &&
            ((this.ship_via_description==null && other.getShip_via_description()==null) || 
             (this.ship_via_description!=null &&
              this.ship_via_description.equals(other.getShip_via_description()))) &&
            ((this.ship_via==null && other.getShip_via()==null) || 
             (this.ship_via!=null &&
              this.ship_via.equals(other.getShip_via()))) &&
            ((this.special_instructions==null && other.getSpecial_instructions()==null) || 
             (this.special_instructions!=null &&
              this.special_instructions.equals(other.getSpecial_instructions()))) &&
            this.transaction_total == other.getTransaction_total() &&
            this.transaction_tax == other.getTransaction_tax() &&
            this.transaction_subtotal == other.getTransaction_subtotal() &&
            ((this.order_date==null && other.getOrder_date()==null) || 
             (this.order_date!=null &&
              this.order_date.equals(other.getOrder_date()))) &&
            ((this.originating_location_description==null && other.getOriginating_location_description()==null) || 
             (this.originating_location_description!=null &&
              this.originating_location_description.equals(other.getOriginating_location_description()))) &&
            ((this.originating_location_cd==null && other.getOriginating_location_cd()==null) || 
             (this.originating_location_cd!=null &&
              this.originating_location_cd.equals(other.getOriginating_location_cd()))) &&
            ((this.originating_system_cd==null && other.getOriginating_system_cd()==null) || 
             (this.originating_system_cd!=null &&
              this.originating_system_cd.equals(other.getOriginating_system_cd()))) &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            this.request_id == other.getRequest_id() &&
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
        if (getSold_to_customer() != null) {
            _hashCode += getSold_to_customer().hashCode();
        }
        if (getTransaction_tenders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransaction_tenders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransaction_tenders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getRef_transaction_no() != null) {
            _hashCode += getRef_transaction_no().hashCode();
        }
        _hashCode += new Double(getBalance_due()).hashCode();
        _hashCode += new Double(getFreight()).hashCode();
        if (getSource_code() != null) {
            _hashCode += getSource_code().hashCode();
        }
        if (getGift() != null) {
            _hashCode += getGift().hashCode();
        }
        if (getShip_via_description() != null) {
            _hashCode += getShip_via_description().hashCode();
        }
        if (getShip_via() != null) {
            _hashCode += getShip_via().hashCode();
        }
        if (getSpecial_instructions() != null) {
            _hashCode += getSpecial_instructions().hashCode();
        }
        _hashCode += new Double(getTransaction_total()).hashCode();
        _hashCode += new Double(getTransaction_tax()).hashCode();
        _hashCode += new Double(getTransaction_subtotal()).hashCode();
        if (getOrder_date() != null) {
            _hashCode += getOrder_date().hashCode();
        }
        if (getOriginating_location_description() != null) {
            _hashCode += getOriginating_location_description().hashCode();
        }
        if (getOriginating_location_cd() != null) {
            _hashCode += getOriginating_location_cd().hashCode();
        }
        if (getOriginating_system_cd() != null) {
            _hashCode += getOriginating_system_cd().hashCode();
        }
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        _hashCode += getRequest_id();
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
        new org.apache.axis.description.TypeDesc(StatusInquiryResponseMessageOrderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageOrderTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ref_transaction_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ref_transaction_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("balance_due");
        attrField.setXmlName(new javax.xml.namespace.QName("", "balance_due"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("freight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "freight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("source_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "source_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("gift");
        attrField.setXmlName(new javax.xml.namespace.QName("", "gift"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ship_via_description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ship_via_description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ship_via");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ship_via"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("special_instructions");
        attrField.setXmlName(new javax.xml.namespace.QName("", "special_instructions"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transaction_total");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transaction_total"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transaction_tax");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transaction_tax"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transaction_subtotal");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transaction_subtotal"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_date");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_date"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originating_location_description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "originating_location_description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originating_location_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "originating_location_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originating_system_cd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "originating_system_cd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageItemTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sold_to_customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sold_to_customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SoldToCustomerTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_tenders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_tenders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "TransactionTenderTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "transaction_tender"));
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
