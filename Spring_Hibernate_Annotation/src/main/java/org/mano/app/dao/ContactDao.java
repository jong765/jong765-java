package org.mano.app.dao;

import java.util.List;

import org.mano.app.model.Contact;

public interface ContactDao {
	public List<Contact> findAll();

	public Contact save(Contact contact);

	public void delete(Contact contact);
}