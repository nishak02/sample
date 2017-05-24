package com.producer.api;

public class Account {
	
	public Account(){}
	
	public Account(String clientName) {
		this.clientName = clientName;
	}
	
	private String clientName;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

}
