package org.abyssinia.persistance.service.Impl;

import java.util.List;

import org.abyssinia.persistance.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.abyssinia.dao.AuthorityDao;
import org.abyssinia.domain.Authority;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	AuthorityDao authorityDao;
	
	@Override
	public void save(Authority authority) {
		authorityDao.save(authority);
	}

	@Override
	public void update(Authority authority) {
		authorityDao.update(authority);
	}

	@Override
	public List<Authority> findAll() {
		return authorityDao.findAll();
	}

	@Override
	public Authority findOne(Long id) {
		return authorityDao.findOne(id);
	}

}
