package dataAccess;

import entities.Category;

public interface ICategoryDao {
	void add(Category category);

	void update(Category category);

	void delete(Category category);

}
