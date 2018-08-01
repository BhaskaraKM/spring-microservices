package com.bhaskara.dc.service.dcservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaskara.dc.service.dcservice.model.DebitAccount;
import com.bhaskara.dc.service.dcservice.repository.DebitRepository;

@RestController
@RequestMapping("rest/debitservice")
public class DebitController {

	@Autowired
	private DebitRepository debitRepository;
	
	@GetMapping("getDebitAccount/{userKey}")
	public List<DebitAccount> getDebitAccDetails(@PathVariable("userKey") int userKey){
		
		return debitRepository.findByUserKey(userKey);
		
	}
	@PostMapping("saveDebitAccount")
	public void saveDebitAccount(@RequestBody List<DebitAccount> debitList){
		
		debitList.forEach(debitAccount -> debitRepository.save(debitAccount));
		
	}
}
