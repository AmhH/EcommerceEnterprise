package org.abyssinia.dao;

import org.abyssinia.domain.CartItem;
import org.abyssinia.domain.Product;

public interface CartItemDao extends GenericDao<CartItem>{
	Product findProductByCartId(Long id);
}
