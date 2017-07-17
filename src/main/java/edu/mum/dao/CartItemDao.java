package edu.mum.dao;

import edu.mum.domain.CartItem;
import edu.mum.domain.Product;

public interface CartItemDao extends GenericDao<CartItem>{
	Product findProductByCartId(Long id);
}
