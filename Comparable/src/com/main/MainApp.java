package com.main;

import java.util.ArrayList;
import java.util.Collections;

import com.model.Student;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "James Bond", 32));
		studentList.add(new Student(2, "Susan Smith", 25));
		studentList.add(new Student(3, "Tom Sawyer", 11));
		studentList.add(new Student(4, "Solomon Kang", 43));

		Collections.sort(studentList);

		for (Student student : studentList) {
			System.out.println(student.getName());

		}

	}

}
