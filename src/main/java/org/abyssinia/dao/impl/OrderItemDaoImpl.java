package org.abyssinia.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.abyssinia.dao.OrderItemDao;
import org.abyssinia.domain.OrderItem;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class OrderItemDaoImpl extends GenericDaoImpl<OrderItem> implements OrderItemDao {

	public OrderItemDaoImpl() {
		super.setDaoType(OrderItem.class );
		}

	@Override
	public List<OrderItem> findOrderItemsByOrderId(Long orderId) {
		Query query = entityManager.createQuery("select i from Order o JOIN FETCH o.items i" 
				+ " where o.id = :orderId AND "
				+ " i member of o.items");
		return (List<OrderItem>) query.setParameter("orderId", orderId).getResultList();
	}

 
 }