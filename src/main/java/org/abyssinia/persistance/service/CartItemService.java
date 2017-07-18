package org.abyssinia.persistance.service;

import java.util.List;

import org.abyssinia.domain.CartItem;

public interface CartItemService {
	public void save( CartItem cartItem);
	public void update(CartItem cartItem);
	public List<CartItem> findAll(); 
	public CartItem findOne(Long id);

}
