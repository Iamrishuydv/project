package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.entities.BankTransaction;

//Provide necessary Annotation
@Component
public interface TransactionRepository extends JpaRepository<BankTransaction, String> {

	//Provide necessary method to view transactions based on Account number,
	// view transactions based on transaction type and
	// view transactions based on transaction type and transaction amount greater than or equal to a value	
	public List<BankTransaction> findByAccountObjAccountNumber(String accountNumber);

	public List<BankTransaction> findByTransactionType(String transactionType);

	public List<BankTransaction> findByTransactionTypeAndAmountGreaterThanEqual(String transactionType, double amount);
}