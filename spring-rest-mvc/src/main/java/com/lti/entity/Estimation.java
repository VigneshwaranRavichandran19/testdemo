package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Estimation")
public class Estimation {
	
	@Column(name="vehicle_type ")
	private int vehicletype;
	
	@Column(name="model")
	private String model;
	
	@Column(name="policy")
	private String policy;
	
	@Column(name="premium")
	private int premium;

	public int getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(int vehicletype) {
		this.vehicletype = vehicletype;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}
	
	

}
