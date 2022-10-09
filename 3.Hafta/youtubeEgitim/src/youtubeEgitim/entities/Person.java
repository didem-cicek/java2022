package youtubeEgitim.entities;

public class Person extends Customer {
	public String FirstName;
	public String LastName;
	
	public int NationalIdeninty;
	public Person() {
		super();
	}
	public Person(String firstName, String lastName, int nationalIdeninty) {
		super();
		FirstName = firstName;
		LastName = lastName;
		NationalIdeninty = nationalIdeninty;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getNationalIdeninty() {
		return NationalIdeninty;
	}
	public void setNationalIdeninty(int nationalIdeninty) {
		NationalIdeninty = nationalIdeninty;
	}
	
}
