package com.pacsun.locate.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.microsretail.Locate.AddressTypeBean;
import com.microsretail.Locate.CustomerTypeBean;
import com.microsretail.Locate.NameTypeBean;
import com.microsretail.Locate.SoldToCustomerTypeBean;
import com.microsretail.Locate.StoreLocationTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageBodyTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTypeBean;
import com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean;
import com.microsretail.Locate.TaxTypeBean;
import com.microsretail.Locate.TransactionTenderTypeBean;
import com.pacsun.locate.model.OrderDetail;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.service.IOrderDetailService;
import com.pacsun.util.DateFormatterUtil;
import com.pacsun.util.StackTrace;

@Component
@Scope("prototype")
@Lazy
public class SubmitOrderRequestBuilder {

	@Autowired
	private SubmitOrderRequestMessageHeaderTypeBean submitOrderRequestMessageHeader;

	@Autowired
	private IOrderDetailService orderDetailService;

	private SubmitOrderRequestMessageTypeBean orderRequestMessage;
	private OrderHeader orderHeader;

	@Value("${locate.request.message.employeeId}")
	private String LOCATE_REQUEST_MESSAGE_EMPLOYEEID;

	private static final Logger log = Logger.getLogger(SubmitOrderRequestBuilder.class);
	private String errorMessage;

	public void build(OrderHeader orderHeader) throws Exception {
		try {
			this.orderHeader = orderHeader;
			orderRequestMessage = new SubmitOrderRequestMessageTypeBean();
			buildMessageHeader();
			buildMessageBody();
		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e) + "Order#="
					+ orderHeader.getId().getOrderNumber() + ", PiticketCode="
					+ orderHeader.getId().getPickTicketCode();
			log.error(errorMessage);
			throw new Exception(e);
		}
	}

	public void buildMessageHeader() {
		submitOrderRequestMessageHeader.setDatetime(DateFormatterUtil.formatDate(new Date(), "yyyy-MM-dd'T'HH:mm:ss"));
		orderRequestMessage.setMessage_header(getSubmitOrderRequestMessageHeader());
	}

	public void buildMessageBody() throws Exception {
		try {

			Set<OrderDetail> orderDetailList = orderHeader.getOrderDetailList();

			SubmitOrderRequestMessageBodyTypeBean messageBody = new SubmitOrderRequestMessageBodyTypeBean();
			SubmitOrderRequestMessageTransactionHeaderTypeBean transactionHeader = new SubmitOrderRequestMessageTransactionHeaderTypeBean();
			SubmitOrderRequestMessageTransactionsTypeBean transactions = new SubmitOrderRequestMessageTransactionsTypeBean();

			transactionHeader.setTransaction_no("");
			transactionHeader.setOrder_id(String.valueOf(orderHeader.getId().getOrderNumber()));
			transactionHeader.setTransaction_type_id(replaceBlankNullTrim(orderHeader.getTransactionTypeId()));
			transactionHeader.setTransaction_date(DateFormatterUtil.formatDate(orderHeader.getOrderDate(),
					"yyyy-MM-dd'T'HH:mm:ss"));
			transactionHeader.setEmployee_id(LOCATE_REQUEST_MESSAGE_EMPLOYEEID);
			transactionHeader.setTransaction_subtotal(BigDecimal.valueOf(orderHeader.getOrderSubtotal()));
			transactionHeader.setTransaction_tax(BigDecimal.valueOf(orderHeader.getTotalTax()));
			transactionHeader.setTransaction_total(BigDecimal.valueOf(orderHeader.getTotal()));
			transactionHeader.setSpecial_instructions(replaceBlankNullTrim(orderHeader.getSpecialInstruction()));
			transactionHeader.setTransaction_status(replaceBlankNullTrim(orderHeader.getTransactionStatus()));
			transactionHeader.setTransaction_channel(replaceBlankNullTrim(orderHeader.getTransactionChannel()));
			transactionHeader.setShip_via(replaceBlankNullTrim(orderHeader.getShipVia()));
			transactionHeader.setShip_via_description(replaceBlankNullTrim(orderHeader.getShipViaDescription()));
			transactionHeader.setGift(orderHeader.getGift());
			transactionHeader.setFreight_amount(BigDecimal.valueOf(orderHeader.getShippingCharge()));
			transactionHeader.setBalance_due(BigDecimal.valueOf(orderHeader.getBalanceDue()));
			transactionHeader.setUnder_review(orderHeader.getUnderReviewFlag());
			transactionHeader.setOrder_message(replaceBlankNullTrim(orderHeader.getOrderMessage()));
			transactionHeader.setSold_to_customer(buildSoldToCustomer());
			transactionHeader.setStore_location(buildStoreLocation());
			transactionHeader.setTransaction_details(buildTransactionDetails(orderDetailList));
			transactionHeader.setTransaction_tenders(buildTransactionTenders(orderDetailList));

			transactions.setTransaction_header(transactionHeader);
			messageBody.setTransactions(transactions);
			orderRequestMessage.setMessage_body(messageBody);
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
	}

	public TransactionTenderTypeBean[] buildTransactionTenders(Set<OrderDetail> orderDetailList) throws Exception {
		List<TransactionTenderTypeBean> transactionTenders = new ArrayList<TransactionTenderTypeBean>();
		try {
			for (OrderDetail orderDetail : orderDetailList) {
				TransactionTenderTypeBean transactionTender = new TransactionTenderTypeBean();
				transactionTender.setLine_item_no(String.valueOf(orderDetail.getId().getItemLine()));
				transactionTender.setTender_account(replaceBlankNullTrim(orderDetail.getTenderAccount()));
				transactionTender.setTender_amount(BigDecimal.valueOf(orderDetail.getTenderAmount()));
				transactionTender.setTender_description(trim(orderDetail.getTenderDescription()));
				transactionTender.setTender_description("");
				transactionTenders.add(transactionTender);
			}
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return transactionTenders.toArray(new TransactionTenderTypeBean[transactionTenders.size()]);
	}

	public SubmitOrderRequestTransactionDetailTypeBean[] buildTransactionDetails(Set<OrderDetail> orderDetailList)
			throws Exception {
		try {
			List<SubmitOrderRequestTransactionDetailTypeBean> detailList = new ArrayList<SubmitOrderRequestTransactionDetailTypeBean>();

			for (OrderDetail orderDetail : orderDetailService.findOrderLineItems(orderHeader.getId().getOrderNumber(),
					orderHeader.getId().getPickTicketCode(), orderHeader.getId().getFulfillmentLocation())) {
				SubmitOrderRequestTransactionDetailTypeBean orderDetailMessage = new SubmitOrderRequestTransactionDetailTypeBean();
				orderDetailMessage.setItem_id(String.valueOf(replaceBlankNullTrim(orderDetail.getItemNumber())));
				orderDetailMessage.setLine_item_no(String.valueOf(orderDetail.getId().getItemLine()));
				orderDetailMessage.setLocation_cd(trim(orderDetail.getLocationCode()));
				orderDetailMessage.setSystem_cd(trim(orderDetail.getSystemCode()));
				orderDetailMessage.setQty(orderDetail.getQuantity());
				orderDetailMessage.setUnit_price(String.valueOf(orderDetail.getUnitPrice()));
				orderDetailMessage.setLine_item_status(replaceBlankNullTrim(orderDetail.getItemLineStatus()));
				orderDetailMessage.setSpecial_instructions(replaceBlankNullTrim(orderDetail.getSpecialInstruction()));
				orderDetailMessage.setItem_upc_cd(String.valueOf(trim(orderDetail.getProductBarcode())));
				orderDetailMessage.setOrder_line_gift_wrap(orderDetail.getGiftBoxFlag());
				orderDetailMessage.setOrder_line_message(replaceBlankNullTrim(orderDetail.getLineMessage()));
				orderDetailMessage.setShip_to(buildShipTo(orderDetail));
				orderDetailMessage.setTaxes(buildTaxes(orderDetail));
				detailList.add(orderDetailMessage);
			}
			return detailList.toArray(new SubmitOrderRequestTransactionDetailTypeBean[detailList.size()]);
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
	}

	public TaxTypeBean[] buildTaxes(OrderDetail orderDetail) throws Exception {
		List<TaxTypeBean> taxes = new ArrayList<TaxTypeBean>();
		try {
			TaxTypeBean tax = new TaxTypeBean();
			tax.setLine_item_no(String.valueOf(orderDetail.getId().getItemLine()));
			tax.setDescription("tax");
			tax.setAmount(BigDecimal.valueOf(orderDetail.getTaxAmount()));
			taxes.add(tax);
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return taxes.toArray(taxes.toArray(new TaxTypeBean[taxes.size()]));
	}

	public CustomerTypeBean buildShipTo(OrderDetail orderDetail) throws Exception {
		CustomerTypeBean customer = new CustomerTypeBean();
		try {
			NameTypeBean name = new NameTypeBean();
			name.setFirst(replaceBlankNullTrim(orderDetail.getShippingFirstName()));
			name.setLast(replaceBlankNullTrim(orderDetail.getShippingLastName()));
			customer.setName(name);
			AddressTypeBean address = new AddressTypeBean();
			address.setAddress1(replaceBlankNullTrim(orderDetail.getShippingAddress1()));
			address.setAddress2(replaceBlankNullTrim(orderDetail.getShippingAddress2()));
			address.setAttention(replaceBlankNullTrim(orderDetail.getAttention()));
			address.setCity(replaceBlankNullTrim(orderDetail.getShippingCity()));
			address.setProvince(replaceBlankNullTrim(orderDetail.getShippingState()));
			address.setPostal(replaceBlankNullTrim(orderDetail.getShippingZipCode()));
			address.setEmail(replaceBlankNullTrim(orderDetail.getShippingEmailAddress()));
			address.setCountry(replaceBlankNullTrim(orderDetail.getShippingCountry()));
			customer.setAddress(address);
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return customer;
	}

	public StoreLocationTypeBean buildStoreLocation() throws Exception {
		StoreLocationTypeBean storeLocation = new StoreLocationTypeBean();
		try {
			storeLocation.setLocation_cd(replaceBlankNullTrim(orderHeader.getLocationCode()));
			storeLocation.setSystem_cd(replaceBlankNullTrim(orderHeader.getSystemCode()));
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return storeLocation;
	}

	public SoldToCustomerTypeBean buildSoldToCustomer() throws Exception {
		SoldToCustomerTypeBean customer = new SoldToCustomerTypeBean();
		try {
			NameTypeBean name = new NameTypeBean();

			name.setFirst(orderHeader.getCustomer().getCustomerFirstName().trim());
			name.setLast(orderHeader.getCustomer().getCustomerLastName().trim());
			if (orderHeader.getCustomer().getCustomerNumber() > 0)
				customer.setCustomer_no(String.valueOf(orderHeader.getCustomer().getCustomerNumber()));
			customer.setName(name);

			AddressTypeBean addressTypeBean = new AddressTypeBean();

			addressTypeBean.setAddress1(replaceBlankNullTrim(orderHeader.getCustomer().getCustomerAddress1()));
			addressTypeBean.setAddress2(replaceBlankNullTrim(orderHeader.getCustomer().getCutomerAddress2()));
			addressTypeBean.setCity(replaceBlankNullTrim(orderHeader.getCustomer().getCustomerCity()));
			addressTypeBean.setProvince(replaceBlankNullTrim(orderHeader.getCustomer().getCustomerState()));
			addressTypeBean.setPostal(replaceBlankNullTrim(orderHeader.getCustomer().getCustomerZipCode()));
			addressTypeBean.setEmail(replaceBlankNullTrim(orderHeader.getCustomer().getCustomerEmailAddress()));
			addressTypeBean.setCountry(replaceBlankNullTrim(orderHeader.getCustomer().getCustomerCountry()));
			addressTypeBean.setPhone1(replaceBlankNullTrim(orderHeader.getCustomer().getBillingPhoneNumber()));

			customer.setAddress(addressTypeBean);

		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

		return customer;
	}

	public static String trim(String input) {
		return input == null ? "" : input.trim();
	}

	public static String replaceBlankNullTrim(String input) {
		String returnValue = null;
		if (input != null) {
			returnValue = input.trim().isEmpty() ? null : input.trim();
		}
		return returnValue;
	}

	public SubmitOrderRequestMessageTypeBean getOrderRequestMessage() {
		return orderRequestMessage;
	}

	public void setOrderRequestMessage(SubmitOrderRequestMessageTypeBean orderRequestMessage) {
		this.orderRequestMessage = orderRequestMessage;
	}

	public SubmitOrderRequestMessageHeaderTypeBean getSubmitOrderRequestMessageHeader() {
		return submitOrderRequestMessageHeader;
	}

	public void setMessageHeader(SubmitOrderRequestMessageHeaderTypeBean messageHeader) {
		this.submitOrderRequestMessageHeader = messageHeader;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}