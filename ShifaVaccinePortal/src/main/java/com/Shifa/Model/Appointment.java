package com.Shifa.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private Long mobileno;
    private LocalDate dateofbooking;
    private Boolean bookingstatus;

    @Enumerated(EnumType.STRING)
    private Slot slot;

    @ManyToOne
    @JoinColumn(name = "center_id", referencedColumnName = "code")
    private VaccinationCenter center;


}
