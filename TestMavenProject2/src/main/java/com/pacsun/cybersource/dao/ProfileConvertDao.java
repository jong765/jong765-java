package com.pacsun.cybersource.dao;

import java.util.List;

import com.pacsun.cybersource.dto.CustomerProfileConverterDto;

public interface ProfileConvertDao {

	public List<CustomerProfileConverterDto> searchUnprocessedOrders() throws Exception;

	public void updateProcessedOrder(int merchantReferenceCode, String token) throws Exception;

	public void updateForError(int merchantReferenceCode) throws Exception;

}
