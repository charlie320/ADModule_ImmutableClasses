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
// The class has been declared final
public final class EmployeeImmutable {
	// All fields are private and final
	private final int id;
	private final String name;
	private final Address address;
	
	// All-args constructor
	public EmployeeImmutable(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		// Constructor converts the passed Address argument to a new object to eliminate the 
		// possibility of internal modification via the original argument's reference
		this.address = new Address(address.getStreet(), address.getCity(), 
				address.getState(), address.getZipcode());
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Getter returns a clone of the address field
	public Address getAddress() {
		return new Address(address.getStreet(), address.getCity(), 
				address.getState(), address.getZipcode());
	}

	@Override
	public String toString() {
		return "EmployeeImmutable [id=" + id + ", name=" + name + 
				", street=" + address.getStreet() + ", city=" + 
				address.getCity() + ", State=" + address.getState() + 
				", Zipcode=" + address.getZipcode() + "]";
	}
}