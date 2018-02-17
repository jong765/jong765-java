package com.pacsun.request;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pacsun.StudentMarks;
import com.pacsun.dao.impl.StudentDAOImpl;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		StudentDAOImpl studentDAOImpl = (StudentDAOImpl) context
				.getBean("studentDAOImpl");
		System.out.println("------Records creation--------");
		studentDAOImpl.create("Zara", 11, 99, 2010);
		studentDAOImpl.create("Nuha", 20, 97, 2010);
		studentDAOImpl.create("Ayan", 25, 100, 2011);
		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = studentDAOImpl.listStudents();
		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}
}
