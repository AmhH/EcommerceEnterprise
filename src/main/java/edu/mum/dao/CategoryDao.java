package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Category;
import edu.mum.domain.Product;

public interface CategoryDao extends GenericDao<Category> {
      
	public List<Product> findProductByCategoryName(String name);
}
