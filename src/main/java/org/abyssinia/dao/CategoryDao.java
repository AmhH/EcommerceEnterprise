package org.abyssinia.dao;

import java.util.List;

import org.abyssinia.domain.Category;
import org.abyssinia.domain.Product;

public interface CategoryDao extends GenericDao<Category> {
      
	public List<Product> findProductByCategoryName(String name);
}
