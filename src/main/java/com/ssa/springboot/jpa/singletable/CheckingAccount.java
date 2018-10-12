/**
 * 
 */
package com.ssa.springboot.jpa.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Umesh Kumar K.V
 *
 */
@Entity	
@DiscriminatorValue("1")	
public class CheckingAccount extends BankAccount {

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
		return "CheckingAccount [insufficientFundsFee=" + insufficientFundsFee + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
