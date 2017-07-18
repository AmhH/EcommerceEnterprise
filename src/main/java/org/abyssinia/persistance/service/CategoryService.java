package org.abyssinia.persistance.service;

import java.util.List;

import org.abyssinia.domain.Category;

public interface CategoryService {
	public void save( Category category);
	public void update(Category category);
	public List<Category> findAll(); 
	public Category findOne(Long id);

}
