/**
 * 
 */
package com.ssa.springboot.jpa.singletable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Umesh Kumar K.V
 *
 */
@RestController
@RequestMapping("/singletable")
public class SingleTableController {
	private SingleTableService singleTableService;

	/**
	 * @param singleTableService
	 */
	@Autowired
	public SingleTableController(SingleTableService singleTableService) {
		super();
		this.singleTableService = singleTableService;
	}

	@GetMapping
	public List<BankAccount> getAllBankAccounts() {
		return singleTableService.getAllBankAccounts();
	}

	@PutMapping
	public void putBankAccount(@RequestBody BankAccount savingsAccount) {
		singleTableService.putBankAccount(savingsAccount);
	}
	
	@GetMapping(value = "/savings")
	public List<SavingsAccount> getAllSavingsAccounts() {
		return singleTableService.getAllSavingsAccounts();
	}

	@PutMapping(value = "/savings")
	public void putSavingsAccount(@RequestBody SavingsAccount savingsAccount) {
		singleTableService.putSavingsAccount(savingsAccount);
	}

	@GetMapping(value ="/checking")
	public List<CheckingAccount> getAllCheckingAccounts() {
		return singleTableService.getAllCheckingAccounts();
	}
	
	@PutMapping(value = "/checking")
	public void putCheckingAccount(@RequestBody CheckingAccount checkingAccount) {
		singleTableService.putCheckingAccount(checkingAccount);
	}
}
