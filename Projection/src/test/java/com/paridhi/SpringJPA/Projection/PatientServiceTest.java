package com.paridhi.SpringJPA.Projection;

import com.paridhi.SpringJPA.Projection.dto.BloodGroupStats;
import com.paridhi.SpringJPA.Projection.dto.CPatientInfo;
import com.paridhi.SpringJPA.Projection.dto.PatientInfo;
import com.paridhi.SpringJPA.Projection.entities.Patient;
import com.paridhi.SpringJPA.Projection.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient(){
//        List<Patient> patientList = patientRepository.findAll();

        List<PatientInfo> patientList = patientRepository.getPatientInfo();
        for (PatientInfo p : patientList) {
            System.out.println("Id = " + p.getId());
            System.out.println("Name = " + p.getName());
            System.out.println("Email = " + p.getEmail());
        }

        List<CPatientInfo> patientListC = patientRepository.getAllPatientsInfoConcrete();
        for (CPatientInfo p : patientListC) {
            System.out.println(p);
        }

        List<BloodGroupStats> bloodGroupStats = patientRepository.getBloodGroupStats();
        for (BloodGroupStats p : bloodGroupStats) {
            System.out.println(p);
        }
    }
}
