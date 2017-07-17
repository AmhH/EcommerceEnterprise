package org.abyssinia.dao.impl;

 

import org.abyssinia.dao.ProductInventoryDao;
import org.abyssinia.domain.ProductInventory;
import org.springframework.stereotype.Repository;


@Repository
public class ProductInventoryDaoImpl extends GenericDaoImpl<ProductInventory> implements ProductInventoryDao {

	public ProductInventoryDaoImpl() {
		super.setDaoType(ProductInventory.class );
		}

 
 }