package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.OrderDao;
import edu.mum.domain.Order;

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