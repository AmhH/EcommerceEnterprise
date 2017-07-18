package org.abyssinia.persistance.service.Impl;

import java.util.List;

import org.abyssinia.persistance.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.abyssinia.dao.OrderDao;
import org.abyssinia.domain.Order;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderDao orderDao;
	
	@Override
	public void save(Order order) {
		orderDao.save(order);
	}

	@Override
	public void update(Order order) {
		orderDao.save(order);
	}

	@Override
	public List<Order> findAll() {
		return orderDao.findAll();
	}

	@Override
	public Order findOne(Long id) {
		return orderDao.findOne(id);
	}

}
