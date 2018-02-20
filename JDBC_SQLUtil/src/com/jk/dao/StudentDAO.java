package com.jk.dao;

import java.sql.SQLException;

import com.jk.bean.StudentBean;
import com.jk.util.SQLFacade;

public class StudentDAO {
	SQLFacade sqlUtil = null;

	public StudentDAO() throws SQLException {
		sqlUtil = new SQLFacade();
	}

	public void add(StudentBean studentBean) {
		try {
			String queryString = "INSERT INTO student(RollNo, Name, Course, Address) VALUES(?,?,?,?)";
			sqlUtil.setSQL(queryString);
			sqlUtil.setInt(1, studentBean.getRollNo());
			sqlUtil.setString(2, studentBean.getName());
			sqlUtil.setString(3, studentBean.getCourse());
			sqlUtil.setString(4, studentBean.getAddress());
			sqlUtil.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (sqlUtil != null) {
				sqlUtil.reset();
			}

		}

	}

}