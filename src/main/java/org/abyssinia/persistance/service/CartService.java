package org.abyssinia.persistance.service;

import java.util.List;

import edu.mum.domain.Cart;

public interface CartService {
	public void save( Cart cart);
	public void update(Cart cart);
	public List<Cart> findAll(); 
	public Cart findOne(Long id);

}
