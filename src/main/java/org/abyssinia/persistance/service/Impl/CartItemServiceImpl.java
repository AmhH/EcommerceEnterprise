package org.abyssinia.persistance.service.Impl;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.abyssinia.persistance.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.abyssinia.dao.CartItemDao;
import org.abyssinia.domain.CartItem;

@Service
public class CartItemServiceImpl implements CartItemService{
	
	@Autowired
	CartItemDao cartItemDao;
	
	@Override
	public void save(CartItem cartItem) {
		cartItemDao.save(cartItem);
	}

	@Override
	public void update(CartItem cartItem) {
		cartItemDao.save(cartItem);
	}

	@Override
	public List<CartItem> findAll() {
		return cartItemDao.findAll();
	}

	@Override
	public CartItem findOne(Long id) {
		return cartItemDao.findOne(id);
	}

}
