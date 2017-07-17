package org.abyssinia.dao.impl;

import javax.persistence.Query;

import org.abyssinia.dao.UserDao;
import org.abyssinia.domain.User;
import org.springframework.stereotype.Repository;

//@SuppressWarnings("unchecked")
@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	public UserDaoImpl() {
		super.setDaoType(User.class );
		}

	public User findByUserNumber(Integer number) {
	     
		Query query = entityManager.createQuery("select m from MEMBER m  where m.memberNumber =:number");
		return (User) query.setParameter("number", number).getSingleResult();
			     

	}

	/*public List<User> findAllJoinFetch() {
		  Query query =  entityManager.createQuery("SELECT DISTINCT m FROM User AS m JOIN FETCH m.addresses AS a");
		  return (List<User>) query.getResultList();

	}

	@SuppressWarnings("rawtypes")
	public List<User> findByGraph() {

	    EntityGraph graph = entityManager.getEntityGraph("graph.User.addresses");

	    return (List<User>) this.findAll("javax.persistence.fetchgraph",graph);
 
	}
*/
 }