package com.microservices.employeeservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.employeeservice.response.AddressResponse;


//http://localhost:8081/address-app/api/address/1
@FeignClient(name="address-service",url="http://localhost:8081",path="/address-app/api")
public interface AddressClient {
	
	
	@GetMapping("/address/{id}")
	AddressResponse getAddressByEmployeeId(@PathVariable("id") int id);

}
