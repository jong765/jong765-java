package com.pacsun.cybersource.dao;

import java.util.List;

import com.pacsun.cybersource.dto.SettlementDto;

public interface SettlementDao {

	public List<SettlementDto> searchUnprocessedSettlements() throws Exception;

	public void updateProcessedCapture(String processFlag, SettlementDto settlementDto, String captureRequestId, String reasonCode)
			throws Exception;

	public void updateProcessedCredit(SettlementDto settlementDto, String reasonCode) throws Exception;

	public void updateForError(SettlementDto settlementDto, String reasonCode) throws Exception;

}
