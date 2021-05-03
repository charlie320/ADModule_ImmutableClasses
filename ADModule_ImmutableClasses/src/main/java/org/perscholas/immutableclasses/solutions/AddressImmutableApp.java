package org.perscholas.immutableclasses.solutions;
/*
 * Another solution to the employee address being altered by another source through the address
 * reference, is to make the Address class immutable. In this example we will use a mutable 
 * employee and an immutable Address object to protect the employee's address field from being 
 * unintentionally changed. Since the address field is now immutable, all fields of the Employee 
 * class are now safe from unintentional alteration.
 */
public class AddressImmutableApp {

	public static void main(String[] args) {
		// First let's create an Address object
		AddressImmutable address = new AddressImmutable("123 Main St", "Dallas", "TX", "78046");
		// Next let's create an Employee2 instance. We created the class Employee2 to accept
		// the type AddressImmutable instead of Address.
		Employee2 employee = new Employee2();
		employee.setId(1);
		employee.setName("John");
		employee.setAddress(address);

		// Let's now print out the values of the fields, including the employee's
		// address fields.
		System.out.println("Before address is reassigned: " + employee.toString());

		// We cannot reset the values to the original address instance or we will get 
		// compile errors.
//		address.setStreet("456 Main St.");
//		address.setCity("San Antonio");
//		address.setZipcode("78212");
		// Also, if we assign a new AddressImmutable object to the "address" variable, the 
		// reference changes, so the original employee address will not change.
		address = new AddressImmutable("123 Main St", "San Antonio", "TX", "73456");

		// Now let's once again print the employee field values
		System.out.println("After address is reassigned: " + employee.toString());
		// The address for the employee does not change after we assigned a new AddressImmutable
		// object to the variable "address" since we created a new object with a different 
		// reference.
	}
}