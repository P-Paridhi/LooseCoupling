package com.paridhi.SpringJPA.Projection.repository;

import com.paridhi.SpringJPA.Projection.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}