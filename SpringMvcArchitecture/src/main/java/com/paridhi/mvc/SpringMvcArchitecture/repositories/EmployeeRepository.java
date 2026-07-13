package com.paridhi.mvc.SpringMvcArchitecture.repositories;

import com.paridhi.mvc.SpringMvcArchitecture.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
