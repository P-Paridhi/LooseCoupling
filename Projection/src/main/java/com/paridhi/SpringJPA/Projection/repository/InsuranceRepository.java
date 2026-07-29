package com.paridhi.SpringJPA.Projection.repository;

import com.paridhi.SpringJPA.Projection.entities.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}