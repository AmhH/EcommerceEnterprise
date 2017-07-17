package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Product;

public interface ProductDao extends GenericDao<Product> {

	public Product findByProductName(String name);

	List<Product> getProductsByCategoryId(Long categoryId);

	
}
