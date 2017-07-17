package org.abyssinia.dao;

import java.util.List;

import org.abyssinia.domain.Product;

public interface ProductDao extends GenericDao<Product> {

	public Product findByProductName(String name);

	List<Product> getProductsByCategoryId(Long categoryId);

	
}
