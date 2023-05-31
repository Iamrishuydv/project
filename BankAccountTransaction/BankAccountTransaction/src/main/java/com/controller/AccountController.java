package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Account;
import com.service.IAccountService;

//Provide necessary Annotation
@RestController
public class AccountController {
	
	//Provide necessary Annotation
	// @Autowired
	IAccountService accountService;
	
	//Provide necessary Annotation and fill code
	@GetMapping("/openAccount")
	public  Account openAccount(Account account) {
		return accountService.openAccount(account);
		
	}
	

	public Account updateAccountHolderPhoneNumber(String accountNumber,String phoneNumber) {
	
		return null;
		
	}
	
	public Account viewAccountByAccountNumber(String accountNumber) {
	
		return null;
		
	}
	
	public List<Account> viewAccountByBalance(double balance) {
	
		return null;
		
	}

	
}

	
