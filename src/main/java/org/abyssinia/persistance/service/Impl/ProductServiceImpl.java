package org.abyssinia.persistance.service.Impl;

import java.util.List;

import org.abyssinia.persistance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.abyssinia.dao.ProductDao;
import org.abyssinia.domain.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;
	
	@Override
	public void save(Product product) {
		productDao.save(product);
	}

	@Override
	public void update(Product product) {
		productDao.save(product);
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public Product findOne(Long id) {
		return productDao.findOne(id);
	}

}
