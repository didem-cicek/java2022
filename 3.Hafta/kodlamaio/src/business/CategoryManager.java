package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	List<Category> categories = new ArrayList<Category>();

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category categoryList : categories) {
			if (categoryList.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Aynı isimde kategori ekleyemezsiniz.");
			}
		}
		categoryDao.add(category);
		for (ILogger iLogger : loggers) {
			iLogger.log(category.getCategoryName());
		}
	}

	public void update(Category category) {
		categoryDao.update(category);
		for (ILogger iLogger : loggers) {
			iLogger.log(category.getCategoryName());
		}
	}

	public void delete(Category category) {
		categoryDao.delete(category);
		for (ILogger iLogger : loggers) {
			iLogger.log(category.getCategoryName());
		}
	}

}
