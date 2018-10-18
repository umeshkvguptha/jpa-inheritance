/**
 * 
 */
package com.ssa.springboot.jpa.mappedsuperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Umesh Kumar K.V
 *
 */
@Entity	
@Table(name="table_per_class_checking_account")	
public class TablePerClassCheckingAccount extends TablePerClassBankAccount {

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
		return "TablePerClassCheckingAccount [insufficientFundsFee=" + insufficientFundsFee + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
