package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;
import com.lti.exception.CustomerException;
import com.lti.repo.Customerrepo;
import com.lti.repo.Genericrepo;

@Service
public class Customerserviceimpl implements Customerservice{
	
	@Autowired
	private Genericrepo genericrepo;
	private Customerrepo customerrepo;
    
	@Transactional
	public int register(Customer customer) {
		Customer updatedcustomer=(Customer) genericrepo.save(customer);
		
		return updatedcustomer.getId();
	}

	public Customer login(String email, String password) {
		try {
		if(!customerrepo.iscustomerpresent(email))
			throw new CustomerException("wrong");
			int id =customerrepo.findbyemailandpassword(email, password);
			Customer customer=genericrepo.fetch(Customer.class, id);
			return customer;
			
		}
		catch(EmptyResultDataAccessException e)
		{
			throw new CustomerException("incorrect data");
		}
		
	}
	

}
