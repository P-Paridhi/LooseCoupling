package com.paridhi.SpringJPA.Projection.repository;

import com.paridhi.SpringJPA.Projection.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}