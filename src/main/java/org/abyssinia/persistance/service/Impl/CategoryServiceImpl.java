package org.abyssinia.persistance.service.Impl;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.abyssinia.persistance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.abyssinia.dao.CategoryDao;
import org.abyssinia.domain.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public void save(Category category) {
		categoryDao.save(category);
	}

	@Override
	public void update(Category category) {
		categoryDao.save(category);
	}

	@Override
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public Category findOne(Long id) {
		return categoryDao.findOne(id);
	}

}
