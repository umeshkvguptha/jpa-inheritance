/**
 * 
 */
package com.ssa.springboot.jpa.joined;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Umesh Kumar K.V
 *
 */
@Entity
@Table(name = "joined_bank_account")
@Inheritance(strategy = InheritanceType.JOINED)
public class JoinedBankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4183113511705321354L;

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
		return "JoinedBankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
