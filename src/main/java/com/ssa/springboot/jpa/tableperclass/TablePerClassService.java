/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

import java.util.List;

/**
 * @author Umesh Kumar K.V
 *
 */
public interface TablePerClassService {
	/**
	 * @return
	 */
	List<TablePerClassBankAccount> getAllBankAccounts();

	/**
	 * @param checkingAccount
	 */
	void putBankAccount(TablePerClassBankAccount checkingAccount);

	/**
	 * @return
	 */
	List<TablePerClassSavingsAccount> getAllSavingsAccounts();

	/**
	 * @param savingsAccount
	 */
	void putSavingsAccount(TablePerClassSavingsAccount savingsAccount);

	/**
	 * @return
	 */
	List<TablePerClassCheckingAccount> getAllCheckingAccounts();

	/**
	 * @param checkingAccount
	 */
	void putCheckingAccount(TablePerClassCheckingAccount checkingAccount);
}
