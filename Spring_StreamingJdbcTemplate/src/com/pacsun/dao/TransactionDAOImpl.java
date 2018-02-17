package com.pacsun.dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.pacsun.dao.streaming.StreamingJdbcTemplate;
import com.pacsun.domain.Transaction;

public class TransactionDAOImpl implements TransactionDAO, InitializingBean {

	Logger log = LoggerFactory.getLogger(TransactionDAOImpl.class);

	private DataSource dataSource;
	private StreamingJdbcTemplate dbt = new StreamingJdbcTemplate();

	public ArrayList<Transaction> findAll() {
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

		String sql = "SELECT TransactionId, ProductId, ProductDescription, CustomerId, Quantity"
				+ "  FROM JKIM2.JKTransaction ";

		log.debug("SQL query for Retrieving transaction data : " + sql);

		dbt.setFetchSize(10000);
		SqlRowSet rs = dbt.queryForRowSet(sql);

		boolean hasRecs = rs.first();
		while (hasRecs) {
			transactionList.add(new Transaction(Integer.parseInt(rs
					.getString("TransactionId")), rs.getString("ProductId"), rs
					.getString("ProductDescription"), Integer.parseInt(rs
					.getString("CustomerId")), Integer.parseInt(rs
					.getString("Quantity"))));
			hasRecs = rs.next();
		}

		return transactionList;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		dbt.setDataSource(dataSource);
	}

}
