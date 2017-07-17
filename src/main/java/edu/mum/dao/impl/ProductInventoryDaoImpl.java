package edu.mum.dao.impl;

 

import org.springframework.stereotype.Repository;

import edu.mum.dao.ProductInventoryDao;
import edu.mum.domain.ProductInventory;


@Repository
public class ProductInventoryDaoImpl extends GenericDaoImpl<ProductInventory> implements ProductInventoryDao {

	public ProductInventoryDaoImpl() {
		super.setDaoType(ProductInventory.class );
		}

 
 }