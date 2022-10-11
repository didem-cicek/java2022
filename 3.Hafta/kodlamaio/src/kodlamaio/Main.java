package kodlamaio;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		Category category = new Category("Programlama");
		CategoryManager categoryManager = new CategoryManager(new JdbcCourseDao(), loggers);
		categoryManager.add(category);
		categoryManager.update(category);
		
		Instructor instructor = new Instructor("Engin", "Demiroğ", "Engin Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcCourseDao(), loggers);
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		
		Course course = new Course("Yazılım Geliştirici Yetiştirme Kampı - JAVA", "2022", 10, category);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		courseManager.update(course);
		
		System.out.println(course.courseName + " " + course.description + " " + course.price + " " + course.category.categoryName + " " +  instructor.firstName + " " + instructor.lastName);
		
	}

}
