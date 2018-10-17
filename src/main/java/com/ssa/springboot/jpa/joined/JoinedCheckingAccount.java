/**
 * 
 */
package com.ssa.springboot.jpa.joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Umesh Kumar K.V
 *
 */
@Entity
@Table(name = "joined_checking_account")
@PrimaryKeyJoinColumn(name = "checkingId")
public class JoinedCheckingAccount extends JoinedBankAccount {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7777205557241110910L;

	private double insufficientFundsFee;

	/**
	 * @return the insufficientFundsFee
	 */
	public double getInsufficientFundsFee() {
		return insufficientFundsFee;
	}

	/**
	 * @param insufficientFundsFee the insufficientFundsFee to set
	 */
	public void setInsufficientFundsFee(double insufficientFundsFee) {
		this.insufficientFundsFee = insufficientFundsFee;
	}

	@Override
	public String toString() {
		return "JoinedCheckingAccount [insufficientFundsFee=" + insufficientFundsFee + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
