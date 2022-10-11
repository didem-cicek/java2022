package entities;

public class Instructor {
	public String firstName;
	public String lastName;
	public String biography;

	public Instructor() {
	}

	public Instructor(String firstName, String lastName, String biography) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.biography = biography;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

}
