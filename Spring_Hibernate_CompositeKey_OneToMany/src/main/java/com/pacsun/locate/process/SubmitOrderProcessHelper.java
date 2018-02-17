package com.pacsun.locate.process;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.service.IOrderHeaderService;

@Component
@Lazy
public class SubmitOrderProcessHelper {

	@Autowired
	protected IOrderHeaderService orderHeaderService;

	public List<OrderHeader> getDemandwareOrdersToProcess() throws Exception {
		List<OrderHeader> orderHeaderList = orderHeaderService.findUnprocessedOrders();
		return orderHeaderList;
	}

}
