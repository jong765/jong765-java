package com.jk.main;

/* Connection reuse
 * 
 * SQLUtil.close() closes all connections
 * SQLUtil.reset() leave connection open for reuse but does internal cleaup.
 */

import java.sql.SQLException;
import java.util.Date;

import com.jk.bean.StudentBean;
import com.jk.dao.StudentDAO;

public class MainPgm {
	public static void main(String[] args) throws SQLException {

		StudentDAO student = new StudentDAO();
		System.out.println(new Date());
		for (int i = 0; i < 1000; i++) {
			StudentBean alok = new StudentBean();
			alok.setName("Alok" + i);
			alok.setRollNo(i);
			alok.setCourse("MBA" + i);
			alok.setAddress("Ranchi" + i);

			// Adding Data
			student.add(alok);
		}

		System.out.println(new Date());
	}
}