package com.lti.dao;

import com.lti.dao.Status.StatusType;

public class Registerstatus extends Status{
	@Override
	public void setStatus(StatusType status) {
		// TODO Auto-generated method stub
		super.setStatus(status);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		super.setMessage(message);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public StatusType getstatus() {
		// TODO Auto-generated method stub
		return super.getstatus();
	}

	private int registredcustomerid;

	public int getRegistredcustomerid() {
		return registredcustomerid;
	}

	public void setRegistredcustomerid(int registredcustomerid) {
		this.registredcustomerid = registredcustomerid;
	}
	

}
