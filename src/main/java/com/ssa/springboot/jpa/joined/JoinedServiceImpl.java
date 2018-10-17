/**
 * 
 */
package com.ssa.springboot.jpa.joined;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Umesh Kumar K.V
 *
 */
@Service
public class JoinedServiceImpl implements JoinedService {
	private JoinedBankAccountRepository joinedBankAccountRepository;
	private JoinedSavingsAccountRepository joinedSavingsAccountRepository;
	private JoinedCheckingAccountRepository joinedCheckingAccountRepository;

	/**
	 * @param joinedBankAccountRepository
	 * @param joinedSavingsAccountRepository
	 * @param JoinedCheckingAccountRepository
	 */
	@Autowired
	public JoinedServiceImpl(JoinedBankAccountRepository joinedBankAccountRepository,
			JoinedSavingsAccountRepository joinedSavingsAccountRepository, JoinedCheckingAccountRepository JoinedCheckingAccountRepository) {
		super();
		this.joinedBankAccountRepository = joinedBankAccountRepository;
		this.joinedSavingsAccountRepository = joinedSavingsAccountRepository;
		this.joinedCheckingAccountRepository = JoinedCheckingAccountRepository;
	}

	/**
	 * 
	 */
	@Override
	public List<JoinedBankAccount> getAllBankAccounts() {
		return joinedBankAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putBankAccount(JoinedBankAccount checkingAccount) {
		joinedBankAccountRepository.save(checkingAccount);
	}
	
	/**
	 * 
	 */
	@Override
	public List<JoinedSavingsAccount> getAllSavingsAccounts() {
		return joinedSavingsAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putSavingsAccount(JoinedSavingsAccount savingsAccount) {
		joinedSavingsAccountRepository.save(savingsAccount);
	}

	/**
	 * 
	 */
	@Override
	public List<JoinedCheckingAccount> getAllCheckingAccounts() {
		return joinedCheckingAccountRepository.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void putCheckingAccount(JoinedCheckingAccount checkingAccount) {
		joinedCheckingAccountRepository.save(checkingAccount);
	}

}
