package dataAccess;

import entities.Course;

public interface ICourseDao {
	void add(Course course);

	void update(Course course);

	void delete(Course course);
}
