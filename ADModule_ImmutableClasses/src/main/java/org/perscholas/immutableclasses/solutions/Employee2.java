package org.perscholas.immutableclasses.solutions;
/* 
 * This class was created to demonstrate the use of an immutable address.
 */
public class Employee2 {
	int id;
	String name;
	AddressImmutable address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressImmutable getAddress() {
		return address;
	}
	public void setAddress(AddressImmutable address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", street=" + address.getStreet() + 
				", city=" + address.getCity() + ", State=" + address.getState() + 
				", Zipcode=" + address.getZipcode() + "]";
	}
	
}
