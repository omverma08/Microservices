package com.microservices.addressservice.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AddressUtil {
	
	

	@Bean
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
		
	}
}
