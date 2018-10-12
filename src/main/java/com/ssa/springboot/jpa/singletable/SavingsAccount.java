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
@DiscriminatorValue("2")
public class SavingsAccount extends BankAccount {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9037419558681308138L;

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
		return "SavingsAccount [annualInterestRate=" + annualInterestRate + ", getAccountNumber()=" + getAccountNumber()
				+ ", getBalance()=" + getBalance() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
