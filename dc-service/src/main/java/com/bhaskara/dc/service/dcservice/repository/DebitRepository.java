package com.bhaskara.dc.service.dcservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhaskara.dc.service.dcservice.model.DebitAccount;

public interface DebitRepository  extends JpaRepository<DebitAccount, Integer>{
	
	List<DebitAccount> findByUserKey(int userKey);

}
