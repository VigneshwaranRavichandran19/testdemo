package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="insurance")
public class Insurance {
	@Id
	@GeneratedValue
	@Column(name="policy_number ")
	private int policynumber;
	
	@Column(name="plan")
	private String plan;
	
	@Column(name="plan_duration")
	private LocalDate planduration;
	
	@Column(name="purchase_date")
	private LocalDate purchasedate;
	
	@Column(name="balance")
	private int balance;
	
	@Column(name="expiry_date")
	private LocalDate expirydate;
	
	@OneToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;
	
	@OneToMany(mappedBy="insurance", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Payment> payments;
	

	@OneToMany(mappedBy="insurance", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Claim> claims;
	

	/*to be decided*/
	@Column(name="customer_id")
	private Customer1 customer;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Customer1 getCustomer() {
		return customer;
	}
	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}
	
	
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public LocalDate getPlanduration() {
		return planduration;
	}
	public void setPlanduration(LocalDate planduration) {
		this.planduration = planduration;
	}
	public LocalDate getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(LocalDate purchasedate) {
		this.purchasedate = purchasedate;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public LocalDate getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(LocalDate expirydate) {
		this.expirydate = expirydate;
	}
	public Customer1 getCustomerid() {
		return customer;
	}
	public void setCustomerid(Customer1 customerid) {
		this.customer = customerid;
	}
	
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	

}
