package com.microservices.employeeservice.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class EmployeeUtil {
	
//	@Bean
//	public RestTemplate restTemplate() {
//		
//		return new RestTemplate();
//		
//	}

	
	
	@Value("${addressservice.base.url}")
	private String addressBaseURL;
	
	@Bean
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
		
	}
	
	@Bean
	public WebClient webclient() {
		return WebClient.builder()
		.baseUrl(addressBaseURL)
		.build();
		
	}
	
	@LoadBalanced
	@Bean	
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
}
