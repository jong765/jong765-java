package com.pacsun.cybersource.handler;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.pacsun.cybersource.dao.SettlementDao;
import com.pacsun.cybersource.dto.SettlementDto;

public interface Handler {

	public Map<String, String> callAPI(SettlementDao settlementDao, SettlementDto settlementDto, Properties cybsProperties,
			List<Integer> errorlist) throws Exception;

	public void processReply(Map<String, String> reply, SettlementDto settlementDto, SettlementDao settlementDao, List<Integer> errorList)
			throws Exception;

}
