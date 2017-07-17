package org.abyssinia.dao.impl;

import javax.persistence.Query;

import org.abyssinia.dao.CartItemDao;
import org.abyssinia.domain.CartItem;
import org.abyssinia.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public class CartItemDaoImpl extends GenericDaoImpl<CartItem> implements CartItemDao{
	
	public CartItemDaoImpl() {
		super.setDaoType(CartItem.class);
	}

	@Override
	public Product findProductByCartId(Long id) {
		Query query = entityManager.createQuery("selct p from CartItem ci, Product p " +
					"where ci.id = :id AND" + 
					"ci.productId = p.id");
		
		return (Product) query.setParameter("id", id).getSingleResult();
	}
}
