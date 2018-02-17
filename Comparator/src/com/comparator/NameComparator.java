package com.comparator;

import java.util.Comparator;

import com.model.Student;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student student1 = (Student) o1;
		Student student2 = (Student) o2;

		return (student1.getName().compareToIgnoreCase(student2.getName()));
	}

}
