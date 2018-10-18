/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

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
@RequestMapping("/mappedsuperclass")
public class MappedSuperClassController {
	private MappedSuperClassService mappedSuperClassService;

	/**
	 * @param mappedSuperClassService
	 */
	@Autowired
	public MappedSuperClassController(MappedSuperClassService mappedSuperClassService) {
		super();
		this.mappedSuperClassService = mappedSuperClassService;
	}
	
	@GetMapping(value = "/savings")
	public List<MappedSuperClassSavingsAccount> getAllSavingsAccounts() {
		return mappedSuperClassService.getAllSavingsAccounts();
	}

	@PutMapping(value = "/savings")
	public void putSavingsAccount(@RequestBody MappedSuperClassSavingsAccount savingsAccount) {
		mappedSuperClassService.putSavingsAccount(savingsAccount);
	}

	@GetMapping(value ="/checking")
	public List<MappedSuperClassCheckingAccount> getAllCheckingAccounts() {
		return mappedSuperClassService.getAllCheckingAccounts();
	}
	
	@PutMapping(value = "/checking")
	public void putCheckingAccount(@RequestBody MappedSuperClassCheckingAccount checkingAccount) {
		mappedSuperClassService.putCheckingAccount(checkingAccount);
	}
}
