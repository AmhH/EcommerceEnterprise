package org.abyssinia.dao;

import java.util.List;

import org.abyssinia.domain.UserCredentials;

public interface CredentialsDao extends GenericDao<UserCredentials> {
	public List<UserCredentials> findAllAdmin();
	public UserCredentials findByUserName(String userName);

 	}
