package com.consumer.api;

public class Client {

	public Client(){}
	
	public Client(String clientId){
		this.clientId = clientId;
	}
	
	private String clientId;
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientId() {
		return clientId;
	}
	
}
