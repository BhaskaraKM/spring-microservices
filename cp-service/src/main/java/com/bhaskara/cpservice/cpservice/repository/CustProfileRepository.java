package com.bhaskara.cpservice.cpservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhaskara.cpservice.cpservice.modal.CustomerProfile;

public interface CustProfileRepository  extends JpaRepository<CustomerProfile, Integer>{

	CustomerProfile findBycustName(String custName);
}
