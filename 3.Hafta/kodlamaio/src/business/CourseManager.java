package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] loggers;
	List<Course> courses = new ArrayList<Course>();

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		for (Course courseList : courses) {
			if (courseList.getCourseName() == course.getCourseName()) {
				throw new Exception("Aynı isimde kurs ekleyemezsiniz.");
			}
		}

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		courseDao.add(course);
		for (ILogger iLogger : loggers) {
			iLogger.log(course.getCourseName());
		}
	}

	public void update(Course course) {
		courseDao.update(course);
		for (ILogger iLogger : loggers) {
			iLogger.log(course.getCourseName());
		}

	}

	public void delete(Course course) {
		courseDao.delete(course);
		for (ILogger iLogger : loggers) {
			iLogger.log(course.getCourseName());
		}

	}

}
