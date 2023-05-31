package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Account;
import com.exception.InvalidAccountException;
import com.repository.AccountRepository;

@Component
public class AccountDAOImpl implements IAccountDAO{
	
	//Provide code to Inject AccountRepository
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account openAccount(Account account) {
		
		//fill code
		return accountRepository.save(account);
	}
	
	@Override
	public Account updateAccountHolderPhoneNumber(String accountNumber,String phoneNumber) throws InvalidAccountException {
		
		//fill code
		Optional<Account> accountOptional = accountRepository.findById(accountNumber);
		if (accountOptional.isEmpty()) {
			throw new InvalidAccountException();
		}
		Account account = accountOptional.get();
		account.setPhoneNumber(phoneNumber);
		return accountRepository.save(account);
	}
	
	@Override
	public Account viewAccountByAccountNumber(String accountNumber) throws InvalidAccountException {
		
		//fill code
		Optional<Account> accountOptional = accountRepository.findById(accountNumber);
		if (accountOptional.isEmpty()) {
			throw new InvalidAccountException();
		}
		return accountOptional.get();
	}

	@Override
	public List<Account> viewAccountByBalance(double balance) {
		
		//fill code
		return accountRepository.findByBalanceAmountGreaterThanEqual(balance);
	}

}
