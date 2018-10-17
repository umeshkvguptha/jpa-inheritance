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
@Table(name="table_per_class_savings_account")	
public class TablePerClassSavingsAccount extends TablePerClassBankAccount {

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
		return "TablePerClassSavingsAccount [annualInterestRate=" + annualInterestRate + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
