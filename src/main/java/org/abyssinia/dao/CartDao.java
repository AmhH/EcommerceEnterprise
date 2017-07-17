package org.abyssinia.dao;

import java.util.List;

import org.abyssinia.domain.Cart;
import org.abyssinia.domain.CartItem;

public interface CartDao extends GenericDao<Cart>{
	int getNumberOfCartItemByUserId(Long userId);
	List<CartItem> findAllCartItemByUserId(Long userId);
}
