package org.abyssinia.persistance.service;

import java.util.List;

import org.abyssinia.domain.Order;

public interface OrderService {
	public void save(Order order);
	public void update(Order order);
	public List<Order> findAll(); 
	public Order findOne(Long id);

}
