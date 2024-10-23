package com.Shifa.Model;
import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    private Long mobileno;
    private LocalDate dateofregistration;

    @OneToOne
    @JoinColumn(name = "member_id", referencedColumnName = "memberId")
    private Member member;


}