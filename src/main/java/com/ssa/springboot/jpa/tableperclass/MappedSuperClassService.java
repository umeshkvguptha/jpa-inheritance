/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

import java.util.List;

/**
 * @author Umesh Kumar K.V
 *
 */
public interface MappedSuperClassService {	
	/**
	 * @return
	 */
	List<MappedSuperClassSavingsAccount> getAllSavingsAccounts();

	/**
	 * @param savingsAccount
	 */
	void putSavingsAccount(MappedSuperClassSavingsAccount savingsAccount);

	/**
	 * @return
	 */
	List<MappedSuperClassCheckingAccount> getAllCheckingAccounts();

	/**
	 * @param checkingAccount
	 */
	void putCheckingAccount(MappedSuperClassCheckingAccount checkingAccount);
}
