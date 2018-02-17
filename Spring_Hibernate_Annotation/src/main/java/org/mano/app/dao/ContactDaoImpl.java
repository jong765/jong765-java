package org.mano.app.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.mano.app.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "contactDao")
@Transactional
public class ContactDaoImpl implements ContactDao {
	private final Log log = LogFactory.getLog(ContactDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Contact> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Contact c").list();
	}

	public Contact save(Contact contact) {
		sessionFactory.getCurrentSession().saveOrUpdate(contact);
		log.info("Contact Saved..." + contact.getId());
		return contact;
	}

	public void delete(Contact contact) {
		sessionFactory.getCurrentSession().delete(contact);
		log.info("Contact removed..." + contact.getId());
	}
}