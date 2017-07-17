package org.abyssinia.dao;

import java.util.List;

import org.abyssinia.domain.OrderItem;

public interface OrderItemDao extends GenericDao<OrderItem> {
	List<OrderItem> findOrderItemsByOrderId(Long orderId);
}
