package com.paridhi.SpringJPA.Projection.repository;

import com.paridhi.SpringJPA.Projection.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}