package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Cart;
import edu.mum.domain.CartItem;

public interface CartDao extends GenericDao<Cart>{
	int getNumberOfCartItemByUserId(Long userId);
	List<CartItem> findAllCartItemByUserId(Long userId);
}
