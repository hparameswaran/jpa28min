package com.harish.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.harish.jpa.entity.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
/*
 We would repeat above DAO class for every entity and repeat similar CRUD code .
 To solve this boiler plate Spring DATA JPA was introduced
 
 Spring Data says you define your Repository INTERFACES that extend JpaRepository
  and it will provide the implementation
 
@Repository
@Transactional
public class SomeOtherDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(SomeOther someOther) {
		entityManager.persist(someOther);
		return someOther.getId();
	}

}
 
 
 */
