/**
 * 
 */
package com.ssa.springboot.jpa.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Umesh Kumar K.V
 *
 */
@Repository
public interface TablePerClassCheckingAccountRepository extends JpaRepository<TablePerClassCheckingAccount, String> {

}
