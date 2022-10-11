package business;

import core.logging.ILogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (ILogger iLogger : loggers) {
			iLogger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}

	public void update(Instructor instructor) {
		instructorDao.update(instructor);
		for (ILogger iLogger : loggers) {
			iLogger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}

	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
		for (ILogger iLogger : loggers) {
			iLogger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}
}
