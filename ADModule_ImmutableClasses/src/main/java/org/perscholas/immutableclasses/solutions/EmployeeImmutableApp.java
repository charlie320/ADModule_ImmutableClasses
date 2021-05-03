package org.perscholas.immutableclasses.solutions;
/*
 * The EmployeeApp demonstrated how mutable objects can be problematic in some
 * situations by allowing objects in one class to to be altered by other parts
 * of an application if the reference is known. In this application, the
 * EmployeeImmutable class has been set up to be immutable which should
 * eliminate the possibility of unintentional class field alterations.
 */
public class EmployeeImmutableApp {

	public static void main(String[] args) {
		// First let's create an Address object
		Address address = new Address("123 Main St", "Dallas", "TX", "78046");
		// Next let's create an EmployeeImmutable instance. The EmployeeImmutable object
		// can only be initialized through the all-arg constructor
		EmployeeImmutable employee = new EmployeeImmutable(1, "John", address);

		// Let's now print out the values of the fields, including the employee's
		// address fields
		System.out.println("Before altered address: " + employee.toString());

		// Now let's modify the original address object
		address.setStreet("456 Main St.");
		address.setCity("San Antonio");
		address.setZipcode("78212");

		// Now let's once again print the employee field values
		System.out.println("After altered address: " + employee.toString());
		// In this application the address for the employee does not change after we altered the 
		// original address object since we designed the EmployeeImmutable class as immutable.
	}
}