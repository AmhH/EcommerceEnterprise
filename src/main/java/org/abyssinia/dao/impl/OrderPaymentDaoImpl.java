package org.abyssinia.dao.impl;

import org.abyssinia.dao.OrderPaymentDao;
import org.abyssinia.domain.OrderPayment;
import org.springframework.stereotype.Repository;


@Repository
public class OrderPaymentDaoImpl extends GenericDaoImpl<OrderPayment> implements OrderPaymentDao {

	public OrderPaymentDaoImpl() {
		super.setDaoType(OrderPayment.class );
		}

 
 }