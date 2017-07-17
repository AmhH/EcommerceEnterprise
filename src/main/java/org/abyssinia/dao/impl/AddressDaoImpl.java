package org.abyssinia.dao.impl;

 

import org.abyssinia.dao.AddressDao;
import org.abyssinia.domain.Address;
import org.springframework.stereotype.Repository;


@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {

	public AddressDaoImpl() {
		super.setDaoType(Address.class );
		}

 
 }