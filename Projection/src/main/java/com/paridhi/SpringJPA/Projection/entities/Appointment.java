package com.paridhi.SpringJPA.Projection.entities;

import com.sun.source.doctree.DocTree;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne(fetch = FetchType.LAZY) //owning side
    @JoinColumn(nullable = false)
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

}
