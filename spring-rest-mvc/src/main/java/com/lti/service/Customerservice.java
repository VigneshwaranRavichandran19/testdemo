package com.lti.service;

import com.lti.entity.Customer;

public interface Customerservice {
	public int register(Customer customer);
	public Customer login(String mail, String Password);

}
