package com.producer.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@RequestMapping("/producer-api")
	public @ResponseBody String producerApi(){
		return "hello producer";
	}
	
	@RequestMapping(method = RequestMethod.POST,
			value = "/producer-api",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Account producerApi(@RequestBody Client client){
		return new Account("ten");
	}
	
}
