package com.microservices.addressservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.addressservice.Repository.AddressRepository;
import com.microservices.addressservice.entity.Address;
import com.microservices.addressservice.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public AddressResponse getAddressByEmployeeId(String id) {
		Address address = addressRepository.findAddressByEmployeeId(id);
		System.err.println("Employee id--"+id);
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		
		return addressResponse;
		 
	}

}
