package nLayeredApp.dataAccess;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Instructor;

public interface BaseDao {
	void add(Course course, Category category, Instructor instructor);
}
