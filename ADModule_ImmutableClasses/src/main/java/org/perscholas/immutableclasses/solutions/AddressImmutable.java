package org.perscholas.immutableclasses.solutions;

public final class AddressImmutable {
	private final String street;
	private final String city;
	private final String state;
	private final String zipcode;
	
	// There is no need to make deep copies of the original arguments since they are all of the 
	// String type which is immutable.
	public AddressImmutable(String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	// Similarly, the getters do not need to return clones since all fields are of the String type 
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

}