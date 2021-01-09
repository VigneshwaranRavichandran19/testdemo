package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	@Id
	@GeneratedValue
	@Column(name="VEHICLE_ID ")
	private int vehicleid;
	
	@Column(name="model")
	private String model;
	
	@Column(name="purchased_date")
	private LocalDate purchaseddate;
	
	@Column(name="registration_number")
	private int registrationnumber;
	
	@Column(name="engine_number")
	private int enginenumber;
	
	@Column(name="chassis_number")
	private int chassisnumber;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer1 customer;

	@OneToOne(mappedBy="vehicle", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},fetch=FetchType.EAGER)
	private Insurance insurance;
	
	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getPurchaseddate() {
		return purchaseddate;
	}

	public void setPurchaseddate(LocalDate purchaseddate) {
		this.purchaseddate = purchaseddate;
	}

	public int getRegistrationnumber() {
		return registrationnumber;
	}

	public void setRegistrationnumber(int registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public int getEnginenumber() {
		return enginenumber;
	}

	public void setEnginenumber(int enginenumber) {
		this.enginenumber = enginenumber;
	}

	public int getChassisnumber() {
		return chassisnumber;
	}

	public void setChassisnumber(int chassisnumber) {
		this.chassisnumber = chassisnumber;
	}

	public Customer1 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}
	
	

}
