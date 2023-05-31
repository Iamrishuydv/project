package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Account;
import com.entities.BankTransaction;
import com.exception.InvalidBankTransactionException;
import com.repository.AccountRepository;
import com.repository.TransactionRepository;

@Component
public class TransactionDAOImpl implements ITransactionDAO {
	
	//Provide code to Inject TransactionRepository and AccountRepository
	@Autowired
	private TransactionRepository transactionRepository;
	//Provide code to Inject AccountRepository, if needed
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public BankTransaction insertTransaction(BankTransaction transactionObj,String accountNumber) throws InvalidBankTransactionException{
		
		//fill code
		Optional<Account> accountOptional = accountRepository.findById(accountNumber);
		if (accountOptional.isEmpty()) {
			throw new InvalidBankTransactionException();
		}
		
		Account account = accountOptional.get();

		if (transactionObj.getTransactionType().equalsIgnoreCase("Deposit")) {
			account.setBalanceAmount(account.getBalanceAmount() + transactionObj.getAmount());
		} else {
			account.setBalanceAmount(account.getBalanceAmount() - transactionObj.getAmount());
		}
		transactionObj.setAccountObj(account);
		return transactionRepository.save(transactionObj);
	}
	
	@Override
	public List<BankTransaction> viewTransactionByAccountNumber(String accountNumber) throws InvalidBankTransactionException
	{
		//fill code
		List<BankTransaction> list = transactionRepository.findByAccountObjAccountNumber(accountNumber);
		if (list.isEmpty()) {
			throw new InvalidBankTransactionException();
		}
		return list;
	}
	
	@Override
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType)
	{
		//fill code
		
		return transactionRepository.findByTransactionType(transactionType);
	}
	
	@Override
	public List<BankTransaction> viewTransactionByTransactionTypeAndAmount(String transactionType,double amount)
	{
		//fill code
		
		return transactionRepository.findByTransactionTypeAndAmountGreaterThanEqual(transactionType, amount);
	}

}
