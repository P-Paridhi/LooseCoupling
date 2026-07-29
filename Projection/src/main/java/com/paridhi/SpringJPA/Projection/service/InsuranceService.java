package com.paridhi.SpringJPA.Projection.service;

import com.paridhi.SpringJPA.Projection.entities.Insurance;
import com.paridhi.SpringJPA.Projection.entities.Patient;
import com.paridhi.SpringJPA.Projection.repository.InsuranceRepository;
import com.paridhi.SpringJPA.Projection.repository.PatientRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;

    private final PatientRepository patientRepository;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);
        insurance.setPatient(patient);

        return insurance;
    }

    @Transactional
    public void deletePatient(Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patientRepository.deleteById(patientId);
    }

    @Transactional
    public Patient removeInsurance(Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(null);

        return patient;
    }
}
