package com.pacsun.locate.submitorder.process;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.microsretail.Locate.LocateProxy;
import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;
import com.pacsun.locate.constants.LocateConstants;
import com.pacsun.locate.submitorder.bean.Address;
import com.pacsun.locate.submitorder.builder.OrderRequestBuilder;
import com.pacsun.locate.submitorder.dto.CustomerDto;
import com.pacsun.locate.submitorder.dto.OrderDetailDto;
import com.pacsun.locate.submitorder.dto.OrderDto;
import com.pacsun.locate.submitorder.handler.OrderResponseHandler;
import com.pacsun.locate.submitorder.model.OrderDetail;
import com.pacsun.locate.submitorder.model.OrderHeader;
import com.pacsun.locate.submitorder.service.OrderHeaderService;

public class LocateSubmitOrderProcess implements LocateConstants {

	@Autowired
	private OrderHeaderService orderHeaderService;

	@Autowired
	private LocateProxy locateProxy;

	@Autowired
	private OrderResponseHandler orderResponseHandler;

	@Autowired
	private OrderRequestBuilder orderRequestBuilder;

	private static final Logger log = Logger.getLogger(LocateSubmitOrderProcess.class);

	public void run() throws RemoteException {

		List<OrderHeader> orderList = getDemandwareOrdersToProcess();
		for (OrderHeader orderHeader : orderList) {
			orderRequestBuilder.setOrderHeader(orderHeader);
			orderRequestBuilder.build();
			SubmitOrderResponseMessageTypeBean response = locateProxy.submitOrder(orderRequestBuilder
					.getOrderRequestMessage());
			orderResponseHandler.processResponse(response);
		}
	}

	public OrderDto buildOrderDto(OrderHeader orderHeader) {
		OrderDto orderDto = new OrderDto();
		int orderId = orderHeader.getOrderHeaderCompositeKey().getOrderNumber();
		orderDto.setOrderId(String.valueOf(orderId));
		orderDto.setTransactionTypeId(orderHeader.getTransactionTypeId());
		orderDto.setReferenceTransactionNumber(String.valueOf(orderHeader.getReferenceOrderNumber()));
		orderDto.setCustomerDto(buildCustomerDto(orderHeader));
		orderDto.setLocationCode(SUBMIT_ORDER_REQUEST_MESSAGE_REQUESTING_STORE_LOCATION_CODE);
		orderDto.setSystemCode(SUBMIT_ORDER_REQUEST_MESSAGE_REQUESTING_STORE_SYSTEM_CODE);

		List<OrderDetailDto> orderDetailDtoList = new ArrayList<OrderDetailDto>();

		Set<OrderDetail> orderDetailList = orderHeader.getOrderDetailList();
		for (OrderDetail orderDetail : orderDetailList) {
			OrderDetailDto orderDetailDto = new OrderDetailDto();
			orderDetailDto.setItemNumber(orderDetail.getItemNumber());
			orderDetailDtoList.add(orderDetailDto);
		}
		orderDto.setOrderDetailList(orderDetailDtoList);

		return orderDto;
	}

	public String getUnderReview(String decision) {
		String underReview;
		if (decision != null & decision.equalsIgnoreCase("REVIEW")) {
			underReview = "Y";
		} else {
			underReview = "N";
		}
		return underReview;
	}

	public CustomerDto buildCustomerDto(OrderHeader orderHeader) {
		CustomerDto customerDto = new CustomerDto();
		Address address = new Address();

		address.setAddress1("address1");
		address.setAddress2("address2");
		address.setCity("city");
		address.setCountry("country");
		address.setEmail("email");
		address.setPostal("postal");
		address.setState("state");

		customerDto.setAddress(address);
		customerDto.setCompanyName("companyName");
		customerDto.setFirstName("firstName");
		customerDto.setLastName("lastName");
		customerDto.setMiddleName("middleName");
		customerDto.setPrefix("prefix");
		customerDto.setSuffix("suffix");
		return customerDto;
	}

	public List<OrderHeader> getDemandwareOrdersToProcess() {
		List<OrderHeader> orderList = orderHeaderService.findUnprocessedOrders();
		return orderList;
	}

}
