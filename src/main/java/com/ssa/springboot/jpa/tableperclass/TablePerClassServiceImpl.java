/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Umesh Kumar K.V
 *
 */
@Service
public class TablePerClassServiceImpl implements TablePerClassService {
	private TablePerClassBankAccountRepository tablePerClassBankAccountRepository;
	private TablePerClassSavingsAccountRepository tablePerClassSavingsAccountRepository;
	private TablePerClassCheckingAccountRepository tablePerClassCheckingAccountRepository;

	/**
	 * @param tablePerClassBankAccountRepository
	 * @param tablePerClassSavingsAccountRepository
	 * @param tablePerClassCheckingAccountRepository
	 */
	@Autowired
	public TablePerClassServiceImpl(TablePerClassBankAccountRepository tablePerClassBankAccountRepository,
			TablePerClassSavingsAccountRepository tablePerClassSavingsAccountRepository, TablePerClassCheckingAccountRepository tablePerClassCheckingAccountRepository) {
		super();
		this.tablePerClassBankAccountRepository = tablePerClassBankAccountRepository;
		this.tablePerClassSavingsAccountRepository = tablePerClassSavingsAccountRepository;
		this.tablePerClassCheckingAccountRepository = tablePerClassCheckingAccountRepository;
	}

	/**
	 * 
	 */
	@Override
	public List<TablePerClassBankAccount> getAllBankAccounts() {
		return tablePerClassBankAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putBankAccount(TablePerClassBankAccount checkingAccount) {
		tablePerClassBankAccountRepository.save(checkingAccount);
	}
	
	/**
	 * 
	 */
	@Override
	public List<TablePerClassSavingsAccount> getAllSavingsAccounts() {
		return tablePerClassSavingsAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putSavingsAccount(TablePerClassSavingsAccount savingsAccount) {
		tablePerClassSavingsAccountRepository.save(savingsAccount);
	}

	/**
	 * 
	 */
	@Override
	public List<TablePerClassCheckingAccount> getAllCheckingAccounts() {
		return tablePerClassCheckingAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putCheckingAccount(TablePerClassCheckingAccount checkingAccount) {
		tablePerClassCheckingAccountRepository.save(checkingAccount);
	}

}
