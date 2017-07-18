package org.abyssinia.persistance.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.abyssinia.persistance.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.abyssinia.dao.AddressDao;

import org.abyssinia.domain.Address;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao addressDao;
	
	@Override
	public void save(Address address) {
		addressDao.save(address);
		
	}

	@Override
	public void update(Address address) {
		addressDao.update(address);
	}

	@Override
	public List<Address> findAll() {
		return addressDao.findAll();
	}

	@Override
	public Address findOne(Long id) {
		return addressDao.findOne(id);
	}

}
