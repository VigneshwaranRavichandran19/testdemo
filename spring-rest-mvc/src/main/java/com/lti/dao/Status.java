package com.lti.dao;

public class Status {
	private StatusType status;
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
	
	public enum StatusType{
		SUCCESS,FAILED;
	}
	public StatusType getstatus() {
		return status;
	}

}
