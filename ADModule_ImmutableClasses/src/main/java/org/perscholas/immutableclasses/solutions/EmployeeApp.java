package org.perscholas.immutableclasses.solutions;
/* This application demonstrates one of the problems that can occur when a class is mutable. 
 * In this case, the Employee is class is mutable and includes a field that is of a type that 
 * is also mutable - the Address class. Upon creating an Employee instance, anyone with a reference
 * to the original Address object can change it's values which will in turn change the values of 
 * the Address field of the employee.*/
public class EmployeeApp {
	public static void main(String[] args) {
		// First let's create an Address object
		Address address = new Address("123 Main St", "Dallas", "TX", "78046");
		// Next let's create an Employee
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("John");
		employee.setAddress(address);
		
		// Let's now print out the values of the fields, including the employee's address fields
		System.out.println("Before altered address: " + employee.toString());
		
		// Now let's modify the original address object
		address.setStreet("456 Main St.");
		address.setCity("San Antonio");
		address.setZipcode("78212");
		
		// Now let's once again print the employee field values
		System.out.println("After altered address: " + employee.toString());
		
		/* The fact that we were able to modify the Employee class through another object
		 * if problematic in many situations and introduces the chances for programming bugs and 
		 * security violations. The solution is to make the class immutable which we will be
		 * demonstrated in the EmployeeImmutableApp.java application. */
	}
}