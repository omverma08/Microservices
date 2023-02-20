package com.microservices.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.addressservice.response.AddressResponse;
import com.microservices.addressservice.service.AddressService;

@RestController
public class AddressController {
	
	
	@Autowired
	AddressService adressService;
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") String id) {
		
		AddressResponse addressReponse=adressService.getAddressByEmployeeId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressReponse) ;
				
				
	}

}
