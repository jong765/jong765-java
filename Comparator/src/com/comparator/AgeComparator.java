package com.comparator;

import java.util.Comparator;

import com.model.Student;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student student1 = (Student) o1;
		Student student2 = (Student) o2;

		if (student1.getAge() == student2.getAge())
			return 0;
		else if (student1.getAge() > student2.getAge())
			return 1;
		else
			return -1;
	}

}
