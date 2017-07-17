package org.abyssinia.dao.impl;

 

import java.util.List;

import javax.persistence.Query;

import org.abyssinia.dao.CategoryDao;
import org.abyssinia.domain.Category;
import org.abyssinia.domain.Product;
import org.springframework.stereotype.Repository;


@SuppressWarnings("unchecked")
@Repository
public class CategoryDaoImpl extends GenericDaoImpl<Category> implements CategoryDao {

	public CategoryDaoImpl() {
		super.setDaoType(Category.class );
		}


	@Override
	public List<Product> findProductByCategoryName(String name) {
		Query query = entityManager.createQuery("select p from Category c JOIN FETCH c.products p  where c.name =:name"
				 + "p member of c.products");
			return (List<Product>) query.setParameter("name", name).getResultList();
	}


 }