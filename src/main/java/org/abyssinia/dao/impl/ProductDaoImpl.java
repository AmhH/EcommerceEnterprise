package org.abyssinia.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.abyssinia.dao.ProductDao;
import org.abyssinia.domain.Product;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao {

	public ProductDaoImpl() {
		super.setDaoType(Product.class );
		}

	public Product findByProductName(String name) {
	     
		Query query = entityManager.createQuery("select p from Product p  where p.name =:name");
		return (Product) query.setParameter("name", name).getSingleResult();
			     

	}

	@Override
	public List<Product> getProductsByCategoryId(Long categoryId) {
		Query query=entityManager.createQuery("select ite from Category c JOIN c.items ite WHERE c.id=:categoryId");
	
		return (List<Product>) query.setParameter("categoryId",categoryId).getResultList();
	}


 }