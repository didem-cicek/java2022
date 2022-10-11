package entities;

public class Course {
	public String courseName;
	public String description;
	public double price;
	public Category category;

	public Course() {
	}

	public Course(String courseName, String description, double price, Category category) {
		this.courseName = courseName;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
