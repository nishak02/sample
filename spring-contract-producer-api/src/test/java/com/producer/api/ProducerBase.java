package com.producer.api;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.env.Environment;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(MockitoJUnitRunner.class)
public class ProducerBase {
	
	@InjectMocks ProducerController producerController;
	
	@Mock Environment env;

	@Before
	public void setup() {
		Mockito.when(env.getProperty("99")).thenReturn("Ninety nine");
		Mockito.when(env.getProperty("96")).thenReturn("Ninety sixx");
		RestAssuredMockMvc.standaloneSetup(producerController, env);
	}
	
}
