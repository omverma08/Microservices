package com.microservices.employeeservice.openfeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.employeeservice.response.AddressResponse;


@FeignClient(name="address-service",path="/address-app/api/")
public interface AddressClient {
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id);
	
	
	

}
