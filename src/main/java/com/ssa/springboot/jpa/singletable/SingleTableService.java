/**
 * 
 */
package com.ssa.springboot.jpa.singletable;

import java.util.List;

/**
 * @author Umesh Kumar K.V
 *
 */
public interface SingleTableService {
	/**
	 * @return
	 */
	List<SingleTableBankAccount> getAllBankAccounts();

	/**
	 * @param checkingAccount
	 */
	void putBankAccount(SingleTableBankAccount checkingAccount);

	/**
	 * @return
	 */
	List<SavingsAccount> getAllSavingsAccounts();

	/**
	 * @param savingsAccount
	 */
	void putSavingsAccount(SavingsAccount savingsAccount);

	/**
	 * @return
	 */
	List<CheckingAccount> getAllCheckingAccounts();

	/**
	 * @param checkingAccount
	 */
	void putCheckingAccount(CheckingAccount checkingAccount);
}
