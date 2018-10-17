/**
 * 
 */
package com.ssa.springboot.jpa.joined;

import java.util.List;

/**
 * @author Umesh Kumar K.V
 *
 */
public interface JoinedService {
	/**
	 * @return
	 */
	List<JoinedBankAccount> getAllBankAccounts();

	/**
	 * @param checkingAccount
	 */
	void putBankAccount(JoinedBankAccount checkingAccount);

	/**
	 * @return
	 */
	List<JoinedSavingsAccount> getAllSavingsAccounts();

	/**
	 * @param savingsAccount
	 */
	void putSavingsAccount(JoinedSavingsAccount savingsAccount);

	/**
	 * @return
	 */
	List<JoinedCheckingAccount> getAllCheckingAccounts();

	/**
	 * @param checkingAccount
	 */
	void putCheckingAccount(JoinedCheckingAccount checkingAccount);
}
