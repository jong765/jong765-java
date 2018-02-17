package com.pacsun.process;

import java.util.Date;

import com.pacsun.dto.OrderDto;

public class MainProcess {

	public static void main(String[] args) {
		OrderDto orderDto = new OrderDto(8383734, new Date(), new Date(), "Jennifer Liu");
		System.out.println(orderDto.toString());

	}

}
