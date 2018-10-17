/**
 * 
 */
package com.ssa.springboot.jpa.joined;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Umesh Kumar K.V
 *
 */
@Repository
public interface JoinedSavingsAccountRepository extends JpaRepository<JoinedSavingsAccount, String> {

}
