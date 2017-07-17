package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Authority;
import edu.mum.domain.User;

public interface AuthorityDao extends GenericDao<Authority> {
	
	public List<User> findAuthoritiesByUserName(String username);
	public boolean isAdmin(String username);
	public boolean isUser(String username);
}
