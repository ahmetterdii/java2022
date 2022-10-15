package nLayeredApp.business;

import java.util.ArrayList;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;

public class IsExist {
	ArrayList<String> List = new ArrayList<String>();
	
	public void add(Course course, Category category) throws Exception {
		if(List.contains(course.getName()) || List.contains(category.getName())) {
			throw new Exception("Kurs veya Kategori zaten mevcut.");
		}
		else {
			List.add(course.getName());
			List.add(category.getName());
		}
	}
}
