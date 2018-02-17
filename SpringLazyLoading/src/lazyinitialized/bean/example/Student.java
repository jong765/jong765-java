package lazyinitialized.bean.example;

public class Student {
	private String name;
	private Address address;

	public Student() {
		System.out.println("Inside Student Constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}