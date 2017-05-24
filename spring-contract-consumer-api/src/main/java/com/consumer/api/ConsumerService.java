package com.consumer.api;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
	
	@Value("${producer.port}")
	private int servicePort;
	
	private final RestTemplate restTemplate;

	public ConsumerService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public String getClientName(Client client) {
		
		String clientName = null;
		ResponseEntity<Account> account =
				this.restTemplate.exchange(
						RequestEntity.post(URI.create("http://localhost:"+servicePort+"/producer-api"))
							.contentType(MediaType.APPLICATION_JSON)
							.body(client),
						Account.class);
		
		System.out.println(account);
		
		if(account.getStatusCode().equals(HttpStatus.OK)){
			clientName = account.getBody().getClientName();
		}else{
			clientName = "NA";
		}
		return clientName;
	}
	
}
