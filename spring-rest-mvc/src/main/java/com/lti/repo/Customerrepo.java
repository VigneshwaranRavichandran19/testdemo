package com.lti.repo;

import org.springframework.stereotype.Repository;

@Repository
public class Customerrepo extends Genericrepo{
	public boolean iscustomerpresent(String mail) {
		return(Long)
				entitymanager
				.createQuery("select Count(c.id) from Customer where c.mail= :mail")
				.setParameter("mail", mail)
				.getSingleResult()==1 ? true:false;
	}
	public int findbyemailandpassword(String mail, String password) {
		return(Integer)
				entitymanager
				.createQuery("select Count(c.id) from Customer where c.mail=:mail and c.password=:password")
				.setParameter("mail", mail)
				.setParameter("password", password)
				.getSingleResult() ;
	}

}
