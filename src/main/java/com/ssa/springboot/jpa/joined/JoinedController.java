/**
 * 
 */
package com.ssa.springboot.jpa.joined;

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
@RequestMapping("/joined")
public class JoinedController {
	private JoinedService joinedService;

	/**
	 * @param joinedService
	 */
	@Autowired
	public JoinedController(JoinedService joinedService) {
		super();
		this.joinedService = joinedService;
	}

	@GetMapping
	public List<JoinedBankAccount> getAllBankAccounts() {
		return joinedService.getAllBankAccounts();
	}

	@PutMapping
	public void putBankAccount(@RequestBody JoinedBankAccount savingsAccount) {
		joinedService.putBankAccount(savingsAccount);
	}
	
	@GetMapping(value = "/savings")
	public List<JoinedSavingsAccount> getAllSavingsAccounts() {
		return joinedService.getAllSavingsAccounts();
	}

	@PutMapping(value = "/savings")
	public void putSavingsAccount(@RequestBody JoinedSavingsAccount savingsAccount) {
		joinedService.putSavingsAccount(savingsAccount);
	}

	@GetMapping(value ="/checking")
	public List<JoinedCheckingAccount> getAllCheckingAccounts() {
		return joinedService.getAllCheckingAccounts();
	}
	
	@PutMapping(value = "/checking")
	public void putCheckingAccount(@RequestBody JoinedCheckingAccount checkingAccount) {
		joinedService.putCheckingAccount(checkingAccount);
	}
}
