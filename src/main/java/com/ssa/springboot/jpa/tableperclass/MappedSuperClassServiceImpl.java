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
public class MappedSuperClassServiceImpl implements MappedSuperClassService {
	private MappedSuperClassSavingsAccountRepository mappedSuperClassSavingsAccountRepository;
	private MappedSuperClassCheckingAccountRepository mappedSuperClassCheckingAccountRepository;

	/**
	 * @param mappedSuperClassSavingsAccountRepository
	 * @param mappedSuperClassCheckingAccountRepository
	 */
	@Autowired
	public MappedSuperClassServiceImpl(MappedSuperClassSavingsAccountRepository mappedSuperClassSavingsAccountRepository, MappedSuperClassCheckingAccountRepository mappedSuperClassCheckingAccountRepository) {
		super();
		this.mappedSuperClassSavingsAccountRepository = mappedSuperClassSavingsAccountRepository;
		this.mappedSuperClassCheckingAccountRepository = mappedSuperClassCheckingAccountRepository;
	}
	
	/**
	 * 
	 */
	@Override
	public List<MappedSuperClassSavingsAccount> getAllSavingsAccounts() {
		return mappedSuperClassSavingsAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putSavingsAccount(MappedSuperClassSavingsAccount savingsAccount) {
		mappedSuperClassSavingsAccountRepository.save(savingsAccount);
	}

	/**
	 * 
	 */
	@Override
	public List<MappedSuperClassCheckingAccount> getAllCheckingAccounts() {
		return mappedSuperClassCheckingAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putCheckingAccount(MappedSuperClassCheckingAccount checkingAccount) {
		mappedSuperClassCheckingAccountRepository.save(checkingAccount);
	}

}
