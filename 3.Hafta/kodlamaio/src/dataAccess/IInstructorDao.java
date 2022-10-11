package dataAccess;

import entities.Instructor;

public interface IInstructorDao {
	void add(Instructor instructor);
	void update(Instructor instructor);
	void delete(Instructor instructor);
}
