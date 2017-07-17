package org.abyssinia.dao;

import java.util.List;

import org.abyssinia.domain.Order;

public interface OrderDao extends GenericDao<Order> {
	List<Order> findOrdersByUserId(Long userId);
}
