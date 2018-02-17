/**
 * SubmitOrderRequestMessageTransactionHeaderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class SubmitOrderRequestMessageTransactionHeaderTypeBean  implements java.io.Serializable {
    private java.lang.String ref_transaction_no;

    private java.lang.String transaction_date;

    private java.lang.String employee_id;

    private java.math.BigDecimal transaction_subtotal;

    private java.math.BigDecimal transaction_tax;

    private java.math.BigDecimal transaction_total;

    private java.lang.String special_instructions;

    private java.lang.String transaction_status;

    private java.lang.String transaction_channel;

    private java.lang.String ship_via;

    private java.lang.String ship_via_description;

    private java.lang.String gift;

    private java.lang.String source_code;

    private java.math.BigDecimal freight_amount;

    private java.math.BigDecimal balance_due;

    private java.lang.String currency;

    private java.math.BigDecimal order_additional_freight_charges;

    private java.math.BigDecimal order_additional_charges;

    private java.lang.String ship_complete;

    private java.math.BigDecimal freight_tax;

    private java.lang.String order_message;

    private java.lang.String gift_message;

    private java.lang.String under_review;

    private com.microsretail.Locate.SoldToCustomerTypeBean sold_to_customer;

    private com.microsretail.Locate.StoreLocationTypeBean store_location;

    private com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean[] transaction_details;

    private com.microsretail.Locate.TransactionTenderTypeBean[] transaction_tenders;

    private java.lang.String transaction_type_id;  // attribute

    private java.lang.String transaction_no;  // attribute

    private java.lang.String request_id;  // attribute

    private java.lang.String order_id;  // attribute

    public SubmitOrderRequestMessageTransactionHeaderTypeBean() {
    }

    public SubmitOrderRequestMessageTransactionHeaderTypeBean(
           java.lang.String ref_transaction_no,
           java.lang.String transaction_date,
           java.lang.String employee_id,
           java.math.BigDecimal transaction_subtotal,
           java.math.BigDecimal transaction_tax,
           java.math.BigDecimal transaction_total,
           java.lang.String special_instructions,
           java.lang.String transaction_status,
           java.lang.String transaction_channel,
           java.lang.String ship_via,
           java.lang.String ship_via_description,
           java.lang.String gift,
           java.lang.String source_code,
           java.math.BigDecimal freight_amount,
           java.math.BigDecimal balance_due,
           java.lang.String currency,
           java.math.BigDecimal order_additional_freight_charges,
           java.math.BigDecimal order_additional_charges,
           java.lang.String ship_complete,
           java.math.BigDecimal freight_tax,
           java.lang.String order_message,
           java.lang.String gift_message,
           java.lang.String under_review,
           com.microsretail.Locate.SoldToCustomerTypeBean sold_to_customer,
           com.microsretail.Locate.StoreLocationTypeBean store_location,
           com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean[] transaction_details,
           com.microsretail.Locate.TransactionTenderTypeBean[] transaction_tenders,
           java.lang.String transaction_type_id,
           java.lang.String transaction_no,
           java.lang.String request_id,
           java.lang.String order_id) {
           this.ref_transaction_no = ref_transaction_no;
           this.transaction_date = transaction_date;
           this.employee_id = employee_id;
           this.transaction_subtotal = transaction_subtotal;
           this.transaction_tax = transaction_tax;
           this.transaction_total = transaction_total;
           this.special_instructions = special_instructions;
           this.transaction_status = transaction_status;
           this.transaction_channel = transaction_channel;
           this.ship_via = ship_via;
           this.ship_via_description = ship_via_description;
           this.gift = gift;
           this.source_code = source_code;
           this.freight_amount = freight_amount;
           this.balance_due = balance_due;
           this.currency = currency;
           this.order_additional_freight_charges = order_additional_freight_charges;
           this.order_additional_charges = order_additional_charges;
           this.ship_complete = ship_complete;
           this.freight_tax = freight_tax;
           this.order_message = order_message;
           this.gift_message = gift_message;
           this.under_review = under_review;
           this.sold_to_customer = sold_to_customer;
           this.store_location = store_location;
           this.transaction_details = transaction_details;
           this.transaction_tenders = transaction_tenders;
           this.transaction_type_id = transaction_type_id;
           this.transaction_no = transaction_no;
           this.request_id = request_id;
           this.order_id = order_id;
    }


    /**
     * Gets the ref_transaction_no value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return ref_transaction_no
     */
    public java.lang.String getRef_transaction_no() {
        return ref_transaction_no;
    }


    /**
     * Sets the ref_transaction_no value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param ref_transaction_no
     */
    public void setRef_transaction_no(java.lang.String ref_transaction_no) {
        this.ref_transaction_no = ref_transaction_no;
    }


    /**
     * Gets the transaction_date value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_date
     */
    public java.lang.String getTransaction_date() {
        return transaction_date;
    }


    /**
     * Sets the transaction_date value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_date
     */
    public void setTransaction_date(java.lang.String transaction_date) {
        this.transaction_date = transaction_date;
    }


    /**
     * Gets the employee_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return employee_id
     */
    public java.lang.String getEmployee_id() {
        return employee_id;
    }


    /**
     * Sets the employee_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param employee_id
     */
    public void setEmployee_id(java.lang.String employee_id) {
        this.employee_id = employee_id;
    }


    /**
     * Gets the transaction_subtotal value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_subtotal
     */
    public java.math.BigDecimal getTransaction_subtotal() {
        return transaction_subtotal;
    }


    /**
     * Sets the transaction_subtotal value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_subtotal
     */
    public void setTransaction_subtotal(java.math.BigDecimal transaction_subtotal) {
        this.transaction_subtotal = transaction_subtotal;
    }


    /**
     * Gets the transaction_tax value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_tax
     */
    public java.math.BigDecimal getTransaction_tax() {
        return transaction_tax;
    }


    /**
     * Sets the transaction_tax value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_tax
     */
    public void setTransaction_tax(java.math.BigDecimal transaction_tax) {
        this.transaction_tax = transaction_tax;
    }


    /**
     * Gets the transaction_total value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_total
     */
    public java.math.BigDecimal getTransaction_total() {
        return transaction_total;
    }


    /**
     * Sets the transaction_total value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_total
     */
    public void setTransaction_total(java.math.BigDecimal transaction_total) {
        this.transaction_total = transaction_total;
    }


    /**
     * Gets the special_instructions value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return special_instructions
     */
    public java.lang.String getSpecial_instructions() {
        return special_instructions;
    }


    /**
     * Sets the special_instructions value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param special_instructions
     */
    public void setSpecial_instructions(java.lang.String special_instructions) {
        this.special_instructions = special_instructions;
    }


    /**
     * Gets the transaction_status value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_status
     */
    public java.lang.String getTransaction_status() {
        return transaction_status;
    }


    /**
     * Sets the transaction_status value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_status
     */
    public void setTransaction_status(java.lang.String transaction_status) {
        this.transaction_status = transaction_status;
    }


    /**
     * Gets the transaction_channel value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_channel
     */
    public java.lang.String getTransaction_channel() {
        return transaction_channel;
    }


    /**
     * Sets the transaction_channel value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_channel
     */
    public void setTransaction_channel(java.lang.String transaction_channel) {
        this.transaction_channel = transaction_channel;
    }


    /**
     * Gets the ship_via value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return ship_via
     */
    public java.lang.String getShip_via() {
        return ship_via;
    }


    /**
     * Sets the ship_via value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param ship_via
     */
    public void setShip_via(java.lang.String ship_via) {
        this.ship_via = ship_via;
    }


    /**
     * Gets the ship_via_description value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return ship_via_description
     */
    public java.lang.String getShip_via_description() {
        return ship_via_description;
    }


    /**
     * Sets the ship_via_description value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param ship_via_description
     */
    public void setShip_via_description(java.lang.String ship_via_description) {
        this.ship_via_description = ship_via_description;
    }


    /**
     * Gets the gift value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return gift
     */
    public java.lang.String getGift() {
        return gift;
    }


    /**
     * Sets the gift value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param gift
     */
    public void setGift(java.lang.String gift) {
        this.gift = gift;
    }


    /**
     * Gets the source_code value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return source_code
     */
    public java.lang.String getSource_code() {
        return source_code;
    }


    /**
     * Sets the source_code value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param source_code
     */
    public void setSource_code(java.lang.String source_code) {
        this.source_code = source_code;
    }


    /**
     * Gets the freight_amount value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return freight_amount
     */
    public java.math.BigDecimal getFreight_amount() {
        return freight_amount;
    }


    /**
     * Sets the freight_amount value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param freight_amount
     */
    public void setFreight_amount(java.math.BigDecimal freight_amount) {
        this.freight_amount = freight_amount;
    }


    /**
     * Gets the balance_due value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return balance_due
     */
    public java.math.BigDecimal getBalance_due() {
        return balance_due;
    }


    /**
     * Sets the balance_due value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param balance_due
     */
    public void setBalance_due(java.math.BigDecimal balance_due) {
        this.balance_due = balance_due;
    }


    /**
     * Gets the currency value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the order_additional_freight_charges value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return order_additional_freight_charges
     */
    public java.math.BigDecimal getOrder_additional_freight_charges() {
        return order_additional_freight_charges;
    }


    /**
     * Sets the order_additional_freight_charges value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param order_additional_freight_charges
     */
    public void setOrder_additional_freight_charges(java.math.BigDecimal order_additional_freight_charges) {
        this.order_additional_freight_charges = order_additional_freight_charges;
    }


    /**
     * Gets the order_additional_charges value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return order_additional_charges
     */
    public java.math.BigDecimal getOrder_additional_charges() {
        return order_additional_charges;
    }


    /**
     * Sets the order_additional_charges value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param order_additional_charges
     */
    public void setOrder_additional_charges(java.math.BigDecimal order_additional_charges) {
        this.order_additional_charges = order_additional_charges;
    }


    /**
     * Gets the ship_complete value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return ship_complete
     */
    public java.lang.String getShip_complete() {
        return ship_complete;
    }


    /**
     * Sets the ship_complete value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param ship_complete
     */
    public void setShip_complete(java.lang.String ship_complete) {
        this.ship_complete = ship_complete;
    }


    /**
     * Gets the freight_tax value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return freight_tax
     */
    public java.math.BigDecimal getFreight_tax() {
        return freight_tax;
    }


    /**
     * Sets the freight_tax value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param freight_tax
     */
    public void setFreight_tax(java.math.BigDecimal freight_tax) {
        this.freight_tax = freight_tax;
    }


    /**
     * Gets the order_message value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return order_message
     */
    public java.lang.String getOrder_message() {
        return order_message;
    }


    /**
     * Sets the order_message value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param order_message
     */
    public void setOrder_message(java.lang.String order_message) {
        this.order_message = order_message;
    }


    /**
     * Gets the gift_message value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return gift_message
     */
    public java.lang.String getGift_message() {
        return gift_message;
    }


    /**
     * Sets the gift_message value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param gift_message
     */
    public void setGift_message(java.lang.String gift_message) {
        this.gift_message = gift_message;
    }


    /**
     * Gets the under_review value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return under_review
     */
    public java.lang.String getUnder_review() {
        return under_review;
    }


    /**
     * Sets the under_review value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param under_review
     */
    public void setUnder_review(java.lang.String under_review) {
        this.under_review = under_review;
    }


    /**
     * Gets the sold_to_customer value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return sold_to_customer
     */
    public com.microsretail.Locate.SoldToCustomerTypeBean getSold_to_customer() {
        return sold_to_customer;
    }


    /**
     * Sets the sold_to_customer value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param sold_to_customer
     */
    public void setSold_to_customer(com.microsretail.Locate.SoldToCustomerTypeBean sold_to_customer) {
        this.sold_to_customer = sold_to_customer;
    }


    /**
     * Gets the store_location value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return store_location
     */
    public com.microsretail.Locate.StoreLocationTypeBean getStore_location() {
        return store_location;
    }


    /**
     * Sets the store_location value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param store_location
     */
    public void setStore_location(com.microsretail.Locate.StoreLocationTypeBean store_location) {
        this.store_location = store_location;
    }


    /**
     * Gets the transaction_details value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_details
     */
    public com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean[] getTransaction_details() {
        return transaction_details;
    }


    /**
     * Sets the transaction_details value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_details
     */
    public void setTransaction_details(com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean[] transaction_details) {
        this.transaction_details = transaction_details;
    }


    /**
     * Gets the transaction_tenders value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_tenders
     */
    public com.microsretail.Locate.TransactionTenderTypeBean[] getTransaction_tenders() {
        return transaction_tenders;
    }


    /**
     * Sets the transaction_tenders value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_tenders
     */
    public void setTransaction_tenders(com.microsretail.Locate.TransactionTenderTypeBean[] transaction_tenders) {
        this.transaction_tenders = transaction_tenders;
    }


    /**
     * Gets the transaction_type_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_type_id
     */
    public java.lang.String getTransaction_type_id() {
        return transaction_type_id;
    }


    /**
     * Sets the transaction_type_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_type_id
     */
    public void setTransaction_type_id(java.lang.String transaction_type_id) {
        this.transaction_type_id = transaction_type_id;
    }


    /**
     * Gets the transaction_no value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return transaction_no
     */
    public java.lang.String getTransaction_no() {
        return transaction_no;
    }


    /**
     * Sets the transaction_no value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param transaction_no
     */
    public void setTransaction_no(java.lang.String transaction_no) {
        this.transaction_no = transaction_no;
    }


    /**
     * Gets the request_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return request_id
     */
    public java.lang.String getRequest_id() {
        return request_id;
    }


    /**
     * Sets the request_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param request_id
     */
    public void setRequest_id(java.lang.String request_id) {
        this.request_id = request_id;
    }


    /**
     * Gets the order_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this SubmitOrderRequestMessageTransactionHeaderTypeBean.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitOrderRequestMessageTransactionHeaderTypeBean)) return false;
        SubmitOrderRequestMessageTransactionHeaderTypeBean other = (SubmitOrderRequestMessageTransactionHeaderTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ref_transaction_no==null && other.getRef_transaction_no()==null) || 
             (this.ref_transaction_no!=null &&
              this.ref_transaction_no.equals(other.getRef_transaction_no()))) &&
            ((this.transaction_date==null && other.getTransaction_date()==null) || 
             (this.transaction_date!=null &&
              this.transaction_date.equals(other.getTransaction_date()))) &&
            ((this.employee_id==null && other.getEmployee_id()==null) || 
             (this.employee_id!=null &&
              this.employee_id.equals(other.getEmployee_id()))) &&
            ((this.transaction_subtotal==null && other.getTransaction_subtotal()==null) || 
             (this.transaction_subtotal!=null &&
              this.transaction_subtotal.equals(other.getTransaction_subtotal()))) &&
            ((this.transaction_tax==null && other.getTransaction_tax()==null) || 
             (this.transaction_tax!=null &&
              this.transaction_tax.equals(other.getTransaction_tax()))) &&
            ((this.transaction_total==null && other.getTransaction_total()==null) || 
             (this.transaction_total!=null &&
              this.transaction_total.equals(other.getTransaction_total()))) &&
            ((this.special_instructions==null && other.getSpecial_instructions()==null) || 
             (this.special_instructions!=null &&
              this.special_instructions.equals(other.getSpecial_instructions()))) &&
            ((this.transaction_status==null && other.getTransaction_status()==null) || 
             (this.transaction_status!=null &&
              this.transaction_status.equals(other.getTransaction_status()))) &&
            ((this.transaction_channel==null && other.getTransaction_channel()==null) || 
             (this.transaction_channel!=null &&
              this.transaction_channel.equals(other.getTransaction_channel()))) &&
            ((this.ship_via==null && other.getShip_via()==null) || 
             (this.ship_via!=null &&
              this.ship_via.equals(other.getShip_via()))) &&
            ((this.ship_via_description==null && other.getShip_via_description()==null) || 
             (this.ship_via_description!=null &&
              this.ship_via_description.equals(other.getShip_via_description()))) &&
            ((this.gift==null && other.getGift()==null) || 
             (this.gift!=null &&
              this.gift.equals(other.getGift()))) &&
            ((this.source_code==null && other.getSource_code()==null) || 
             (this.source_code!=null &&
              this.source_code.equals(other.getSource_code()))) &&
            ((this.freight_amount==null && other.getFreight_amount()==null) || 
             (this.freight_amount!=null &&
              this.freight_amount.equals(other.getFreight_amount()))) &&
            ((this.balance_due==null && other.getBalance_due()==null) || 
             (this.balance_due!=null &&
              this.balance_due.equals(other.getBalance_due()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
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
              this.gift_message.equals(other.getGift_message()))) &&
            ((this.under_review==null && other.getUnder_review()==null) || 
             (this.under_review!=null &&
              this.under_review.equals(other.getUnder_review()))) &&
            ((this.sold_to_customer==null && other.getSold_to_customer()==null) || 
             (this.sold_to_customer!=null &&
              this.sold_to_customer.equals(other.getSold_to_customer()))) &&
            ((this.store_location==null && other.getStore_location()==null) || 
             (this.store_location!=null &&
              this.store_location.equals(other.getStore_location()))) &&
            ((this.transaction_details==null && other.getTransaction_details()==null) || 
             (this.transaction_details!=null &&
              java.util.Arrays.equals(this.transaction_details, other.getTransaction_details()))) &&
            ((this.transaction_tenders==null && other.getTransaction_tenders()==null) || 
             (this.transaction_tenders!=null &&
              java.util.Arrays.equals(this.transaction_tenders, other.getTransaction_tenders()))) &&
            ((this.transaction_type_id==null && other.getTransaction_type_id()==null) || 
             (this.transaction_type_id!=null &&
              this.transaction_type_id.equals(other.getTransaction_type_id()))) &&
            ((this.transaction_no==null && other.getTransaction_no()==null) || 
             (this.transaction_no!=null &&
              this.transaction_no.equals(other.getTransaction_no()))) &&
            ((this.request_id==null && other.getRequest_id()==null) || 
             (this.request_id!=null &&
              this.request_id.equals(other.getRequest_id()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id())));
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
        if (getRef_transaction_no() != null) {
            _hashCode += getRef_transaction_no().hashCode();
        }
        if (getTransaction_date() != null) {
            _hashCode += getTransaction_date().hashCode();
        }
        if (getEmployee_id() != null) {
            _hashCode += getEmployee_id().hashCode();
        }
        if (getTransaction_subtotal() != null) {
            _hashCode += getTransaction_subtotal().hashCode();
        }
        if (getTransaction_tax() != null) {
            _hashCode += getTransaction_tax().hashCode();
        }
        if (getTransaction_total() != null) {
            _hashCode += getTransaction_total().hashCode();
        }
        if (getSpecial_instructions() != null) {
            _hashCode += getSpecial_instructions().hashCode();
        }
        if (getTransaction_status() != null) {
            _hashCode += getTransaction_status().hashCode();
        }
        if (getTransaction_channel() != null) {
            _hashCode += getTransaction_channel().hashCode();
        }
        if (getShip_via() != null) {
            _hashCode += getShip_via().hashCode();
        }
        if (getShip_via_description() != null) {
            _hashCode += getShip_via_description().hashCode();
        }
        if (getGift() != null) {
            _hashCode += getGift().hashCode();
        }
        if (getSource_code() != null) {
            _hashCode += getSource_code().hashCode();
        }
        if (getFreight_amount() != null) {
            _hashCode += getFreight_amount().hashCode();
        }
        if (getBalance_due() != null) {
            _hashCode += getBalance_due().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
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
        if (getUnder_review() != null) {
            _hashCode += getUnder_review().hashCode();
        }
        if (getSold_to_customer() != null) {
            _hashCode += getSold_to_customer().hashCode();
        }
        if (getStore_location() != null) {
            _hashCode += getStore_location().hashCode();
        }
        if (getTransaction_details() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransaction_details());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransaction_details(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTransaction_type_id() != null) {
            _hashCode += getTransaction_type_id().hashCode();
        }
        if (getTransaction_no() != null) {
            _hashCode += getTransaction_no().hashCode();
        }
        if (getRequest_id() != null) {
            _hashCode += getRequest_id().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitOrderRequestMessageTransactionHeaderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTransactionHeaderTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transaction_type_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transaction_type_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transaction_no");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transaction_no"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("request_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "request_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("order_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_transaction_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_transaction_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employee_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_subtotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_subtotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("transaction_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ship_via");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_via"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ship_via_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_via_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gift");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gift"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freight_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freight_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_due");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance_due"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_additional_freight_charges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_additional_freight_charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_additional_charges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_additional_charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ship_complete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_complete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freight_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freight_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gift_message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gift_message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("under_review");
        elemField.setXmlName(new javax.xml.namespace.QName("", "under_review"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sold_to_customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sold_to_customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SoldToCustomerTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StoreLocationTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestTransactionDetailTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "transaction_detail"));
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
