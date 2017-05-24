package com.consumer.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(workOffline = true, ids = {"com.producer.api:spring-contract-producer-api:0.0.1-SNAPSHOT:stubs:8087"})
@DirtiesContext
public class ConsumerServiceTest {
	
	@Autowired
	private ConsumerService consumerService;
	
	@Test
	public void checkClientNameMatches() throws Exception{
		
		Client client = new Client("99");
		Assert.assertSame("Ninety nine", consumerService.getClientName(client));
		
	}
	
	@Test
	public void checkClientNameDoesNotMatch() throws Exception{
		
		Client client = new Client("90");
		Assert.assertSame("Ninety", consumerService.getClientName(client));
		
	}
}
