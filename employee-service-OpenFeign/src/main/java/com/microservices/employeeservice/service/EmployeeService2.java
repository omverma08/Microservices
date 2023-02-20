package com.microservices.employeeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.employeeservice.entity.Employee;
import com.microservices.employeeservice.repository.EmployeeRepository;
import com.microservices.employeeservice.response.AddressResponse;
import com.microservices.employeeservice.response.EmployeeResponse;

@Service
public class EmployeeService2 {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	//@Autowired
	RestTemplate restTemplate;
	
	@Value("${addressservice.base.url}")
	private String addressBaseURL;
	
	
	public EmployeeService2( @Value("${addressservice.base.url}")String addressBaseURL,RestTemplateBuilder builder) {
		System.out.println(addressBaseURL);
		
		this.restTemplate=builder.rootUri(addressBaseURL).build();
		
	}
	
	
	public EmployeeResponse getEmployeeById(int id) {
		
		Employee employee = employeeRepository.findById(id).get();
		
		//AddressResponse addressResponse = restTemplate.getForObject(addressBaseURL+"/address/{id}", AddressResponse.class,id);
		
		AddressResponse addressResponse = restTemplate.getForObject("/address/{id}", AddressResponse.class,id);
		
		EmployeeResponse employeeResponse = modelMapper.map(employee,EmployeeResponse.class);
		
		employeeResponse.setAddressResponse(addressResponse);
		 
		return employeeResponse;
		
	}

}
