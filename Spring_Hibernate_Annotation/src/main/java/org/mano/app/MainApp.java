package org.mano.app;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.mano.app.dao.ContactDao;
import org.mano.app.model.Address;
import org.mano.app.model.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ContactDao contactDao = (ContactDao) ctx.getBean("contactDao", ContactDao.class);

		Contact c[] = new Contact[5];
		c[0] = new Contact("Andrew", "Jones", new Date(), "aj@gmail.com", "123456789");
		c[0].addAddress(new Address("111 ABC Street", "LA", "US", "112233"));
		c[0].addAddress(new Address("222 ERT Street", "CA", "US", "445566"));
		c[0].addAddress(new Address("333 PPP Street", "LA", "US", "667788"));

		c[1] = new Contact("Peter", "Parker", new Date(), "pp@hotmail.com", "654213688");
		c[1].addAddress(new Address("999, XYZ street", "SOMEWHERE", "UK", "223344"));
		c[1].addAddress(new Address("888, KKK street", "ANYWHERE", "UK", "776644"));

		c[2] = new Contact("Lee", "Falk", new Date(), "lf@hotmail.com", "73645542");
		c[2].addAddress(new Address("555, QPQ street", "NOWHERE", "IN", "776655"));
		c[2].addAddress(new Address("444, WIW street", "INWHERE", "IN", "775544"));

		c[3] = new Contact("Arun", "Roy", new Date(), "ar@gmail.com", "617864872");
		c[3].addAddress(new Address("767, TTT street", "DL", "IN", "667788"));
		c[3].addAddress(new Address("898, YYY street", "MB", "IN", "554477"));

		c[4] = new Contact("Simrit", "Ahuja", new Date(), "sa@hotmail.com", "78766542");
		c[4].addAddress(new Address("90, ZZZ street", "GK", "SA", "339988"));

		for (int i = 0; i < 5; i++) {
			contactDao.save(c[i]);
		}

		List<Contact> contacts = contactDao.findAll();
		for (Contact con : contacts) {
			System.out.println("---------------------------------------------------");
			System.out.println(con.toString());
			Set<Address> addresses = con.getContactAddress();
			int i = 1;
			for (Address a : addresses) {
				System.out.printf("Address %d: %s", i, a.toString());
				System.out.println();
				i++;
			}

		}

	}
}
