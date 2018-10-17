/**
 * 
 */
package com.ssa.springboot.jpa.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Umesh Kumar K.V
 *
 */
@Repository
public interface TablePerClassSavingsAccountRepository extends JpaRepository<TablePerClassSavingsAccount, String> {

}
