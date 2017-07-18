package org.abyssinia.persistance.service;

import java.util.List;

import org.abyssinia.domain.Authority;

public interface AuthorityService {
	public void save( Authority authority);
	public void update(Authority authority);
	public List<Authority> findAll(); 
	public Authority findOne(Long id);

}
