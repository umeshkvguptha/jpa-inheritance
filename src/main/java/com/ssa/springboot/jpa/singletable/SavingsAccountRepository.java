/**
 * 
 */
package com.ssa.springboot.jpa.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Umesh Kumar K.V
 *
 */
@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, String> {

}
