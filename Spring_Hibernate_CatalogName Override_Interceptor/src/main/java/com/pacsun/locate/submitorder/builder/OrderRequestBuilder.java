package com.pacsun.locate.submitorder.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.microsretail.Locate.AddressTypeBean;
import com.microsretail.Locate.NameTypeBean;
import com.microsretail.Locate.SoldToCustomerTypeBean;
import com.microsretail.Locate.StoreLocationTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTypeBean;
import com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean;
import com.pacsun.locate.constants.LocateConstants;
import com.pacsun.locate.submitorder.model.OrderDetail;
import com.pacsun.locate.submitorder.model.OrderHeader;
import com.pacsun.util.DateFormatterUtil;

public class OrderRequestBuilder implements LocateConstants {

	private SubmitOrderRequestMessageTypeBean orderRequestMessage;

	private SubmitOrderRequestMessageHeaderTypeBean messageHeader;

	private SubmitOrderRequestMessageTransactionHeaderTypeBean transactionHeader;

	private SubmitOrderRequestMessageTransactionsTypeBean transactions;

	private OrderHeader orderHeader;

	private String transactionDate = DateFormatterUtil.formatDate(new Date(), "yyyy-MM-dd'T'HH:mm:ss");

	public void build() {
		buildMessageHeader();
		buildTransactions();
		orderRequestMessage = new SubmitOrderRequestMessageTypeBean();
		orderRequestMessage.setMessage_header(getMessageHeader());
		orderRequestMessage.getMessage_body().setTransactions(transactions);
	}

	public void buildMessageHeader() {

		messageHeader = new SubmitOrderRequestMessageHeaderTypeBean();
		messageHeader.setXaction_type(SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_XACTION_TYPE);
		messageHeader.setXaction_response(SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_XACTION_RESPONSE);
		messageHeader.setDatetime(this.transactionDate);
		messageHeader.setVersion(SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_LOCATE_VERSION);
		messageHeader.setDestination(SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_DESTINATION);
		messageHeader.setMessage_type(SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_MESSAGE_TYPE);
		messageHeader.setSource(SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_SOURCE);
	}

	public void buildTransactions() {

		transactionHeader = new SubmitOrderRequestMessageTransactionHeaderTypeBean();
		transactionHeader.setTransaction_no("");
		transactionHeader.setOrder_id(String.valueOf(orderHeader.getOrderHeaderCompositeKey().getOrderNumber()));
		transactionHeader.setTransaction_type_id("orderType");
		transactionHeader.setTransaction_date(this.transactionDate);
		transactionHeader.setEmployee_id(SUBMIT_ORDER_REQUEST_MESSAGE_EMPLOYEEID);
		transactionHeader.setTransaction_subtotal(new BigDecimal(orderHeader.getOrderSubtotal()));
		transactionHeader.setTransaction_tax(new BigDecimal(orderHeader.getTotalTax()));
		transactionHeader.setTransaction_total(new BigDecimal(orderHeader.getTotal()));
		transactionHeader.setTransaction_status(SUBMIT_ORDER_REQUEST_MESSAGE_TRANSACTION_STATUS_NEWORDER);
		transactionHeader.setTransaction_channel(SUBMIT_ORDER_REQUEST_MESSAGE_TRANSACTION_CHANNEL);
		// transactionHeader.setFreight_amount(new BigDecimal(orderHeader.get));
		transactionHeader.setCurrency("USD");
		// transactionHeader.setOrder_additional_freight_charges(orderDto.getAdditionalFreightCharges());
		transactionHeader.setUnder_review(orderHeader.getUnderReviewFlag());
		transactionHeader.setSold_to_customer(getSoldToCustomer());
		transactionHeader.setStore_location(getStoreLocation());
		transactionHeader.setTransaction_details(getTransactionDetails());

		transactions = new SubmitOrderRequestMessageTransactionsTypeBean();
		transactions.setTransaction_header(transactionHeader);

	}

	public SubmitOrderRequestTransactionDetailTypeBean[] getTransactionDetails() {
		List<SubmitOrderRequestTransactionDetailTypeBean> detailList = new ArrayList<SubmitOrderRequestTransactionDetailTypeBean>();

		for (OrderDetail orderDetail : orderHeader.getOrderDetailList()) {
			SubmitOrderRequestTransactionDetailTypeBean orderDetailMessage = new SubmitOrderRequestTransactionDetailTypeBean();
			orderDetailMessage.setLine_item_no(String.valueOf(orderDetail.getItemNumber()));
			// orderDetailMessage.setLocation_cd(orderDetail.get);
			orderDetailMessage.setSystem_cd(orderDetail.getSystemCode());
			orderDetailMessage.setItem_id(String.valueOf(orderDetail.getOrderDetailCompositeKey().getOrderNumber()));
			orderDetailMessage.setQty(orderDetail.getQuantity());
			orderDetailMessage.setUnit_price(String.valueOf(orderDetail.getUnitPrice()));
			orderDetailMessage.setSpecial_instructions(orderDetail.getSpecialInstruction());
			// orderDetailMessage.setItem_upc_cd(String.valueOf(orderDetail.get));
			// orderDetailMessage.setItem_ean_cd(String.valueOf(orderDetailDto.getEanCode()));
		}
		return detailList.toArray(new SubmitOrderRequestTransactionDetailTypeBean[detailList.size()]);
	}

	public StoreLocationTypeBean getStoreLocation() {
		StoreLocationTypeBean storeLocation = new StoreLocationTypeBean();
		storeLocation.setLocation_cd(orderHeader.getLocationCode());
		storeLocation.setSystem_cd(orderHeader.getSystemCode());
		return storeLocation;
	}

	public SoldToCustomerTypeBean getSoldToCustomer() {
		SoldToCustomerTypeBean customer = new SoldToCustomerTypeBean();
		NameTypeBean name = new NameTypeBean();

		// name.setCompany_name(orderHeader.get);
		name.setFirst(orderHeader.getCustomerFirstName());
		name.setLast(orderHeader.getCustomerLastName());
		// name.setMiddle(orderHeader.get);
		// name.setPrefix(orderHeader.get);
		// name.setSuffix(customerDto.getSuffix());
		customer.setName(name);

		AddressTypeBean addressTypeBean = new AddressTypeBean();

		addressTypeBean.setAddress1(orderHeader.getCustomerAddress1());
		addressTypeBean.setAddress2(orderHeader.getCutomerAddress2());
		addressTypeBean.setCity(orderHeader.getCustomerCity());
		addressTypeBean.setCountry(orderHeader.getCustomerCountry());
		addressTypeBean.setEmail(orderHeader.getCustomerEmailAddress());
		addressTypeBean.setPostal(orderHeader.getCustomerZipCode());
		addressTypeBean.setProvince(orderHeader.getCustomerState());

		customer.setAddress(addressTypeBean);

		return customer;
	}

	public SubmitOrderRequestMessageTypeBean getOrderRequestMessage() {
		return orderRequestMessage;
	}

	public void setOrderRequestMessage(SubmitOrderRequestMessageTypeBean orderRequestMessage) {
		this.orderRequestMessage = orderRequestMessage;
	}

	public SubmitOrderRequestMessageHeaderTypeBean getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(SubmitOrderRequestMessageHeaderTypeBean messageHeader) {
		this.messageHeader = messageHeader;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}