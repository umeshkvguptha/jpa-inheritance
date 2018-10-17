/**
 * 
 */
package com.ssa.springboot.jpa.singletable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Umesh Kumar K.V
 *
 */
@Service
public class SingleTableServiceImpl implements SingleTableService {
	private SingleTableBankAccountRepository bankAccountRepository;
	private SavingsAccountRepository savingsAccountRepository;
	private CheckingAccountRepository checkingAccountRepository;

	/**
	 * @param bankAccountRepository
	 * @param savingsAccountRepository
	 * @param checkingAccountRepository
	 */
	@Autowired
	public SingleTableServiceImpl(SingleTableBankAccountRepository bankAccountRepository,
			SavingsAccountRepository savingsAccountRepository, CheckingAccountRepository checkingAccountRepository) {
		super();
		this.bankAccountRepository = bankAccountRepository;
		this.savingsAccountRepository = savingsAccountRepository;
		this.checkingAccountRepository = checkingAccountRepository;
	}

	/**
	 * 
	 */
	@Override
	public List<SingleTableBankAccount> getAllBankAccounts() {
		return bankAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putBankAccount(SingleTableBankAccount checkingAccount) {
		bankAccountRepository.save(checkingAccount);
	}
	
	/**
	 * 
	 */
	@Override
	public List<SavingsAccount> getAllSavingsAccounts() {
		return savingsAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putSavingsAccount(SavingsAccount savingsAccount) {
		savingsAccountRepository.save(savingsAccount);
	}

	/**
	 * 
	 */
	@Override
	public List<CheckingAccount> getAllCheckingAccounts() {
		return checkingAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putCheckingAccount(CheckingAccount checkingAccount) {
		checkingAccountRepository.save(checkingAccount);
	}

}
