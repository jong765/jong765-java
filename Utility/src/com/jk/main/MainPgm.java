package com.jk.main;

import java.util.Date;

import com.jk.bean.StudentBean;
import com.jk.dao.StudentDAO;

public class MainPgm {
	public static void main(String[] args) {

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
		// Deleting Data
		// student.delete(7);
		// Updating Data
		// student.update(tinkoo);
		// Displaying Data

		// student.findAll();
		// student.findAll();
		// student.findAll();
	}
}