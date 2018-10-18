/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Umesh Kumar K.V
 *
 */
@MappedSuperclass
public class MappedSuperClassBankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4243728491049976085L;

	@Id
	private String accountNumber;
	private BigDecimal balance;

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "MappedSuperClassBankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
