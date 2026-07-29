package com.paridhi.SpringJPA.Projection.repository;

import com.paridhi.SpringJPA.Projection.dto.BloodGroupStats;
import com.paridhi.SpringJPA.Projection.dto.CPatientInfo;
import com.paridhi.SpringJPA.Projection.dto.PatientInfo;
import com.paridhi.SpringJPA.Projection.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query("select p.id as id, p.name as name, p.email as email from Patient p")
    List<PatientInfo> getPatientInfo();

    @Query("select new com.paridhi.SpringJPA.Projection.dto.CPatientInfo(p.id, p.name)" + " from Patient p")
    List<CPatientInfo> getAllPatientsInfoConcrete();

    @Query("select new com.paridhi.SpringJPA.Projection.dto.BloodGroupStats(p.bloodGroup, " + "COUNT(p)) from Patient p group by p.bloodGroup order by COUNT(p)")
    List<BloodGroupStats> getBloodGroupStats();
}

