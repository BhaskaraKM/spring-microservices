package com.bhaskara.cpservice.cpservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaskara.cpservice.cpservice.modal.CustomerProfile;
import com.bhaskara.cpservice.cpservice.repository.CustProfileRepository;

@RestController
@RequestMapping("rest/profile")
public class CustomerProfileController {
	
	@Autowired
	private CustProfileRepository custprofilerepository;
	
	
	@GetMapping("/getCustProfile/{cust_name}")
	public CustomerProfile getCustomerProfile(@PathVariable("cust_name") String custName)
	{
		return custprofilerepository.findBycustName(custName);
	}

	@PostMapping("/addCustProfile")
	public CustomerProfile addCustomerprofile(@RequestBody final CustomerProfile customerProfile){
		
		custprofilerepository.save(customerProfile);
		
		return custprofilerepository.findBycustName(customerProfile.getCustName());
	}
}
