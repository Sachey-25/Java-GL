package org.globalLogic.springboot.repository;

import org.globalLogic.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Spring Data JPA internally provides @Repository Annotation
 * so we no need to add @Repository annotation to EmployeeRepository interface
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
