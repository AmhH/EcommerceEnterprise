package org.abyssinia.persistance.service;

import java.util.List;

import org.abyssinia.domain.Product;

public interface ProductService {
	public void save(Product product);
	public void update(Product product);
	public List<Product> findAll(); 
	public Product findOne(Long id);

}
