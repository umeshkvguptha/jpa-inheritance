/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Umesh Kumar K.V
 *
 */
@Entity	
@Table(name="mapped_super_class_checking_account")	
public class MappedSuperClassCheckingAccount extends MappedSuperClassBankAccount {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4340911739954672878L;
	
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
		return "MappedSuperClassCheckingAccount [insufficientFundsFee=" + insufficientFundsFee + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
