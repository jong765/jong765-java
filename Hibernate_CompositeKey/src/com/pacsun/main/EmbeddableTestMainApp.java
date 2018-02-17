package com.pacsun.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pacsun.model.Student;
import com.pacsun.model.embeddable.StudentPK;
import com.pacsun.util.HibernateUtil;

public class EmbeddableTestMainApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		boolean isError = false;

		try {
			session.beginTransaction();
			StudentPK studentPK = new StudentPK(1, "Test Student");
			Student student = new Student(studentPK, "Test Address");
			session.save(student);

			studentPK = new StudentPK(1, "Test Student NEW");
			student = new Student(studentPK, "Test Address NEW");
			session.save(student);
		} catch (Exception exp) {
			exp.printStackTrace();
			isError = true;
		} finally {
			if (isError) {
				session.getTransaction().rollback();
			} else {
				session.getTransaction().commit();
			}
		}
	}
}