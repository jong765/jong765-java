package com.pacsun.cybersource.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.pacsun.cybersource.connect.DBConnector;
import com.pacsun.cybersource.dto.SettlementDto;
import com.pacsun.util.DateFormatterUtil;

public class SettlementDaoImpl extends PacSunDao implements SettlementDao {

	private static final Logger log = Logger.getLogger(SettlementDaoImpl.class);

	public SettlementDaoImpl(Properties dbProperties) {
		super(dbProperties);
	}

	public List<SettlementDto> searchUnprocessedSettlements() throws Exception {
		List<SettlementDto> settlementList = new ArrayList<SettlementDto>();

		sb = new StringBuilder();
		sb.append("SELECT SMREFC AS MerchantReferenceCode,");
		sb.append("TRIM(SREQID) AS AuthRequestId, ");
		sb.append("TRIM(SCAPID) AS CaptureRequestId, ");
		sb.append("TRIM(STOKEN) AS TokenNumber, ");
		sb.append("SSHSEQ AS Sequence, ");
		sb.append("STOCNT AS TotalCount, ");
		sb.append("SSDSEQ AS SendSequenceFlag, ");
		sb.append("SPUAMT AS Amount, ");
		sb.append("TRIM(SATION) AS Action ");
		sb.append("FROM ");
		sb.append(dbProperties.get(SETTLEMENT_FILE));
		sb.append(" WHERE SPROC = 'U'");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			SettlementDto settlementDto = null;
			rs = ps.executeQuery();
			while (rs.next()) {
				settlementDto = new SettlementDto(rs.getString("Action"), rs.getInt("MerchantReferenceCode"),
						rs.getString("AuthRequestId"), rs.getString("CaptureRequestId"), rs.getString("TokenNumber"),
						rs.getInt("Sequence"), rs.getInt("TotalCount"), rs.getString("SendSequenceFlag"), rs.getDouble("Amount"));
				settlementList.add(settlementDto);
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error("SQL:" + sql);
			throw new SQLException(e);
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null) {
				conn.close();
				DBConnector.setConnection(null);
			}
		}
		return settlementList;
	}

	@Override
	public void updateProcessedCapture(String processFlag, SettlementDto settlementDto, String captureRequestId, String reasonCode)
			throws Exception {

		sb = new StringBuilder();
		sb.append("UPDATE ");
		sb.append(dbProperties.get(SETTLEMENT_FILE));
		sb.append(" SET SPROC = ?,");// 1
		sb.append(" SRSNCD = ?,");// 2
		sb.append(" SCAPID = ?,");// 3
		sb.append(" SPRDAT = ?,");// 4
		sb.append(" SPRTIM = ?");// 5
		sb.append(" WHERE SMREFC = ?");// 6
		sb.append(" AND TRIM(SREQID) = ?");// 7
		sb.append(" AND SSHSEQ = ?");// 8
		sb.append(" AND STOCNT = ?");// 9
		sb.append(" AND TRIM(SATION) = ?");// 10
		sb.append(" AND SPROC = 'U'");
		sb.append(" WITH NC");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, processFlag);
			ps.setString(2, reasonCode);
			ps.setString(3, captureRequestId);
			ps.setInt(4, Integer.parseInt(DateFormatterUtil.getCurrentDate()));
			ps.setInt(5, Integer.parseInt(DateFormatterUtil.getCurrentTime()));
			ps.setInt(6, settlementDto.getMerchantReferenceCode());
			ps.setString(7, settlementDto.getAuthRequestId());
			ps.setInt(8, settlementDto.getSequence());
			ps.setInt(9, settlementDto.getTotalCount());
			ps.setString(10, settlementDto.getAction());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			log.error(this.getClass().getName() + " : " + "MerchantReferenceCode=" + settlementDto.getMerchantReferenceCode()
					+ ", AuthRequestId=" + settlementDto.getAuthRequestId());
			log.error("SQL:" + sql);
			throw new SQLException(e);
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			// Leave connection open
			// if (conn != null) {
			// conn.close();
			// DBConnector.setConnection(null);
			// }
		}

	}

	@Override
	public void updateProcessedCredit(SettlementDto settlementDto, String reasonCode) throws Exception {

		sb = new StringBuilder();
		sb.append("UPDATE ");
		sb.append(dbProperties.get(SETTLEMENT_FILE));
		sb.append(" SET SPROC = 'P',");
		sb.append(" SRSNCD = ?,");// 1
		sb.append(" SPRDAT = ?,");// 2
		sb.append(" SPRTIM = ?");// 3
		sb.append(" WHERE SMREFC = ?");// 4
		sb.append(" AND TRIM(SREQID) = ?");// 5
		sb.append(" AND SSHSEQ = ?");// 6
		sb.append(" AND STOCNT = ?");// 7
		sb.append(" AND TRIM(SATION) = ?");// 8
		sb.append(" AND SPROC = 'U'");
		sb.append(" WITH NC");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, reasonCode);
			ps.setInt(2, Integer.parseInt(DateFormatterUtil.getCurrentDate()));
			ps.setInt(3, Integer.parseInt(DateFormatterUtil.getCurrentTime()));
			ps.setInt(4, settlementDto.getMerchantReferenceCode());
			ps.setString(5, settlementDto.getAuthRequestId());
			ps.setInt(6, settlementDto.getSequence());
			ps.setInt(7, settlementDto.getTotalCount());
			ps.setString(8, settlementDto.getAction());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			log.error(this.getClass().getName() + " : " + "MerchantReferenceCode=" + settlementDto.getMerchantReferenceCode()
					+ ", AuthRequestId=" + settlementDto.getAuthRequestId());
			log.error("SQL:" + sql);
			throw new SQLException(e);
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			// Leave connection open
			// if (conn != null) {
			// conn.close();
			// DBConnector.setConnection(null);
			// }
		}

	}

	@Override
	public void updateForError(SettlementDto settlementDto, String reasonCode) throws Exception {

		sb = new StringBuilder();
		sb.append("UPDATE ");
		sb.append(dbProperties.get(SETTLEMENT_FILE));
		sb.append(" SET SPROC = 'E',");
		sb.append(" SRSNCD = ?,");// 1
		sb.append(" SPRDAT = ?,");// 2
		sb.append(" SPRTIM = ?");// 3
		sb.append(" WHERE SMREFC = ?");// 4
		sb.append(" AND TRIM(SREQID) = ?");// 5
		sb.append(" AND SSHSEQ = ?");// 6
		sb.append(" AND STOCNT = ?");// 7
		sb.append(" AND TRIM(SATION) = ?");// 8
		sb.append(" AND SPROC = 'U'");
		sb.append(" WITH NC");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, reasonCode);
			ps.setInt(2, Integer.parseInt(DateFormatterUtil.getCurrentDate()));
			ps.setInt(3, Integer.parseInt(DateFormatterUtil.getCurrentTime()));
			ps.setInt(4, settlementDto.getMerchantReferenceCode());
			ps.setString(5, settlementDto.getAuthRequestId());
			ps.setInt(6, settlementDto.getSequence());
			ps.setInt(7, settlementDto.getTotalCount());
			ps.setString(8, settlementDto.getAction());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			log.error(this.getClass().getName() + " : " + "MerchantReferenceCode=" + settlementDto.getMerchantReferenceCode()
					+ ", RequestId=" + settlementDto.getAuthRequestId());
			log.error("SQL:" + sql);
			throw new SQLException(e);
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			// Leave connection open
			// if (conn != null) {
			// conn.close();
			// DBConnector.setConnection(null);
			// }
		}

	}

}
