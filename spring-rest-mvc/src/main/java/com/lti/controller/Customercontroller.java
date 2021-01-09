package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.Login;
import com.lti.dao.Loginstatus;
import com.lti.dao.Registerstatus;
import com.lti.dao.Status.StatusType;
import com.lti.entity.Customer;
import com.lti.exception.CustomerException;
import com.lti.service.Customerservice;

@RestController
@CrossOrigin
public class Customercontroller {
	
	@Autowired
	private Customerservice customerservice;
	
	@PostMapping("/register")
	public @ResponseBody Registerstatus register(@RequestBody Customer customer) {
		try {
		int id=customerservice.register(customer);
		Registerstatus register=new Registerstatus();
		register.setStatus(StatusType.SUCCESS);
		register.setMessage("successfully registered");
		register.setRegistredcustomerid(id);
		return register;
		
	}
		catch(CustomerException e)
		{
			Registerstatus register=new Registerstatus();
			register.setStatus(StatusType.FAILED);
			register.setMessage(e.getMessage());
			return register;
		}
	}
	
	@PostMapping("/login")
	public Loginstatus login(@RequestBody Login login) {
		try {
		Customer customer=customerservice.login(login.getMail(), login.getPassword());
		Loginstatus status=new Loginstatus();
		status.setStatus(StatusType.SUCCESS);
		status.setMessage("successfully registered");
		status.setCustomerid(customer.getId());
		status.setCustomername(customer.getName());
		return status;
		}
		catch(CustomerException e)
		{
			Loginstatus status=new Loginstatus();

			status.setStatus(StatusType.SUCCESS);
			status.setMessage("successfully registered");
			return status;
		
		}
		
		
		
		
	}

}
