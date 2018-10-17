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
@Table(name = "joined_savings_account")
@PrimaryKeyJoinColumn(name = "savingsId")
public class JoinedSavingsAccount extends JoinedBankAccount {

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
		return "JoinedSavingsAccount [annualInterestRate=" + annualInterestRate + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
