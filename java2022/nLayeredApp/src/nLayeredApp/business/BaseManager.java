package nLayeredApp.business;

import nLayeredApp.core.logging.Logger;
import nLayeredApp.dataAccess.BaseDao;
import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Instructor;

public class BaseManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	IsExist isExist;
	
	public BaseManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course, Category category, Instructor instructor) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("Kurs fiyatý 0'dan küçük olamaz.");
		}
		else {
			baseDao.add(course, category, instructor);
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
	}
}
