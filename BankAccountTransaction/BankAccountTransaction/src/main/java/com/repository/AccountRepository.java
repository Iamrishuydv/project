package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.entities.Account;

//Provide necessary Annotation
@Component
public interface AccountRepository extends JpaRepository<Account, String> {
	
	//Provide necessary method to view Account with balance greater than or equal to a value 
	public List<Account> findByBalanceAmountGreaterThanEqual(double balanceAmount);
}