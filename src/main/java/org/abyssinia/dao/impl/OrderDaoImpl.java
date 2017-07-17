package org.abyssinia.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.abyssinia.dao.OrderDao;
import org.abyssinia.domain.Order;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {

	public OrderDaoImpl() {
		super.setDaoType(Order.class );
		}

	@Override
	public List<Order> findOrdersByUserId(Long userId) {
		Query query = entityManager.createQuery("selcet o from USERS u JOIN FETCH Order o"
				+ "where u.id = :userId AND"
				+ "o in u.orders");
		
		return (List<Order>) query.setParameter("userId", userId).getResultList();
	}

 
 }