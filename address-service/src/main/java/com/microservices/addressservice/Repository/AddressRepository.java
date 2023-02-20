package com.microservices.addressservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservices.addressservice.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	@Query(nativeQuery = true,value="SELECT ad.id,ad.lane1,ad.lane2,ad.state ,ad.zip FROM Hibernate.Address ad Join Hibernate.Employee emp on ad.employee_id=emp.id where ad.employee_id=:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") String employeeId);

}
