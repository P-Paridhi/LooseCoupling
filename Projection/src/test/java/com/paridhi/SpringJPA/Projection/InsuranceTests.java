package com.paridhi.SpringJPA.Projection;

import com.paridhi.SpringJPA.Projection.entities.Appointment;
import com.paridhi.SpringJPA.Projection.entities.Insurance;
import com.paridhi.SpringJPA.Projection.service.AppointmentService;
import com.paridhi.SpringJPA.Projection.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;
    @Test
    public void testAssignInsuranceToPatient() {
        Insurance insurance = Insurance.builder()
                .provider("HDFC Ergo")
                .policyNumber("HDFC_23G")
                .validUntil(LocalDate.of(2030, 1, 1))
                .build();

        var updatedInsurance =  insuranceService.assignInsuranceToPatient(insurance, 1L);
        System.out.println(updatedInsurance);
//        insuranceService.deletePatient(1L);

        var patient = insuranceService.removeInsurance(1L);
        System.out.println(patient);
    }

    @Test
    public void testCreateAppointment() {
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025, 11, 1, 14, 0, 0))
                .reason("Cough")
                .build();
        var updatedAppointment = appointmentService.createANewAppointment(appointment, 1L, 1L);
        System.out.println(updatedAppointment);
    }
}
