package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Authority;

public interface AuthorityDao extends GenericDao<Authority> {
	
	public List<Authority> findAuthoritiesByUserName(String username);
	public boolean isAdmin(String username);
	public boolean isUser(String username);
}
