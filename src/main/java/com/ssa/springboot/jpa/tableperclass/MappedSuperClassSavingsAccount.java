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
@Table(name="mapped_super_class_savings_account")	
public class MappedSuperClassSavingsAccount extends MappedSuperClassBankAccount {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9171561826359930788L;
	
	private double annualInterestRate;

	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	@Override
	public String toString() {
		return "MappedSuperClassSavingsAccount [annualInterestRate=" + annualInterestRate + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
		
}
