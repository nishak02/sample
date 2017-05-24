package com.producer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@PropertySource("classpath:clientNameConfig.properties")
public class SpringBooterProducer {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer 
					propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public static void main(String[] args){
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringBooterProducer.class, args);
		
		for(String bean : context.getBeanDefinitionNames()){
			System.out.println(bean);
		}
	}

}
