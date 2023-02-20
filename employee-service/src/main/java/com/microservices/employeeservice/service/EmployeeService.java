package com.microservices.employeeservice.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservices.employeeservice.entity.Employee;
import com.microservices.employeeservice.openfeignclient.AddressClient;
import com.microservices.employeeservice.repository.EmployeeRepository;
import com.microservices.employeeservice.response.AddressResponse;
import com.microservices.employeeservice.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	WebClient webClient;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	AddressClient addressClient;
	
//	@Autowired
//	private DiscoveryClient discoveryClient;
//	
//	@Autowired
//	private LoadBalancerClient loadBalancerClient;
//	
	
	
	public EmployeeResponse getEmployeeById(int id) {
		
		Employee employee = employeeRepository.findById(id).get();
		
		//AddressResponse addressResponse = restTemplate.getForObject(addressBaseURL+"/address/{id}", AddressResponse.class,id);
		
		//AddressResponse addressResponse = callToAddressUsingRestTemplate(id);
		ResponseEntity<AddressResponse> addressResponseEntity= addressClient.getAddressByEmployeeId(id);
				
		AddressResponse addressResponse = addressResponseEntity.getBody();
		EmployeeResponse employeeResponse = modelMapper.map(employee,EmployeeResponse.class);
		
		employeeResponse.setAddressResponse(addressResponse);
		 
		return employeeResponse;
		
	}




	private AddressResponse callToAddressUsingWebClient(int id) {
		// TODO Auto-generated method stub
		return webClient.get()
                .uri("/address/"+id)
                .retrieve()
                .bodyToMono(AddressResponse.class)
                .block();

	}
	
	private AddressResponse callToAddressUsingRestTemplate(int id) {
		
		//get me the deatails for the ip and a port number for address service
		//List<ServiceInstance> instances = discoveryClient.getInstances("address-service");
		//ServiceInstance serviceInstance = instances.get(0);
		//String uri = serviceInstance.getUri().toString();
		
		
//		ServiceInstance serviceInstance = loadBalancerClient.choose("address-service");
//		String uri = serviceInstance.getUri().toString();
//		
//		String contectRoot = serviceInstance.getMetadata().get("configPath");
//		System.out.println("uri:"+uri+contectRoot);
//		return restTemplate.getForObject(uri+contectRoot+"/address/{id}", AddressResponse.class,id);
		
		return restTemplate.getForObject("http://address-service/address-app/api/address/{id}", AddressResponse.class,id);

	}

}
