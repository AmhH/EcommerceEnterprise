package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.OrderPaymentDao;
import edu.mum.domain.OrderPayment;


@Repository
public class OrderPaymentDaoImpl extends GenericDaoImpl<OrderPayment> implements OrderPaymentDao {

	public OrderPaymentDaoImpl() {
		super.setDaoType(OrderPayment.class );
		}

 
 }