package org.abyssinia.persistance.service.Impl;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.abyssinia.persistance.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.abyssinia.dao.OrderItemDao;
import org.abyssinia.domain.OrderItem;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	
	@Autowired
	OrderItemDao orderItemDao;
	
	@Override
	public void save(OrderItem orderItem) {
		orderItemDao.save(orderItem);
	}

	@Override
	public void update(OrderItem orderItem) {
		orderItemDao.save(orderItem);
	}

	@Override
	public List<OrderItem> findAll() {
		return orderItemDao.findAll();
	}

	@Override
	public OrderItem findOne(Long id) {
		return orderItemDao.findOne(id);
	}

}
