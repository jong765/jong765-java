package com.pacsun.process;

import java.util.List;

import com.pacsun.dao.TransactionDAO;
import com.pacsun.domain.Transaction;

public class TransactionProcess {

	private TransactionDAO transactionDAO;

	public void run() {

		List<Transaction> transactionList = transactionDAO.findAll();

		for (Transaction transaction : transactionList) {
			System.out.println(transaction.getTransactionId() + ", "
					+ transaction.getProductId() + ", "
					+ transaction.getProductDescription() + ", "
					+ transaction.getCustomerId() + ", "
					+ transaction.getQuantity());
		}

	}

	public TransactionDAO getTransactionDAO() {
		return transactionDAO;
	}

	public void setTransactionDAO(TransactionDAO transactionDAO) {
		this.transactionDAO = transactionDAO;
	}
	
}
