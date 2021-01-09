package com.lti.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class Genericrepo {
	
	@PersistenceContext
	protected EntityManager entitymanager;
	
	public Object save(Object obj)
	{
		Object updatedobj=entitymanager.merge(obj);
		return updatedobj;
	}
	public <E> E fetch(Class<E>clazz, Object obj)
	{
		E e=entitymanager.find(clazz,obj);
		return e;
	}

}
