package org.abyssinia.persistance.service;

import java.util.List;

import edu.mum.domain.Address;
import edu.mum.domain.UserCredentials;

public interface UserCredentialService {
	public void save( UserCredentials userCredentials);
	public void update(UserCredentials userCredentials);
	public List<Address> findAll(); 
	public Address findOne(Long id);
}
