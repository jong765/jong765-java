/*
 * @XmlRootElement define the root element for the XML to be produced with @XmlRootElement JAXB annotation. 
 * The name of the root XML element is derived from the class name.
 * You can also specify the name of the root element of the XML using its name attribute, 
 * for example @XmlRootElement(name = "CompanyContact")
 * 
 * XmlAccessType.PUBLIC_MEMBER
 * PUBLIC_MEMBER is the default access type in JAXB.  
 * It means that a JAXB implementation will generate bindings for:
 *    public fields
 *    annotated fields
 *    properties
 * XmlAccessType.PROPERTY
 * When the PROPERTY access type is used, JAXB implementations will generate bindings for:
 *    annotated fields
 *    properties
 * XmlAccessType.FIELD
 * The use of access type FIELD will cause JAXB implementations to create bindings for:
 *    fields
 *    annotated properties
 * 
 * @XmlElement(name = "neuName")
 * Define the XML element which will be used. 
 * Only need to be used if the neuName is different then the JavaBeans Name
 * 
 */

package com.pacsun.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {
	
	@XmlElement(name = "employee")
	private List<Employee> employees = null;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
