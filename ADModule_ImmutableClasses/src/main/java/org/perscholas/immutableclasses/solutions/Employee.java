package org.perscholas.immutableclasses.solutions;
/* 
 * Steps to make this Employee class immutable:
 * 1. Make the class final
 * 2. Mark all fields as private and final
 * 3. Omit or remove all setter methods
 * 4. Create an all-args constructor
 * 5. Initialize all non-primitive mutable fields through the constructor by creating a deep copy
 * 6. Return clones of all non-primitive fields accessed through getter methods
 */
public class Employee {
	int id;
	String name;
	Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", street=" + address.getStreet() + 
				", city=" + address.getCity() + ", State=" + address.getState() + 
				", Zipcode=" + address.getZipcode() + "]";
	}
}