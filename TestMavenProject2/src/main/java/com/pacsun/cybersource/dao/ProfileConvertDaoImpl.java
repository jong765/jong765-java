package com.pacsun.cybersource.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.pacsun.cybersource.connect.DBConnector;
import com.pacsun.cybersource.dto.CustomerProfileConverterDto;
import com.pacsun.util.DateFormatterUtil;

public class ProfileConvertDaoImpl extends PacSunDao implements ProfileConvertDao {

	private static final Logger log = Logger.getLogger(ProfileConvertDaoImpl.class);

	public ProfileConvertDaoImpl(Properties dbProperties) {
		super(dbProperties);
	}

	public List<CustomerProfileConverterDto> searchUnprocessedOrders() throws Exception {
		List<CustomerProfileConverterDto> orderList = new ArrayList<CustomerProfileConverterDto>();

		sb = new StringBuilder();
		sb.append("SELECT TMREFC AS MerchantReferenceCode,");
		sb.append("TRIM(TREQID) AS AuthRequestId ");
		sb.append("FROM ");
		sb.append(dbProperties.get(TOKEN_FILE));
		sb.append(" WHERE TPROC = 'U' ");
		sb.append("FETCH FIRST ");
		sb.append(dbProperties.get(MAX_RECORDS_TOKEN_CONVERSION));
		sb.append(" ROWS ONLY");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			CustomerProfileConverterDto customerProfileConverterDto = null;
			rs = ps.executeQuery();
			while (rs.next()) {
				customerProfileConverterDto = new CustomerProfileConverterDto(rs.getInt("MerchantReferenceCode"),
						rs.getString("AuthRequestId"));
				orderList.add(customerProfileConverterDto);
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

		return orderList;
	}

	@Override
	public void updateProcessedOrder(int merchantReferenceCode, String token) throws Exception {

		sb = new StringBuilder();
		sb.append("UPDATE ");
		sb.append(dbProperties.get(TOKEN_FILE));
		sb.append(" SET TPROC = 'P',");
		sb.append(" TTOKEN = ?,");
		sb.append(" TPRDAT = ?,");
		sb.append(" TPRTIM = ?");
		sb.append(" WHERE TMREFC = ?");
		sb.append(" AND TPROC = 'U'");
		sb.append(" WITH NC");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, token);
			ps.setInt(2, Integer.parseInt(DateFormatterUtil.getCurrentDate()));
			ps.setInt(3, Integer.parseInt(DateFormatterUtil.getCurrentTime()));
			ps.setInt(4, merchantReferenceCode);
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			log.error(this.getClass().getName() + " : " + "MerchantReferenceCode=" + merchantReferenceCode + ", Token=" + token);
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
	public void updateForError(int merchantReferenceCode) throws Exception {

		sb = new StringBuilder();
		sb.append("UPDATE ");
		sb.append(dbProperties.get(TOKEN_FILE));
		sb.append(" SET TPROC = 'E',");
		sb.append(" TPRDAT = ?,");
		sb.append(" TPRTIM = ?");
		sb.append(" WHERE TMREFC = ?");
		sb.append(" AND TPROC = 'U'");
		sb.append(" WITH NC");

		sql = sb.toString();

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(DateFormatterUtil.getCurrentDate()));
			ps.setInt(2, Integer.parseInt(DateFormatterUtil.getCurrentTime()));
			ps.setInt(3, merchantReferenceCode);
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			log.error(this.getClass().getName() + " : " + "MerchantReferenceCode=" + merchantReferenceCode);
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
