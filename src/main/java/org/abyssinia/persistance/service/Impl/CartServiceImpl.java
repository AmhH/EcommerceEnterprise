package org.abyssinia.persistance.service.Impl;

import java.util.List;

import org.abyssinia.persistance.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.abyssinia.dao.CartDao;
import org.abyssinia.domain.Cart;

@Service
@Transactional
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartDao cartDao;
	
	@Override
	public void save(Cart cart) {
		cartDao.save(cart);
	}

	@Override
	public void update(Cart cart) {
		cartDao.save(cart);
	}

	@Override
	public List<Cart> findAll() {
		return cartDao.findAll();
	}

	@Override
	public Cart findOne(Long id) {
		return cartDao.findOne(id);
	}

}
