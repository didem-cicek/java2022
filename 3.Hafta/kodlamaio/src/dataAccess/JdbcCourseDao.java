package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcCourseDao implements ICourseDao, ICategoryDao, IInstructorDao {
	@Override
	public void add(Course course) {
		System.out.println("JDBC Veritabanına kayıt eklendi.");
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC Veritabanına güncellenme yapıldı.");

	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC Veritabanına silme işlemi yapıldı.");

	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC Veritabanına kayıt eklendi.");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("JDBC Veritabanına güncellenme yapıldı.");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("JDBC Veritabanına silme işlemi yapıldı.");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("JDBC Veritabanına kayıt eklendi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC Veritabanına güncellenme yapıldı.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC Veritabanına silme işlemi yapıldı.");
		
	}

}
