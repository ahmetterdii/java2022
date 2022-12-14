package nLayeredApp;

import nLayeredApp.business.BaseManager;
import nLayeredApp.business.IsExist;
import nLayeredApp.core.logging.FileLogger;
import nLayeredApp.core.logging.Logger;
import nLayeredApp.core.logging.MailLogger;
import nLayeredApp.dataAccess.HibernateDao;
import nLayeredApp.dataAccess.JdbcDao;
import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		IsExist isExist = new IsExist();
		Logger[] loggers = {new FileLogger(), new MailLogger()};
		BaseManager baseManager = new BaseManager(new JdbcDao(), loggers);
		
		Course course1 = new Course(1,"Java",10000);
		Category category1 = new Category(1,"Yaz?l?m Geli?tirme");
		Instructor instructor1 = new Instructor(1,"Engin","Demiro?",35);
		isExist.add(course1, category1);
		baseManager.add(course1, category1, instructor1);
		
		Course course2 = new Course(1,"C#",60000);
		Category category2 = new Category(1,"Yaz?l?m Geli?tirme");
		Instructor instructor2 = new Instructor(1,"Engin","Demiro?",35);
		isExist.add(course1, category1);
		baseManager.add(course1, category1, instructor1);
		
	}

}
