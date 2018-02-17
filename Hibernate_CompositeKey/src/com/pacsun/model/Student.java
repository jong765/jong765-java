package com.pacsun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pacsun.model.embeddable.StudentPK;

@Entity
@Table(name = "JKIM2.STUDENT")
public class Student {
	private StudentPK studentPK = null;
	private String address = null;

	public Student(StudentPK studentPK, String address) {
		super();
		this.studentPK = studentPK;
		this.address = address;
	}

	/**
	 * @param studentPK
	 *            the studentPK to set
	 */
	public void setStudentPK(StudentPK studentPK) {
		this.studentPK = studentPK;
	}

	/**
	 * @return the studentPK
	 */
	@Id
	public StudentPK getStudentPK() {
		return studentPK;
	}

	/**
	 * @return the address
	 */
	@Column(name = "STUDENT_ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((studentPK == null) ? 0 : studentPK.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		return result;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (studentPK == null) {
			if (other.studentPK != null) {
				return false;
			}
		} else if (!studentPK.equals(other.studentPK)) {
			return false;
		}
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		return true;
	}
}