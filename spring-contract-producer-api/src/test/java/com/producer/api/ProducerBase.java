package com.producer.api;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(MockitoJUnitRunner.class)
public class ProducerBase {
	
	@InjectMocks
	ProducerController producerController;

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(producerController);
	}
	
}
