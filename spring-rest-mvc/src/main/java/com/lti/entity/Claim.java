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
@Table(name="claim")
public class Claim {
	@Id
	@GeneratedValue
	@Column(name="claim_id ")
	private int claimid;

	@Column(name="claim_date")
	private LocalDate claimdate;
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="claim_reason")
	private String claimreason;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer1 customer;
	

	@ManyToOne
	@JoinColumn(name="policy_number")
	private Claim claim;

	public Customer1 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}
	public int getClaimid() {
		return claimid;
	}

	public void setClaimid(int claimid) {
		this.claimid = claimid;
	}

	public LocalDate getClaimdate() {
		return claimdate;
	}

	public void setClaimdate(LocalDate claimdate) {
		this.claimdate = claimdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getClaimreason() {
		return claimreason;
	}

	public void setClaimreason(String claimreason) {
		this.claimreason = claimreason;
	}

	

}