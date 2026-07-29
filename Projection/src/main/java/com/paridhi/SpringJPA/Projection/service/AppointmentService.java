package com.paridhi.SpringJPA.Projection.service;

import com.paridhi.SpringJPA.Projection.entities.Appointment;
import com.paridhi.SpringJPA.Projection.entities.Doctor;
import com.paridhi.SpringJPA.Projection.entities.Patient;
import com.paridhi.SpringJPA.Projection.repository.AppointmentRepository;
import com.paridhi.SpringJPA.Projection.repository.DoctorRepository;
import com.paridhi.SpringJPA.Projection.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);

        return appointment;
    }
}
