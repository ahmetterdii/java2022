package nLayeredApp.dataAccess;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Instructor;

public class JdbcDao implements BaseDao {

	@Override
	public void add(Course course, Category category, Instructor instructor) {
		System.out.println("Kurs Ad? : " + course.getName() + " - E?itmen Ad? : " + instructor.getFirstName() + " - Kategori : " + category.getName() + " - JDBC ile veritaban?na eklendi.");
	}

}
