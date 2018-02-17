package com.pacsun.process;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.pacsun.bean.Employee;
import com.pacsun.bean.Employees;

public class TestEmployeeMarshing {
	static Employees employees = new Employees();
	static {
		employees.setEmployees(new ArrayList<Employee>());

		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Lokesh");
		emp.setLastName("Gupta");
		emp.setIncome(100.0);

		employees.getEmployees().add(emp);
	}

	public static void main(String[] args) throws JAXBException {
		marshalingExample();
		System.out.println("************************************************");
		unMarshalingExample();
	}

	private static void marshalingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(employees, System.out);
		jaxbMarshaller.marshal(employees, new File("Custom/xml/employees.xml"));
	}

	private static void unMarshalingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Employees emps = (Employees) jaxbUnmarshaller.unmarshal(new File(
				"Custom/xml/employees.xml"));

		for (Employee emp : emps.getEmployees()) {
			System.out.println(emp.getId());
			System.out.println(emp.getFirstName());
		}
	}
}