package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparator.AgeComparator;
import com.comparator.NameComparator;
import com.model.Student;

public class MainApp {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(1, "James", 17));
		studentList.add(new Student(2, "Tom", 32));
		studentList.add(new Student(3, "Susan", 15));
		studentList.add(new Student(4, "Angela", 11));

		Collections.sort(studentList, new AgeComparator());

		System.out.println("> Sort by age:");
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getAge());
		}

		Collections.sort(studentList, new NameComparator());

		System.out.println("> Sort by name:");
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getAge());
		}

	}
}
