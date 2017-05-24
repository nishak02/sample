package com.consumer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	private ConsumerService consumerService;

	@RequestMapping(method = RequestMethod.POST,
					value = "/consumer-api",
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String testApi(@RequestBody Client client){
		
		String clientName = consumerService.getClientName(client);
		
		return clientName;
	}

}
