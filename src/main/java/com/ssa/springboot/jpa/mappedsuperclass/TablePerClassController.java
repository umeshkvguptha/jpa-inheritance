/**
 * 
 */
package com.ssa.springboot.jpa.mappedsuperclass;

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
@RequestMapping("/tableperclass")
public class TablePerClassController {
	private TablePerClassService tablePerClassService;

	/**
	 * @param tablePerClassService
	 */
	@Autowired
	public TablePerClassController(TablePerClassService tablePerClassService) {
		super();
		this.tablePerClassService = tablePerClassService;
	}

	@GetMapping
	public List<TablePerClassBankAccount> getAllBankAccounts() {
		return tablePerClassService.getAllBankAccounts();
	}

	@PutMapping
	public void putBankAccount(@RequestBody TablePerClassBankAccount savingsAccount) {
		tablePerClassService.putBankAccount(savingsAccount);
	}
	
	@GetMapping(value = "/savings")
	public List<TablePerClassSavingsAccount> getAllSavingsAccounts() {
		return tablePerClassService.getAllSavingsAccounts();
	}

	@PutMapping(value = "/savings")
	public void putSavingsAccount(@RequestBody TablePerClassSavingsAccount savingsAccount) {
		tablePerClassService.putSavingsAccount(savingsAccount);
	}

	@GetMapping(value ="/checking")
	public List<TablePerClassCheckingAccount> getAllCheckingAccounts() {
		return tablePerClassService.getAllCheckingAccounts();
	}
	
	@PutMapping(value = "/checking")
	public void putCheckingAccount(@RequestBody TablePerClassCheckingAccount checkingAccount) {
		tablePerClassService.putCheckingAccount(checkingAccount);
	}
}
