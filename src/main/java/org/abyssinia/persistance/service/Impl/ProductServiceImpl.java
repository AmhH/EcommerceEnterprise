package org.abyssinia.persistance.service.Impl;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.abyssinia.persistance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.dao.ProductDao;
import edu.mum.domain.Product;

@Service
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
