package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue
	@Column(name="payment_id ")
	private int paymentid;
	
	@Column(name="status")
	private String status;
	
	@Column(name="payment_method")
	private String paymentmethod;
	
	@Column(name="payment_date")
	private int paymentdate;
	
	@Column(name="amount")
	private String payment;
	
	@Column(name="customerid")
	private Customer1 customer;
	
	@ManyToOne
	@JoinColumn(name="policy_number")
	private Insurance insurance;
	
	

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public int getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(int paymentdate) {
		this.paymentdate = paymentdate;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Customer1 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
	
	

}

