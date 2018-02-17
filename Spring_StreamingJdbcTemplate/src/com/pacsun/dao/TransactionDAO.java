package com.pacsun.dao;

import java.util.ArrayList;
import com.pacsun.domain.Transaction;

public interface TransactionDAO {

	public ArrayList<Transaction> findAll();

}
