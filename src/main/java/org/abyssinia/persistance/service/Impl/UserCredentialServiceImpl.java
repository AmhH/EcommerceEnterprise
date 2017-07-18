package org.abyssinia.persistance.service.Impl;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.abyssinia.persistance.service.UserCredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.dao.CredentialsDao;
import edu.mum.domain.UserCredentials;

@Service
public class UserCredentialServiceImpl implements UserCredentialService{
	
	@Autowired
	CredentialsDao userCredentialDao;
	
	@Override
	public void save(UserCredentials userCredential) {
		userCredentialDao.save(userCredential);
	}

	@Override
	public void update(UserCredentials userCredential) {
		userCredentialDao.save(userCredential);
	}

	@Override
	public List<UserCredentials> findAll() {
		return userCredentialDao.findAll();
	}

	@Override
	public UserCredentials findOne(Long id) {
		return userCredentialDao.findOne(id);
	}

}
